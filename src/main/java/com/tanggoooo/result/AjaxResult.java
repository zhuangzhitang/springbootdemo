package com.tanggoooo.result;


import com.tanggoooo.exception.IdtWebError;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chencheng on 2017/1/11
 */
public class AjaxResult extends HashMap<String, Object> {

    //TODO::深度依赖了，后面需要统一throw
    @Deprecated
    public static final String COMMON_ERROR = "接口调用出错";

    public static final String MESSAGE = "message";
    public static final String SUCCESS = "success";
    public static final String DATA = "data";
    public static final String CODE = "code";

    public static final AjaxResult BLANK_SUCCESS = new AjaxResult().setSuccess(true);

    private static final Map<IdtWebError, AjaxResult> map = new HashMap<>();

    public static AjaxResult fixedError(IdtWebError idtWebError) {
        if (map.get(idtWebError) == null) {
            synchronized (AjaxResult.class) {
                map.computeIfAbsent(idtWebError, e -> new AjaxResult().setState(e));
            }
        }
        return map.get(idtWebError);
    }

    public AjaxResult() {
        put(MESSAGE, "");
        put(SUCCESS, false);
    }

    public AjaxResult setState(IdtWebError idtWebError) {
        put(MESSAGE, idtWebError.errMsg);
        put(CODE, idtWebError.code);
        put(SUCCESS, false);
        return this;
    }

    private AjaxResult setCode(int code) {
        put(CODE, code);
        return this;
    }

    public AjaxResult setMessage(String msg) {
        setSuccess(false);
        put(MESSAGE, msg);
        return this;
    }

    public AjaxResult setSuccess(boolean ret) {
        put(SUCCESS, ret);
        return this;
    }

    public AjaxResult setData(Object obj) {
        setSuccess(true);
        put(DATA, obj);
        return this;
    }

}