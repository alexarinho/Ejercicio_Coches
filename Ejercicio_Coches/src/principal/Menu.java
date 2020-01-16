package principal;

import java.util.Scanner;

public class Menu {
	
	public int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Juego de carreras");
		System.out.println("1. Configuracion de carrera");
		System.out.println("2. Inicio de la carrera");
		System.out.println("3. Salir del juego");
		
		return leer.nextInt();
	}
}
