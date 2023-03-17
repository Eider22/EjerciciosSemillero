package task.three;

public class Local extends Inmueble {

	private Localizacion localizacion;

	public Local(int identificadorInmobiliario, int areaMtsCuadrados, String direccion, Localizacion localizacion) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion);
		this.localizacion = localizacion;
	}

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

	public String obtenerNombreLocalizacion() {
		return localizacion.getNombre();
	}

	@Override
	public String toString() {
		return "Identificador: " + this.getIdentificadorInmobiliario() + "\nArea en metros cuadrados: "
				+ this.getAreaMtsCuadrados() + "\nDirección: " + this.getDireccion() + "\nLocalización: "
				+ this.obtenerNombreLocalizacion() + "\nValor de compra " + this.getValorCompra();
	}

}
