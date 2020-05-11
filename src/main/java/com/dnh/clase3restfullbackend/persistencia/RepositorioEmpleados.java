package com.dnh.clase3restfullbackend.persistencia;

import com.dnh.clase3restfullbackend.dominio.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//public interface RepositorioEmpleados extends CrudRepository<Empleado, Long> {
public interface RepositorioEmpleados extends JpaRepository<Empleado, Long> {
}
