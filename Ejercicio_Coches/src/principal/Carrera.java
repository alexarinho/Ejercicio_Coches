package principal;

import java.util.Arrays;
import java.util.Scanner;

import coche.Coche;

public class Carrera {
	private String nombre;
	private double distanciaCarrera;
	private Coche[] vParticipantes;
	private Coche[] vGanadores;
	
	public Carrera(String nombre, double distanciaCarrera) {
		this.nombre = nombre;
		this.distanciaCarrera = distanciaCarrera;
		this.vParticipantes = new Coche[5];
		this.vGanadores = new Coche[5];
	}
	
	private boolean isDorsalRepetido(int dorsal) {
		
		return false;
	}
	
	public void guardarCoche() {
		Scanner leer = new Scanner(System.in);
		int dorsal;
		String piloto;
		int numero;
		boolean bot = false;
		
		System.out.println("Nombre del piloto: ");
		piloto = leer.nextLine();
		
		do {
			System.out.println("Dorsal del piloto: ");
			leer = new Scanner(System.in);
			dorsal = leer.nextInt();
		}while (isDorsalRepetido(dorsal));
		
		System.out.println("Piloto humano(1) o robot(2)");
		numero = leer.nextInt();
		if(numero==1) {
			bot=false;
		} else if(numero==2) {
			bot=true;
		}
		
		
		Coche c = new Coche(piloto, dorsal, distanciaCarrera, bot);
		for (int i = 0; i < vParticipantes.length; i++) {
			if(vParticipantes[i]==null) {
				vParticipantes[i]=c;
				break;
			}
		}
		
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistanciaCarrera() {
		return distanciaCarrera;
	}

	public void setDistanciaCarrera(double distanciaCarrera) {
		this.distanciaCarrera = distanciaCarrera;
	}

	

	@Override
	public String toString() {
		return "Carrera: " + nombre + " - " + distanciaCarrera + " - "
				+ Arrays.toString(vParticipantes) + " - " + Arrays.toString(vGanadores);
	}
	
	
}
