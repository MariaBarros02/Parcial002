package co.edu.usco.pw.springboot_crud01.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estadoclase")
@Data // Genera getters, setters, toString, equals, y hashCode
@NoArgsConstructor // Crea un constructor sin argumentos
@AllArgsConstructor // Crea un constructor con todos los campos
public class EstadoClase implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClase;

    @NotEmpty
    private String estado;
}

