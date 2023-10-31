package co.edu.usco.pw.springboot_crud01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.usco.pw.springboot_crud01.model.Clase;

public interface ClaseRepository extends JpaRepository<Clase, Long>{
	List<Clase> findByNombre(String nombre);
}
