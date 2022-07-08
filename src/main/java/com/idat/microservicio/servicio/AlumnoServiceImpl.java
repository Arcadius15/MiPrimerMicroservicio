package com.idat.microservicio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicio.modelo.Alumno;
import com.idat.microservicio.repository.AlumnoRespository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	private AlumnoRespository respository;
	
	/*
	 * private static List<Alumno> lista = new ArrayList<>(); static { lista.add(new
	 * Alumno(1,"Juan","Perez",30,"21/11/2000")); lista.add(new
	 * Alumno(2,"Adrian","Galvez",40,"12/09/2000")); lista.add(new
	 * Alumno(3,"Serena","Luque",11,"09/01/2000")); }
	 */

	@Override
	public List<Alumno> listarAlumnos() {
		return respository.findAll();
	}

	@Override
	public Alumno obtenerAlumnos(Integer id) {
		// TODO Auto-generated method stub
		return respository.findById(id).orElse(null);
	}

	@Override
	public void guardarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		respository.save(alumno);
	}

	@Override
	public void editarAlumno(Alumno alumno) {
		respository.saveAndFlush(alumno);
	}

	@Override
	public void eliminarAlumno(Integer id) {
		respository.deleteById(id);
		
	}

}
