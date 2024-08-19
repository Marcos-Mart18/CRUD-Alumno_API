package pe.edu.upeu.LP2_clase01.service;

import java.util.List;

import pe.edu.upeu.LP2_clase01.entity.Alumno;

public interface AlumnoService {
	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Alumno read(Long id);
	List<Alumno> readAll();
}
