package mx.blaze.business;

import mx.blaze.business.interfaces.ICajeroBusiness;
import mx.blaze.entity.Cuenta;
import mx.blaze.entity.Tarjeta;
import mx.blaze.entity.Debito;

public abstract class CajeroBusiness implements ICajeroBusiness {

	private boolean validacion;
	private Tarjeta tarjeta;

	public void leeTarjeta(int numeroTarjeta) {
		// code to read a card from a bd or somewhere it can be storage
	}

	@Override
	public boolean retiro(double cantidad) {
		boolean retiro=false;
		if (validacion) {
			Cuenta cuenta = tarjeta.getCuenta();
			if (cuenta instanceof Debito) {
				double saldo=((Debito) cuenta).getSaldo();
				if(cantidad<=saldo){
					((Debito) cuenta).setSaldo(saldo-cantidad);
					retiro=true;
				}
			}else{
				System.out.println("saldo insuficiente");
			}
		} else {

		}
		return retiro;
	}

	@Override
	public boolean consulta(String cuenta) {

		return false;
	}

	@Override
	public void validaCuenta(int nip) {
		validacion = false;
		if (tarjeta != null) {
			if (tarjeta.getNip() == nip) {
				validacion = true;
			} else {
				System.out.println("no hay tarjeta insertada");
			}
		}
	}

}
