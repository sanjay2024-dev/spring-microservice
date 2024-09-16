package com.question.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class SpringFoxConfig {

        @Bean
        public OpenAPI customOpenAPI() {
            return new OpenAPI()
                    .info(new Info()
                            .title("User API")
                            .version("1.0")
                            .description("This is a sample User API documentation")
                            .contact(new Contact()
                                    .name("John Doe")
                                    .email("johndoe@example.com")
                                    .url("https://example.com")));
        }
    }