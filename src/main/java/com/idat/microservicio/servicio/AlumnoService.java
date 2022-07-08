package com.idat.microservicio.servicio;

import java.util.List;

import com.idat.microservicio.modelo.Alumno;

public interface AlumnoService {

	public List<Alumno> listarAlumnos();
	public Alumno obtenerAlumnos(Integer id);
	public void guardarAlumno(Alumno alumno);
	public void editarAlumno(Alumno alumno);
	public void eliminarAlumno(Integer id);
	
}
