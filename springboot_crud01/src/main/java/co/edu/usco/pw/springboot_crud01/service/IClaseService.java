package co.edu.usco.pw.springboot_crud01.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import co.edu.usco.pw.springboot_crud01.model.Clase;
import co.edu.usco.pw.springboot_crud01.model.EstadoClase;

public interface IClaseService {

	List<Clase> getClaseByNombre(String nombre);

	Optional<Clase> getClaseById(long id);

	void updateClase(Clase clase);

	void addClase(String nombre, int horario, String nombreDocente, String salon, EstadoClase estado, boolean isDone);

	void deleteClase(long id);
	
	void saveClase(Clase clase);

}