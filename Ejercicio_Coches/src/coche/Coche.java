package coche;

import java.util.Scanner;

public class Coche {
	
	private String nombrePiloto;
	private int dorsal;
	private double distanciaCarrera;
	private String estado;
	private int potencia;
	private double velocidad;
	private double kmRecorridos;
	
	public Coche(String nombrePiloto, int dorsal, double distanciaCarrera) {
		this.nombrePiloto = nombrePiloto;
		this.dorsal = dorsal;
		this.distanciaCarrera = distanciaCarrera;
		this.estado = "parado";
		this.potencia = 50;
		this.velocidad = 0;
		this.kmRecorridos = 0;
	}
	
	public void arrancar() {
		Scanner leer = new Scanner(System.in);
		int numero =0;
		System.out.println("Pulsa el 1 para arrancar el coche");
		numero = leer.nextInt();
		if(numero==1) {
			estado="marcha";
			System.out.println("El coche esta arrancado");
		} else {
			estado="parado";
			
		}
	}
	
	public void acelerar() {
		
	}
	
	public void frenar() {
		
	}
	
	public void rearrancar() {
		
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public double getDistanciaCarrera() {
		return distanciaCarrera;
	}

	public void setDistanciaCarrera(double distanciaCarrera) {
		this.distanciaCarrera = distanciaCarrera;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	@Override
	public String toString() {
		return "Coche " + nombrePiloto + " - " + dorsal + " - " + distanciaCarrera
				+ " - " + estado + " - " + potencia + " - " + velocidad + " - "
				+ kmRecorridos;
	}
	
	
	
}
