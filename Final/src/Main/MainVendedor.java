package Main;


import controlador.ControllerVendedor;
import vista.VistaVendedor;

public class MainVendedor {
	 public static void main(String[] args) {
	        ControllerVendedor cVendedor = new ControllerVendedor(new VistaVendedor());
	    }
}
