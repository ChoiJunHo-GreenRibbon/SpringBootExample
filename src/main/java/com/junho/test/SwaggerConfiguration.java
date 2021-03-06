package com.junho.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        String version = "V1";
        String title = "test";
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .groupName(version)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.junho.test"))
                .paths(PathSelectors.ant("/api/**"))
                .build()
                .apiInfo(apiInfo(title, version));
    }

    private ApiInfo apiInfo(String title, String version) {
        return new ApiInfo(title
                , "Swagger API Docs"
                , version
                , "localhost:8090"
                , new Contact("Contact Me", "www.example.com", "foo@example.com")
                , "Licenses"
                , "localhost:8090"
                , new ArrayList<>());
    }
}
