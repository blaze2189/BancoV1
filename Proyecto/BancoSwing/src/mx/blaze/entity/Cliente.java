package mx.blaze.entity;

import java.sql.Timestamp;

public class Cliente {

	private int idCliente;
	private int tipoCliente;
	private Timestamp fechaIngreso;
	private Timestamp fechaBaja;
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public int getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(int tipoCliente) {
		this.tipoCliente = tipoCliente;
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
