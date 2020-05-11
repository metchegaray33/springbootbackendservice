package com.dnh.clase3restfullbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmpleadoNoEncontradoAdvice {


    @ExceptionHandler(EmpleadoNoEncontradoException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String empleadoNoEncontradoHandler(EmpleadoNoEncontradoException e) {
        return e.getMessage();
    }

}
