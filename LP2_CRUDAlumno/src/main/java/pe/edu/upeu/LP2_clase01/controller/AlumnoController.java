package pe.edu.upeu.LP2_clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.LP2_clase01.entity.Alumno;
import pe.edu.upeu.LP2_clase01.service.AlumnoService;

@RestController
@RequestMapping("api/v1/alumnos")
public class AlumnoController {
	@Autowired
	private AlumnoService alumnoService;

	@GetMapping
	public ResponseEntity<List<Alumno>> readAll() {
		try {
			List<Alumno> alumnos = alumnoService.readAll();
			if (alumnos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(alumnos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping
	public ResponseEntity<Alumno> crear(@Validated @RequestBody Alumno alu) {
		try {
			Alumno a = alumnoService.create(alu);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Alumno> getAlumnoId(@PathVariable("id") Long id) {
		try {
			Alumno a = alumnoService.read(id);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Alumno> delAlumno(@PathVariable("id") Long id) {
		try {
			alumnoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAlumno(@PathVariable("id") Long id, @Validated @RequestBody Alumno alu) {
		Alumno a = alumnoService.read(id);
		if(id>0) {
			return new ResponseEntity<>(alumnoService.update(alu), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
