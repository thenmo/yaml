package com.yaml.demo.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * 从配置文件中读取的变量
 *  lhd
 *  2020.10.15
 * */
@Component
public class ConfigValue {
    //imagesUrlHost
    @Value("${app.goods.imagesUrlHost}")
    public String imagesUrlHost;

    //imagesOrigDir
    @Value("${app.goods.imagesOrigDir}")
    public String imagesOrigDir;

    //imagesTmbDir
    @Value("${app.goods.imagesTmbDir}")
    public String imagesTmbDir;

    @Value("${app.goods.extendNames2}")
    public String[] extendNames2;
}