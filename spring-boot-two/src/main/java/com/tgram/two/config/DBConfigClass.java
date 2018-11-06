package com.tgram.two.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:properties/db.properties")
@ConfigurationProperties(prefix = "jdbc.mysql")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Configuration
public class DBConfigClass {

    private String driverClass;

    private String url;

    private String username;

    private String password;
}
