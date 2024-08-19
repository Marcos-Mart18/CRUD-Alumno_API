package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import pe.edu.upeu.LP2_clase01.entity.Alumno;
@Component
public interface AlumnoDao {
	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Alumno read(Long id);
	List<Alumno> readAll();
}
