package Main;

import controlador.ControllerConsultaVendedor;
import vista.VistaConsultaVendedor;

public class MainConsultaVendedores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ControllerVendedor cVendedor = new ControllerVendedor(new VistaVendedor());
		ControllerConsultaVendedor cVendedor = new ControllerConsultaVendedor(new VistaConsultaVendedor());
	}

}