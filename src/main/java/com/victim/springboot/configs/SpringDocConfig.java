package com.victim.springboot.configs;


import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot REST API Documentation",
                description = "Spring Boot REST API Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Victim",
                        email = "mvpvictim@gmail.com",
                        url = "https://www.victim.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.victim.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot User Management Documentation",
                url = "https://www.victim.com"
        )
)
public class SpringDocConfig {

    // if you add that dependency it starts working automatically
    // you the set general custom information mu config using annotations
    // you the put annotations in the controller for information
    // you can also put in the dto using annotations
    // you access swagger-ui/index.html
}
