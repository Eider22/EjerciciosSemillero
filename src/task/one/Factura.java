package task.one;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Factura extends Precio {
	public Date fecha;
	private Persona emisor;
	private Persona cliente;

	public Factura(Persona emisor, Persona cliente) {
		this.emisor = emisor;
		this.cliente = cliente;
		this.fecha = new Date();
	}

	public void imprimirFactura() {
		JOptionPane.showMessageDialog(null,
				"Fecha: " + this.getFecha() + "\n" + "Emisor: " + this.getEmisor().getPrimerNombre() + " "
						+ this.getEmisor().getPrimerApellido() + "\n" + "Cliente: "
						+ this.getCliente().getPrimerNombre() + " " + this.getCliente().getPrimerApellido());
	}

	public String getFecha() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String formatedDate = formatter.format(this.fecha);
		return formatedDate;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Persona getEmisor() {
		return emisor;
	}

	public void setEmisor(Persona emisor) {
		this.emisor = emisor;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

}
