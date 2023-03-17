package task.three;

public class Apartaestudio extends Apartamento {

	public Apartaestudio(int identificadorInmobiliario, int areaMtsCuadrados, String direccion,
			float valorAdministracion) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion, 1, valorAdministracion);
		this.setValorCompra(1500000);
	}

}
