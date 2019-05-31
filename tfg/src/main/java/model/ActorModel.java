package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//La etiqueta Entity hace que cree la entidad en nuestra base de datos
//y la etiqueta table le asigna el nombre de la entidad
@Entity
@Table(name = "Actor")
public class ActorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	
	private String lugarNacimiento;
	
	private Date fechaNacimiento;
	
	private Date fechaDefunción;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaDefunción() {
		return fechaDefunción;
	}

	public void setFechaDefunción(Date fechaDefunción) {
		this.fechaDefunción = fechaDefunción;
	}
	
	
}
