package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许跨域的域名，可以写*，*代表所有域名，但是不能携带cookie，所以这里不写*，有需要的域名就写域名。
        corsConfiguration.addAllowedOrigin("http://manager.gmall.com");
        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        corsConfiguration.addAllowedOrigin("http://127.0.0.1:1000");
        // 允许跨域请求的方法，这里*代表允许所有类型的方法。
        corsConfiguration.addAllowedMethod("*");
        // 允许携带的头信息，*代表所有
        corsConfiguration.addAllowedHeader("*");
        // 允许携带cookie，true代表允许
        corsConfiguration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        // 配置白名单
        // path：拦截路径，*代表所有；
        // corsConfiguration代表白名单；
        configurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(configurationSource);
    }
}
