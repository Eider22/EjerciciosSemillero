package task.three;

public class CasaUrbanaConjuntoCerrado extends CasaUrbana {

	private float valorAdministracion;
	private boolean areasComunes;

	public CasaUrbanaConjuntoCerrado(int identificadorInmobiliario, int areaMtsCuadrados, String direccion,
			int cantidadPisos, float valorAdministracion, boolean areasComunes, int numeroHabitaciones,
			int numerobanos) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion, cantidadPisos, numeroHabitaciones, numerobanos);
		this.setValorCompra(2500000);
		this.valorAdministracion = valorAdministracion;
		this.areasComunes = areasComunes;
	}

	public float getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(float valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	public boolean tieneAreasComunes() {
		return areasComunes;
	}

	public void setAreasComunes(boolean areasComunes) {
		this.areasComunes = areasComunes;
	}

}
