package modeloDto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Vendedor extends Empleado implements Serializable{

		private int totalVentas;
		private double salario;
		
		public Vendedor() {
			super();
			// TODO Auto-generated constructor stub
		}

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

		public int getAnio_ingreso() {
			// TODO Auto-generated method stub
			return anio_ingreso;
		}

		
}
