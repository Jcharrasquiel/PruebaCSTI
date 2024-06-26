package com.prueba.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class AppConfigTest {

    @Test
    public void testRestTemplateBeanCreation() {
        //Arrange
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //Act
        RestTemplate restTemplate = context.getBean(RestTemplate.class);
        //Assert
        assertNotNull(restTemplate);
    }
}
