package com.example.openapi.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * spingdoc-openapi 配置
 *
 * @author XuYang
 * @date 2020/8/28 14:40
 */
@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SpringDoc-OpenAPI")
                        .description("SpringDoc-OpenAPI sample application")
                        .version("v0.0.1")
                        .license(new License()
                                .name("Apache2.0")
                                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentation")
                        .url("http://xuyang.run/blog"));
    }

}
