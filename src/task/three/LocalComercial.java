package task.three;

public class LocalComercial extends Local {

	private String centroComercial;
	
	public LocalComercial(int identificadorInmobiliario, int areaMtsCuadrados, String direccion,
			Localizacion localizacion, String centroComercial) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion, localizacion);
		this.setValorCompra(3000000);
		this.centroComercial = centroComercial;
	}

	public String getCentroComercial() {
		return centroComercial;
	}

	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}

	
}
