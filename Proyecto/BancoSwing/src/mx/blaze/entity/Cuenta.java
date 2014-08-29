package mx.blaze.entity;

public class Cuenta {

	private String numeroCuenta;
	private Cliente cliente;
	private int numeroTarjeta;
	private Sucursal sucursalApertura;
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	
	public Sucursal getSucursalApertura() {
		return sucursalApertura;
	}
	
	public void setSucursalApertura(Sucursal sucursalApertura) {
		this.sucursalApertura = sucursalApertura;
	}

}
