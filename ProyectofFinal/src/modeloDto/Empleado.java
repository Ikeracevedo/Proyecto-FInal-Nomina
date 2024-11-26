package modeloDto;

import java.io.Serializable;

public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int identificacion;
	protected String nombre;
	protected int edad;
	protected int anio_ingreso;
	protected final double salarioBase = 1000;
	protected double descuento;
	
	public Empleado() {
		
	}
	
	public Empleado(int identificacion, String nombre, int edad, int anio_ingreso) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
		this.anio_ingreso = anio_ingreso;
	}
	
	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAnio_ingreso() {
		return anio_ingreso;
	}

	public void setAnio_ingreso(int anio_ingreso) {
		this.anio_ingreso = anio_ingreso;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	

	
}