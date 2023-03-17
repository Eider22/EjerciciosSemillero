package task.two;

public class CuentaCorriente extends Cuenta {

	protected float sobregiro = 0;

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	@Override
	public void retirarDinero(int cantidad) {
		this.saldo -= cantidad;
		this.numeroRetiros++;
		this.actualizarSobregiro();

	}

	@Override
	public void consignarDinero(int cantidad) {
		super.consignarDinero(cantidad);
		this.actualizarSobregiro(cantidad);
	}

	@Override
	public void extractoMensual() {
		super.extractoMensual();
	}

	@Override
	public void imprimir() {
		System.out.println(
				"Saldo: $" + this.saldo + "\nComisión mensual: $" + this.comisionMensual + "\nNúmero de transacciones: "
						+ this.numeroConsignaciones + this.numeroRetiros + "\nSobregiro: " + this.sobregiro);
	}

	public void actualizarSobregiro() {
		if (this.saldo < 0) {
			this.sobregiro = this.saldo;
			this.saldo = 0;
		}
	}

	public void actualizarSobregiro(int cantidad) {
		if (this.sobregiro > 0) {
			this.sobregiro -= cantidad;
		}
	}
}
