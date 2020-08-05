package com.sundata.springcloud.cloudtemplate.templatezipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @description:
 * @author: liwei
 * @create: 2020-08-03 16:51
 **/
@EnableZipkinServer
@EnableEurekaClient
@SpringBootApplication
public class ZipKinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
