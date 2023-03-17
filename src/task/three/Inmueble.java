package task.three;

public class Inmueble {
	private int identificadorInmobiliario;
	private int areaMtsCuadrados;
	private String direccion;
	private double valorCompra; 
	
	public Inmueble(int identificadorInmobiliario, int areaMtsCuadrados, String direccion) {
		super();
		this.identificadorInmobiliario = identificadorInmobiliario;
		this.areaMtsCuadrados = areaMtsCuadrados;
		this.direccion = direccion;
	}

	public int getIdentificadorInmobiliario() {
		return identificadorInmobiliario;
	}

	public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
		this.identificadorInmobiliario = identificadorInmobiliario;
	}

	public int getAreaMtsCuadrados() {
		return areaMtsCuadrados;
	}

	public void setAreaMtsCuadrados(int areaMtsCuadrados) {
		this.areaMtsCuadrados = areaMtsCuadrados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}	
	
	@Override
	public String toString() {		
		return "Identificador: " + this.identificadorInmobiliario
				+ "\nArea en metros cuadrados: " + this.areaMtsCuadrados
				+ "\nDirección: " + this.direccion
				+ "\nValor de compra " + this.valorCompra;
	}
	
}
