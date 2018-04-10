package com.example.demo;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})
public class SwaggerConfig {

	@Bean
    public Docket apiRepo() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .groupName("API Repo")
          .select()
          .apis(RequestHandlerSelectors.basePackage("com.example.demo.repositories"))
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());
    }
    
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "REST API", 
          "Documentação da API", 
          "API", 
          "Terms of service", 
          new Contact("", "https://github.com/luizgustavoss", ""), 
          "License of API", "https://github.com/luizgustavoss", Collections.emptyList());
   }
}
