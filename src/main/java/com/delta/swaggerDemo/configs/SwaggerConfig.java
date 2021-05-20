package com.delta.swaggerDemo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment) {
        // Set up the wanted environment
        Profiles profiles = Profiles.of("dev", "test");
        // Check it is true or not
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .groupName("Molly-1")   // Change default group name
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.delta.swaggerDemo.controllers"))
                .paths(PathSelectors.any())
                .build();
    }

    // Set up the Swagger Info
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Web API Document",
                "Restful APIs Document",
                "1.0",
                "https://petstore.swagger.io/",
                new Contact("Molly Huang", "", "molly.h@deltaww.com"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<VendorExtension>());
    }
}