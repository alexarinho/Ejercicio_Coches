package principal;

import java.util.Scanner;

import coche.Coche;

public class Principal {
	
	public static Coche crearPiloto() {
		Scanner leer = new Scanner(System.in);
		int dorsal;
		int numeroCoches =0;
		String piloto;
		double distancia;
		Carrera carrera;
		
		System.out.println("Numero de coches: ");
		numeroCoches = leer.nextInt();
		System.out.println("Nombre del piloto: ");
		piloto = leer.nextLine();
		System.out.println("Dorsal del piloto: ");
		dorsal = leer.nextInt();
		System.out.println("Distancia de la carrera: ");
		distancia = leer.nextDouble();
		
		Coche coche = new Coche(piloto,dorsal,distancia, false);
		
		Coche[] vCoches = new Coche[numeroCoches];
		
		for (int i = 0; i < vCoches.length; i++) {
			if (vCoches[i]==null) {
				vCoches[i]=coche;
			}
		}
		return coche;
	}
	
	private static boolean partidaTerminada(Coche c) {

		if(c.getKmRecorridos()>=c.getDistanciaCarrera()) {
			System.out.println("Carrera terminada");
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc=0; 
		Carrera carrera;
		String nombreC ="";
		int distancia=0;
		
		boolean condicion = true;
		Menu menu = new Menu();
		
		carrera = new Carrera(nombreC,distancia);
		
		do {
			opc = menu.pintaMenuInicial();
			switch (opc) {
			
			case 1:
				carrera.guardarCoche();
				break;

			case 2:
				if (c!=null) {
					do {
						opc = menu.pintaMenuCoche();
						switch(opc) {
						
						case 1:
							c.arrancar();
							break;
							
						case 2:
							c.acelerar();
							break;
							
						case 3: 
							c.frenar();
							break;
						case 4:
							c.rearrancar();
						}
					} while (!partidaTerminada(c));
				}else {
					System.out.println("Partida no configurada");
				}
				break;
			case 3:
				System.out.println("Adios");
				condicion = false;
				break;
			}
		} while (condicion==true);
		
	}

}
