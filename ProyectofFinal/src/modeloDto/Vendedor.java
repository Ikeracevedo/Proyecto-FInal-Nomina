package modeloDto;

import java.io.Serializable;

public class Vendedor extends Empleado implements Serializable  {

	private int totalVentas;
	private double salario;
	private double comision;
	private double bonificacion;
	
	public Vendedor(int identificacion, String nombre, int edad, int anio_ingreso, int totalVetas) {
		super(identificacion, nombre, edad, anio_ingreso);
		this.totalVentas = totalVetas;
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