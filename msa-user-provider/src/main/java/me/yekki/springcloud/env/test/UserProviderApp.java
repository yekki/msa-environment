package me.yekki.springcloud.env.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.ResourceUtils;

import java.util.Properties;

@SpringBootApplication
@EnableEurekaClient
public class UserProviderApp {

    public static void main(String[] args) {

        SpringApplication.run(UserProviderApp.class, args);
    }
}
