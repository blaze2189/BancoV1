package mx.blaze.entity;

import java.sql.Timestamp;

public class Empleado extends Persona{

	private int idEmpleado;
	private Puesto puesto;
	private int departamento;
	private Timestamp fechaIngreso;
	private Timestamp fechaBaja;
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public Puesto getPuesto() {
		return puesto;
	}
	
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	
	public int getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	
	public Timestamp getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(Timestamp fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public Timestamp getFechaBaja() {
		return fechaBaja;
	}
	
	public void setFechaBaja(Timestamp fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
}
