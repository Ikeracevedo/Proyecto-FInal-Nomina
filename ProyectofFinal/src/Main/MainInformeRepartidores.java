package Main;

import controlador.ControllerInfoRepart;
import vista.VistaInfoRepartidor;

public class MainInformeRepartidores {
	
	public static void main(String[] args) {
        ControllerInfoRepart cInfoRepartidores = new ControllerInfoRepart(new VistaInfoRepartidor());
    }
}
