package me.yekki.springcloud.env.test.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "app")
@Data
@Component
@RefreshScope
public class AppProperties {
    private String author;
    private String email;
}

