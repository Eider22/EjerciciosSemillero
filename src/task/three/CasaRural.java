package task.three;

public class CasaRural extends Casa {

	private float distanciaCabeceraMunicipalKm;
	private float altitudNivelMarMts;

	public CasaRural(int identificadorInmobiliario, int areaMtsCuadrados, String direccion, int numeroHabitaciones,
			int numerobanos, float distanciaCabeceraMunicipalKm, float altitudNivelMarMts, int cantidadPisos) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion, numeroHabitaciones, numerobanos, cantidadPisos);
		this.setValorCompra(1500000);
		this.distanciaCabeceraMunicipalKm = distanciaCabeceraMunicipalKm;
		this.altitudNivelMarMts = altitudNivelMarMts;
	}

	public float getDistanciaCabeceraMunicipalKm() {
		return distanciaCabeceraMunicipalKm;
	}

	public void setDistanciaCabeceraMunicipalKm(float distanciaCabeceraMunicipalKm) {
		this.distanciaCabeceraMunicipalKm = distanciaCabeceraMunicipalKm;
	}

	public float getDistanciaNivelMarMts() {
		return altitudNivelMarMts;
	}

	public void setDistanciaNivelMarMts(float distanciaNivelMarMts) {
		this.altitudNivelMarMts = distanciaNivelMarMts;
	}

}
