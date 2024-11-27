package Main;

import controlador.ControllerRepartidor;
import vista.VistaRepartidor;

public class MainRepartidor {
    public static void main(String[] args) {
        ControllerRepartidor cRepartidor = new ControllerRepartidor(new VistaRepartidor());
    } 

}
