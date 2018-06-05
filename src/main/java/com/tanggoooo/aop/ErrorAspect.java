package com.tanggoooo.aop;

import com.tanggoooo.exception.IdtWebError;
import com.tanggoooo.result.AjaxResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

@Aspect
@Component
public class ErrorAspect {
    private static Log LOG = LogFactory.getLog(ErrorAspect.class);
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("within(com.tanggoooo.controller.*)")
    public void point() {
    }


    @Before("point()")
    public void doBefore(JoinPoint joinPoint){
        startTime.set(System.currentTimeMillis());

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        LOG.info("URL : " + request.getRequestURL().toString());
        LOG.info("HTTP_METHOD : " + request.getMethod());
        LOG.info("IP : " + request.getRemoteAddr());
        LOG.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        LOG.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "point()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        LOG.info("RESPONSE : " + ret);
        LOG.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }

    @Around("point()")
    public Object aroundController(ProceedingJoinPoint pjp) {
        Object res =new Object() ;
        try {
             res = pjp.proceed();
//            LOG.info(res);
            if (res == AjaxResult.BLANK_SUCCESS || (res instanceof Map && ((Map) res).containsKey(AjaxResult.SUCCESS))) {
                return res;
            }
            return new AjaxResult().setData(res);
        }catch (Exception e){
            LOG.info("Exception:" );
            LOG.info(e.getMessage());
            return AjaxResult.fixedError(IdtWebError.COMMON);
        }catch (Throwable throwable) {
            LOG.info("Throwable:" );
            LOG.error(throwable.getMessage(), throwable);
            return AjaxResult.fixedError(IdtWebError.COMMON);
        }

    }
}
