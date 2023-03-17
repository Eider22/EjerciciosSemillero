package task.three;

public class CasaUrbanaIndependiente extends CasaUrbana {

	public CasaUrbanaIndependiente(int identificadorInmobiliario, int areaMtsCuadrados, String direccion,
			int cantidadPisos, int numeroHabitaciones, int numerobanos) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion, cantidadPisos, numeroHabitaciones, numerobanos);
		this.setValorCompra(3000000);
	}

}
