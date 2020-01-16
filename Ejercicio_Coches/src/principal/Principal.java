package principal;

import java.util.Scanner;

import coche.Coche;

public class Principal {
	
	public void crearPiloto() {
		String piloto;
		Scanner leer = new Scanner(System.in);
		System.out.println("Nombre del piloto: ");
		piloto = leer.nextLine();
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc=0; 
			
		boolean condicion = true;
		Menu menu = new Menu();
		
		do {
			opc = menu.pintaMenu();
			switch (opc) {
			
			case 1:
				
				break;

			case 2:
				
				break;
			case 3:
				
				break;
			}
		} while (condicion=true);
		
	}

}
