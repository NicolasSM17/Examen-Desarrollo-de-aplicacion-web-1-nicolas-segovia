package pe.nico.cibertec.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private String correo;
	private Date fechaNacimiento;
	private String dni;
}
