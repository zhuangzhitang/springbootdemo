package com.tanggoooo.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhitang
 * 配置属于自己自定义的配置信息
 * @date 2018/7/16
 */
@Component
public class TangGoooProperties {

    @Value("${com.tanggoooo.springdemo.name}")
    private String name ;

    @Value("${com.tanggoooo.springdemo.project}")
    private String project ;

    @Value("${com.tanggoooo.springdemo.desc}")
    private String desc;

    @Value("${com.tanggoooo.springdemo.randomCodeIn100}")
    private Integer randCodeIn100;

    @Value("${com.tanggoooo.springdemo.randomCodeIn10To20}")
    private Integer randomCodeIn10To20;

    @Value("${com.tanggoooo.springdemo.enviroment}")
    private String environment;

    public TangGoooProperties() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getRandCodeIn100() {
        return randCodeIn100;
    }

    public void setRandCodeIn100(Integer randCodeIn100) {
        this.randCodeIn100 = randCodeIn100;
    }

    public Integer getRandomCodeIn10To20() {
        return randomCodeIn10To20;
    }

    public void setRandomCodeIn10To20(Integer randomCodeIn10To20) {
        this.randomCodeIn10To20 = randomCodeIn10To20;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
