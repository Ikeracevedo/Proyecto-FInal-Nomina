package modeloDto;

import java.io.Serializable;

public class Vendedor extends Empleado implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int totalVentas;
	private double salario;
	private double comision;
	private double bonificacion;
	private double descuento;
	
	public Vendedor() {
	}	


	public Vendedor(int identificacion, String nombre, int edad, int anio_ingreso, int totalVetas) {
		// TODO Auto-generated constructor stub
		super(identificacion, nombre, edad, anio_ingreso);
		this.totalVentas = totalVetas;
		this.descuento = descuento;
	}


	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	public int getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}
	
}