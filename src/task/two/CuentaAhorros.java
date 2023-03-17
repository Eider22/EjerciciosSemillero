package task.two;

public class CuentaAhorros extends Cuenta {
	protected boolean activa;

	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	@Override
	public void consignarDinero(int cantidad) {
		if (!this.isActiva()) {
			return;
		}
		super.consignarDinero(cantidad);
	}

	@Override
	public void retirarDinero(int cantidad) {
		if (!this.isActiva()) {
			return;
		}
		super.retirarDinero(cantidad);

	}

	@Override
	public void extractoMensual() {
		if (this.numeroRetiros <= 4) {
			return;
		}

		this.comisionMensual += (this.numeroRetiros - 4) * 1000;
		super.extractoMensual();
		this.activa = this.isActiva();
	}

	@Override
	public void imprimir() {
		System.out.println("Saldo: $" + this.saldo + "\nComisión mensual: $" + this.comisionMensual
				+ "\nNúmero de transacciones: " + (this.numeroConsignaciones + this.numeroRetiros));
	}

	public boolean isActiva() {
		return this.saldo >= 10000;
	}

}
