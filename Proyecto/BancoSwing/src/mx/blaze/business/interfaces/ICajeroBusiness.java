package mx.blaze.business.interfaces;

import mx.blaze.entity.Tarjeta;

public interface ICajeroBusiness {

	public void validaCuenta(int nip);
	public boolean retiro(double cantidad);
	public boolean consulta(String cuenta);
	
}
