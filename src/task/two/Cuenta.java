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
	}

	public void consignarDinero(int cantidad) {
		this.saldo += cantidad;
		this.numeroConsignaciones++;
	}

	public void retirarDinero(int cantidad) {
		if (this.saldo < cantidad) {
			return;
		}

		this.saldo -= cantidad;
		this.numeroRetiros++;

	}

	public void calcularInteresMensual() {
		float interesMensual = this.saldo * (this.tasaAnual / 12);
		this.saldo += interesMensual;
	}

	public void extractoMensual() {
		this.saldo -= this.comisionMensual;
		this.calcularInteresMensual();
	}

	public void imprimir() {
		System.out.println("Saldo: $" + this.saldo + "\nNumero de consignaciones: " + this.numeroConsignaciones
				+ "\nTasa anual : " + this.tasaAnual * 100 + "%" + "\nComisión mensual: $" + this.comisionMensual);
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
