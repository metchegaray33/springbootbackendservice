package com.dnh.clase3restfullbackend.controller;


import com.dnh.clase3restfullbackend.dominio.Empleado;
import com.dnh.clase3restfullbackend.persistencia.RepositorioEmpleados;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmpleadosControlador {

    private final RepositorioEmpleados repositorioEmpleados;

    public EmpleadosControlador(RepositorioEmpleados repositorioEmpleados) {
        this.repositorioEmpleados = repositorioEmpleados;
    }

    @GetMapping("/empleados")
    public List<Empleado> obtenerTodos() {
        return (List<Empleado>) repositorioEmpleados.findAll();
    }

    @PostMapping("/empleados")
    public Empleado grabarEmpleado(@RequestBody Empleado empleado) {   
            return repositorioEmpleados.save(empleado);
    }

    @GetMapping("/empleados/{id}")
    public Empleado obtenerEmpleado(@PathVariable Long id) {
        return repositorioEmpleados.findById(id)
                .orElseThrow(() -> new EmpleadoNoEncontradoException(id));
    }

    @PutMapping("/empleados/{id}")
    public Empleado actualizarEmpleado(@RequestBody  Empleado empleado, @PathVariable Long id) {
    	
    	 return repositorioEmpleados.save(empleado);
    			 
    	
    }

    @DeleteMapping("/empleados/{id}")
    public void borrarEmpleado(@PathVariable Long id) {    	
        repositorioEmpleados.findById(id)
                .map(empleado -> {
                    repositorioEmpleados.deleteById(id);
                    return empleado;
                })
                .orElseThrow(() -> new EmpleadoNoEncontradoException(id));




    }

}
