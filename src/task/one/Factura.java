package task.one;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Factura extends Precio {
	public Date fecha;
	private Persona emisor;
	private Persona cliente;
	static private SimpleDateFormat formattter = new SimpleDateFormat("dd/MM/yyyy");

	public Factura(Persona emisor, Persona cliente) {
		this.emisor = emisor;
		this.cliente = cliente;
		this.fecha = new Date();
	}

	public void imprimirFactura() {
		JOptionPane.showMessageDialog(null,
				"Fecha: " + this.formattter.format(this.fecha) + "\n" + "Emisor: " + this.emisor.getPrimerNombre() + " "
						+ this.emisor.getPrimerApellido() + "\n" + "Cliente: " + this.cliente.getPrimerNombre() + " "
						+ this.cliente.getPrimerApellido());
	}
}
