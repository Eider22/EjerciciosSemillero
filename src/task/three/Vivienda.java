package task.three;

public class Vivienda extends Inmueble {

	private int numeroHabitaciones;
	private int numeroBanos;

	public Vivienda(int identificadorInmobiliario, int areaMtsCuadrados, String direccion, int numeroHabitaciones,
			int numerobanos) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion);
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBanos = numerobanos;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public int getNumeroBanos() {
		return numeroBanos;
	}

	public void setNumeroBanos(int numeroBanos) {
		this.numeroBanos = numeroBanos;
	}

	@Override
	public String toString() {
		return "Identificador: " + this.getIdentificadorInmobiliario() + "\nArea en metros cuadrados: "
				+ this.getAreaMtsCuadrados() + "\nDirección: " + this.getDireccion() + "\nHabitaciones: "
				+ this.numeroHabitaciones + "\nBaños: " + this.numeroBanos + "\nValor de compra "
				+ this.getValorCompra();
	}

}
