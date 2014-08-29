package mx.blaze.entity;

public class Credito extends Cuenta {

	private double limiteCredito;
	private double saldo;
	private int diaCorte;
	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getDiaCorte() {
		return diaCorte;
	}
	
	public void setDiaCorte(int diaCorte) {
		this.diaCorte = diaCorte;
	}
	
}