package co.edu.usco.pw.springboot_crud01.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Clase;
import co.edu.usco.pw.springboot_crud01.model.EstadoClase;
import co.edu.usco.pw.springboot_crud01.repository.ClaseRepository;

@Service
public class ClaseService implements IClaseService {

	@Autowired
	private ClaseRepository claseRepository;

	@Override
	public List<Clase> getClaseByNombre(String nombre) {
		return claseRepository.findByNombre(nombre);
	}

	@Override
	public Optional<Clase> getClaseById(long id) {
		return claseRepository.findById(id);
	}

	@Override
	public void updateClase(Clase clase) {
		claseRepository.save(clase);
	}

	@Override
	public void addClase(String nombre, int horario, String nombreDocente, String salon, EstadoClase estado, boolean isDone) {
	    claseRepository.save(new Clase(nombre, horario, nombreDocente, salon, estado));
	}


	@Override
	public void deleteClase(long id) {
		Optional<Clase> clase = claseRepository.findById(id);
		if (clase.isPresent()) {
			claseRepository.delete(clase.get());
		}
	}

	@Override
	public void saveClase(Clase clase) {
		claseRepository.save(clase);
	}
}