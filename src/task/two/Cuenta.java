package task.two;

public class Cuenta {
	protected float saldo;
	protected int numeroConsignaciones = 0;
	protected int numeroRetiros = 0;
	protected float tasaAnual;
	protected float comisionMensual = 0;

	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual / 100;
//		this.comisionMensual = 2000;
	}

	public void consignarDinero(int cantidad) {
		//Consignar una cantidad de dinero en la cuenta actualizando su saldo.
		this.saldo += cantidad;
		this.numeroConsignaciones ++;
	}
	
	public void retirarDinero(int cantidad) {
		//Retirar una cantidad de dinero en la cuenta actualizando su saldo.
		//El valor a retirar no debe superar el saldo.
		if(this.saldo < cantidad) {
			return;
		}
		
		this.saldo -= cantidad;
		this.numeroRetiros ++;

	}
	
	public void calcularInteresMensual() {
		//•	Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.	
		float interesMensual = this.saldo * (this.tasaAnual/12);
		this.saldo += interesMensual;
	}

	public void extractoMensual() {
		//Extracto mensual: actualiza el saldo restándole la comisión mensual
		this.saldo -= this.comisionMensual;
		//y calculando el interés mensual correspondiente (invoca el método
		//	anterior).
		this.calcularInteresMensual();
	}
	
	public void imprimir() {
		System.out.println("Saldo: $" + this.saldo
				+ "\nNumero de consignaciones: " + this.numeroConsignaciones
				+ "\nTasa anual : " + this.tasaAnual * 100 + "%"
				+ "\nComisión mensual: $" + this.comisionMensual);
	}	
	
	
	
	
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConsignaciones() {
		return numeroConsignaciones;
	}

	public void setNumeroConsignaciones(int numeroConsignaciones) {
		this.numeroConsignaciones = numeroConsignaciones;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

}
