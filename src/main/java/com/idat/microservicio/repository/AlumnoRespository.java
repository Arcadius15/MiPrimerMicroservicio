package com.idat.microservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.microservicio.modelo.Alumno;

@Repository
public interface AlumnoRespository extends JpaRepository<Alumno, Integer>{

}
