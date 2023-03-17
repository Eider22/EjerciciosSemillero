package task.three;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Inmueble> inmuebles = new ArrayList<>();

		Inmueble casaRural = new CasaRural(1, 100, "Carrera 25 #45-3", 3, 1, 2, 3000, 3);
		Inmueble casaConjuntoCerrado = new CasaUrbanaConjuntoCerrado(2, 50, "Carrera 9 #2-3", 2, 150000, true, 3, 2);
		Inmueble casaIndependiente = new CasaUrbanaIndependiente(3, 200, "calle12 #1-3", 3, 5, 3);
		Inmueble apartaEstudio = new Apartaestudio(4, 120, "Carrera 14 # 2 -98", 89000);
		Inmueble apartamentoFamiliar = new ApartanmentoFamiliar(5, 125, "Calle32-32-3", 3, 160000);
		Inmueble localComercial = new LocalComercial(6, 100, "Calle 7 #8 -3", Localizacion.INTERNO, "Centro comercial Fundadores");
		Inmueble oficina = new LocalOficina(7, 50, "Carrera 2 # 87-98", Localizacion.EXTERNO, false);

		inmuebles.add(casaRural);
		inmuebles.add(casaConjuntoCerrado);
		inmuebles.add(casaIndependiente);
		inmuebles.add(apartaEstudio);
		inmuebles.add(apartamentoFamiliar);
		inmuebles.add(localComercial);
		inmuebles.add(oficina);

		for (Inmueble inmueble : inmuebles) {
			System.out.println("==============================");
			System.out.println(inmueble.toString());
			System.out.println("==============================");
		}
	}

}
