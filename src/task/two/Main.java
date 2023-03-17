package task.two;

public class Main {

	public static void main(String[] args) {
		Cuenta cuentaDeAhorros = new CuentaAhorros(200000, 10);
		
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.consignarDinero(50000);
		cuentaDeAhorros.consignarDinero(50000);
		cuentaDeAhorros.consignarDinero(50000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(10000);
		cuentaDeAhorros.retirarDinero(25550);
		cuentaDeAhorros.extractoMensual();
		cuentaDeAhorros.imprimir();
	}

}
