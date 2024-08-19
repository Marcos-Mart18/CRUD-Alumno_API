package pe.edu.upeu.LP2_clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.LP2_clase01.dao.AlumnoDao;
import pe.edu.upeu.LP2_clase01.entity.Alumno;
import pe.edu.upeu.LP2_clase01.repository.AlumnoRepository;
@Component
public class AlumnoDaoImpl implements AlumnoDao {

	
	@Autowired
	private AlumnoRepository alumnoRepository;
	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);
	}

	@Override
	public Alumno read(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id).get();
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

}
