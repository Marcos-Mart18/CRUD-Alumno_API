package pe.edu.upeu.LP2_clase01.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_alumnos")

public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apePa")
	private String apePa;
	@Column(name = "apeMa")
	private String apeMa;
	@Column(name = "dni")
	private String dni;
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "carrera")
	private String carrera;
	@Column(name = "estado")
	private char estado;
}
