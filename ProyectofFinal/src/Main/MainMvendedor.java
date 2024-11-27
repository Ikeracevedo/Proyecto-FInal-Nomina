package Main;

import controlador.ControllerMVendedor;
import vista.VistaMVendedor;

public class MainMvendedor {
	public static void main(String[] args) {
        ControllerMVendedor cMvendedores = new ControllerMVendedor(new VistaMVendedor());
    }

}
