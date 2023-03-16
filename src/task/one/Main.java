package task.one;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Persona emisor1 = new Emisor("Eider"," Cardona");
		Persona cliente1 = new Cliente("Sebastian", "Grajales");
		
		Factura factura1 = new Factura(emisor1, cliente1);
		
		factura1.imprimirFactura();
		
	}

}
