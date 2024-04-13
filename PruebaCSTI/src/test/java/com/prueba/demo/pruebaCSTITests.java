package com.prueba.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class pruebaCSTITests {

	@Test
    void testMain() {
        //Arrange
        mockStatic(SpringApplication.class);
        when(SpringApplication.run(pruebaCSTI.class, new String[] {})).thenReturn(null);
        //Act
        pruebaCSTI.main(new String[] {});
        //Assert
        verify(SpringApplication.class);
        SpringApplication.run(pruebaCSTI.class, new String[] {});

    }

    @Test
    void contextLoads() {
        pruebaCSTI aplication = new pruebaCSTI();
        assertNotNull(aplication);
    }


}
