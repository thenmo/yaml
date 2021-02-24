package com.yaml.demo.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * 从配置文件中读取的变量
 *  lhd
 *  2020.10.15
 * */
@Component
@ConfigurationProperties(prefix = "app.goods")
public class ConfigProperties {
    //imagesUrlHost
    //@Value("${app.goods.imagesUrlHost}")
    private String imagesUrlHost;

    public String getImagesUrlHost() {
        return this.imagesUrlHost;
    }

    public void setImagesUrlHost(String imagesUrlHost) {
        this.imagesUrlHost = imagesUrlHost;
    }


    private List<String> extendNames;

    public List<String> getExtendNames() {
        return this.extendNames;
    }

    public void setExtendNames(List<String> extendNames) {
        this.extendNames = extendNames;
    }

}