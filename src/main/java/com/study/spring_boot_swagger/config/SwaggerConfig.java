package com.study.spring_boot_swagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(title = "SWAGGER TEST API 명세서",
        description = "사용자 어플 서비스 API 명세서",
        version = "v1"))
@Configuration
public class SwaggerConfig {

}
