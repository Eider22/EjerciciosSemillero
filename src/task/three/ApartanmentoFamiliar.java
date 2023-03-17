package task.three;

public class ApartanmentoFamiliar extends Apartamento{

	public ApartanmentoFamiliar(int identificadorInmobiliario, int areaMtsCuadrados, String direccion, int numeroHabitaciones, float valorAdministracion) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion, numeroHabitaciones, valorAdministracion);
		this.setValorCompra(2000000);
	}

}
