package task.three;

public class Apartamento extends Inmueble {

	private float valorAdministracion;
	private int numeroHabitaciones;

	public Apartamento(int identificadorInmobiliario, int areaMtsCuadrados, String direccion, int numeroHabitaciones,
			float valorAdministracion) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion);
		this.valorAdministracion = valorAdministracion;
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public float getValorAdministracion() {
		return valorAdministracion;
	}

	public void setValorAdministracion(float valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
	
	

}
