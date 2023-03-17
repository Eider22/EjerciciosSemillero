package task.three;

public class Casa extends Vivienda {

	private int cantidadPisos;
	
	public Casa(int identificadorInmobiliario, int areaMtsCuadrados, String direccion, int numeroHabitaciones,
			int numerobanos, int cantidadPisos) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion, numeroHabitaciones, numerobanos);
		this.cantidadPisos = cantidadPisos;
	}


//	this.cantidadPisos = cantidadPisos;
	public int getCantidadPisos() {
		return cantidadPisos;
	}

	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}

}
