package mx.blaze.entity;

import mx.blaze.entity.util.Direccion;

public class Sucursal {

	private int clave;
	private String nombre;
	private Direccion direccion;
	
	public int getClave() {
		return clave;
	}
	
	public void setClave(int clave) {
		this.clave = clave;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
