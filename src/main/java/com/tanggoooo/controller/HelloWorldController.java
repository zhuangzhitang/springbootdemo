package com.tanggoooo.controller;

import com.tanggoooo.common.TangGoooProperties;
import com.tanggoooo.model.ResultData;
import com.tanggoooo.result.AjaxResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private static Log LOG = LogFactory.getLog(HelloWorldController.class);

    @Autowired
    private TangGoooProperties tangGoooProperties;

    @GetMapping("/getTangGoooProperties")
    public Object getTangGoooProperties(){
        LOG.info(tangGoooProperties.getName()+"---"+tangGoooProperties.getProject());
        return new AjaxResult().setData(tangGoooProperties);
    }

    @GetMapping("/index")
    public Object index(){
        return "index";
    }

    @GetMapping("/hello")
    public Object hello(){
        return new ResultData("123","123d",true);
    }
}
