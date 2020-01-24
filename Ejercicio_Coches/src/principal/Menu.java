package principal;

import java.util.Scanner;

public class Menu {
	
	public int pintaMenuInicial() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Juego de carreras");
		System.out.println("1. Configuracion de carrera");
		System.out.println("2. Inicio de la carrera");
		System.out.println("3. Salir del juego");
		
		return leer.nextInt();
	}
	
	public int pintaMenuCoche() {
		Scanner leer = new Scanner(System.in);
		System.out.println("1. Arrancar");
		System.out.println("2. Acelerar");
		System.out.println("3. Frenar");
		System.out.println("4. Rearrancar");
		
		return leer.nextInt();
	}
	
}
