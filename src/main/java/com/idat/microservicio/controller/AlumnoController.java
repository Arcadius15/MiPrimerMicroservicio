package com.idat.microservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.microservicio.modelo.Alumno;
import com.idat.microservicio.servicio.AlumnoService;

@Controller
@RequestMapping("/api/v1/alumno")
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
	
	@GetMapping("/hola")
	public @ResponseBody String holamundo() {
		return "Hola Mundo";
	}

	@GetMapping("/listar")
	public @ResponseBody List<Alumno> listar(){
		return service.listarAlumnos();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Alumno obtenerAlumno(@PathVariable int id ) {
		return service.obtenerAlumnos(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarAlumno(@RequestBody Alumno alumno) {
		service.guardarAlumno(alumno);
	}
	
	@PutMapping("/actualizar/{id}")
	public @ResponseBody void editarAlumno(@PathVariable int id,@RequestBody Alumno alumno) {
		Alumno a = service.obtenerAlumnos(id);
		if (a!=null) {
			service.editarAlumno(alumno);
		}
		
	}

	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminarAlumno(@PathVariable Integer id) {
		service.eliminarAlumno(id);
	}

}
