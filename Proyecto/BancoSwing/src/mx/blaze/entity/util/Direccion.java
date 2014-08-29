package mx.blaze.entity.util;

public class Direccion {

	private String calle;
	private String numeroExt;
	private String numeroInt;
	private String colonia;
	private String delegacion;
	private int cp;
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getNumeroExt() {
		return numeroExt;
	}
	
	public void setNumeroExt(String numeroExt) {
		this.numeroExt = numeroExt;
	}
	
	public String getNumeroInt() {
		return numeroInt;
	}
	
	public void setNumeroInt(String numeroInt) {
		this.numeroInt = numeroInt;
	}
	
	public String getColonia() {
		return colonia;
	}
	
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	
	public String getDelegacion() {
		return delegacion;
	}
	
	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}
	
	public int getCp() {
		return cp;
	}
	
	public void setCp(int cp) {
		this.cp = cp;
	}
	
}
