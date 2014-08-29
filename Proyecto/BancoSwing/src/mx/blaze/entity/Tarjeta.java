package mx.blaze.entity;

import java.sql.Timestamp;

public class Tarjeta {

	private String numeroTarjeta;
	private Cuenta cuenta;
	private Timestamp fechaVencimiento;
	private int nip;
	
	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public Timestamp getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	public void setFechaVencimiento(Timestamp fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
}
