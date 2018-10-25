package me.yekki.springcloud.env;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulProxyApp {

    @ConfigurationProperties("zuul")
    @RefreshScope
    public ZuulProperties zuulProperties() {

        return new ZuulProperties();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulProxyApp.class, args);
    }
}
