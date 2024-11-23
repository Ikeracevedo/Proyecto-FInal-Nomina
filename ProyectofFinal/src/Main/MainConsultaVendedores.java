package main;
import controlador.ControllerConsultaVendedor;
import controlador.ControllerVendedor;
import vista.VistaConsultaVendedor;
import vista.VistaVendedor;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ControllerVendedor cVendedor = new ControllerVendedor(new VistaVendedor());
		ControllerConsultaVendedor cVendedor = new ControllerConsultaVendedor(new VistaConsultaVendedor());
	}

}
