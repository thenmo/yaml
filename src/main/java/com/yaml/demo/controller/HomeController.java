package com.yaml.demo.controller;

import com.yaml.demo.constant.ConfigProperties;
import com.yaml.demo.constant.ConfigValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Resource
    private ConfigValue configValue;

    @Resource
    private ConfigProperties configProperties;

    @Resource
    private Environment environment;

    //从配置文件读取变量imagesUrlHost
    @Value("${app.goods.imagesUrlHost}")
    private String imagesUrlHost;

    //三种方式打印从配置文件中读取到的变量值
    @GetMapping("/home")
    @ResponseBody
    public String home() {

        String res = "第一种方法:直接用value引用:"+imagesUrlHost+":<br/>";
        res += "第二种方法:封装到Component类中,Value注解:"+configValue.imagesUrlHost+":<br/>";
        res += "第三种方法:封装到Component类中,ConfigurationProperties注解:"+configProperties.getImagesUrlHost()+":<br/>";
        res += "第四种方法:environment:"+environment.getProperty("app.goods.imagesUrlHost")+":<br/>";

        System.out.println("图片类型:extendNames:");
        List<String> list = configProperties.getExtendNames();
        for (int i = 0; i < list.size(); i++) {
            String s = (String)list.get(i);
            System.out.println(i+":"+s);
        }

        System.out.println("图片类型2:extendNames2:");
        for (int i = 0; i < configValue.extendNames2.length; i++){
            System.out.println(i+":"+configValue.extendNames2[i]);
        }

        return res;
    }
}