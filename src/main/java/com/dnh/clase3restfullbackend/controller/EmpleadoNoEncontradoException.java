package com.dnh.clase3restfullbackend.controller;

public class EmpleadoNoEncontradoException extends RuntimeException {

    public EmpleadoNoEncontradoException(Long id) {    
        super("Empleado con ID: " + id+ " no existe");
    	System.out.println("hola");
    }
}
