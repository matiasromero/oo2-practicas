package ar.edu.unlp.oo2.p2_ej4;

public abstract class Empleado {

	private String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract double getBasico();
	
	public abstract double getAdicional();
	
	public double getDescuento() {
		return getBasico() *0.13 + getAdicional() *0.05;
	}
	
	public double sueldo() {
		return getBasico() + getAdicional() + getDescuento();
	}
}
