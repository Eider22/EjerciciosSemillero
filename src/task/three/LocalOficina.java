package task.three;

public class LocalOficina extends Local {
	private boolean esDelGobierno;

	public LocalOficina(int identificadorInmobiliario, int areaMtsCuadrados, String direccion,
			Localizacion localizacion, boolean esDelGobierno) {
		super(identificadorInmobiliario, areaMtsCuadrados, direccion, localizacion);
		this.esDelGobierno = esDelGobierno;
		this.setValorCompra(3500000);
	}

	public boolean esDelGobierno() {
		return esDelGobierno;
	}

	public void setEsDelGobierno(boolean esDelGobierno) {
		this.esDelGobierno = esDelGobierno;
	}

}
