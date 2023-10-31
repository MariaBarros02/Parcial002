package co.edu.usco.pw.springboot_crud01.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clase")
@Data // Genera getters, setters, toString, equals, y hashCode
@NoArgsConstructor // Crea un constructor sin argumentos
@AllArgsConstructor // Crea un constructor con todos los campos
public class Clase implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    @Size(max = 20, message = "Ingresar maximo 20 caracteres.")
    private String nombre;

    @NotEmpty
    private int horario; 
    
    @NotEmpty
    @Size(max = 100, message = "Ingresar maximo 100 caracteres")
    private String nombreDocente;

    @NotEmpty
    private String salon; 
    
    
    
    
    
	public Clase(@NotEmpty @Size(max = 20, message = "Ingresar maximo 20 caracteres.") String nombre,
			@NotEmpty int horario,
			@NotEmpty @Size(max = 100, message = "Ingresar maximo 100 caracteres") String nombreDocente,
			@NotEmpty String salon, @NotEmpty EstadoClase estado) {
		super();
		this.nombre = nombre;
		this.horario = horario;
		this.nombreDocente = nombreDocente;
		this.salon = salon;
		this.estado = estado;
	}





	@NotEmpty 
    @ManyToOne
    @JoinColumn(name = "id_clase")
    private EstadoClase estado;
    

}
