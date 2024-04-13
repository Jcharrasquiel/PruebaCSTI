package com.prueba.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.prueba.demo.model.ErrorResponse;

public class ErrorResponseTest {

    @Test
    public void testGetMessage() {
        //Arrange
        String message = "Error en la solicitud";
        //Act
        ErrorResponse errorResponse = new ErrorResponse(message);
        //Assert
        assertEquals(message, errorResponse.getMessage());
    }

    @Test
    public void testSetMessage() {
        //Arrange
        String message = "Error en la solicitud";
        //Act
        ErrorResponse errorResponse = new ErrorResponse("");
        errorResponse.setMessage(message);
        //Assert
        assertEquals(message, errorResponse.getMessage());
    }
}