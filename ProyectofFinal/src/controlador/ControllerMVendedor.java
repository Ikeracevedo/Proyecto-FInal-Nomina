package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modeloDao.VendedorDao;
import modeloDto.Vendedor;
import vista.VistaMVendedor;

public class ControllerMVendedor implements ActionListener {

    private VendedorDao modelo;
    private VistaMVendedor vista;
    private DefaultTableModel modeloTabla;

    public ControllerMVendedor(VistaMVendedor vista) {
        super();
        this.vista = vista;
        this.modelo = new VendedorDao();
        modeloTabla = (DefaultTableModel) this.vista.table.getModel();
        this.vista.btnConsultar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this); // Añadir listener para el botón Limpiar
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.btnConsultar)) {
            ArrayList<Vendedor> listaVendedores = modelo.readAll();
            // Variables para los tres mayores vendedores 
            Vendedor primero = null, segundo = null, tercero = null;

            // Encontrar los tres vendedores con mayores ventas 
            for (Vendedor vendedor : listaVendedores) {
                if (primero == null || vendedor.getTotalVentas() > primero.getTotalVentas()) {
                    tercero = segundo;
                    segundo = primero;
                    primero = vendedor;
                } else if (segundo == null || vendedor.getTotalVentas() > segundo.getTotalVentas()) {
                    tercero = segundo;
                    segundo = vendedor;
                } else if (tercero == null || vendedor.getTotalVentas() > tercero.getTotalVentas()) {
                    tercero = vendedor;
                }
            }

            // Limpiar la tabla antes de agregar nuevas filas 
            modeloTabla.setRowCount(0);

            // Agregar los valores a la tabla
            if (primero != null) {
                Object[] fila1 = {primero.getIdentificacion(), primero.getNombre(), primero.getAnio_ingreso(), primero.getSalarioBase(), primero.getTotalVentas(), primero.getComision()};
                modeloTabla.addRow(fila1);
            }
            if (segundo != null) {
                Object[] fila2 = {segundo.getIdentificacion(), segundo.getNombre(), segundo.getAnio_ingreso(), segundo.getSalarioBase(), segundo.getTotalVentas(), segundo.getComision()};
                modeloTabla.addRow(fila2);
            }
            if (tercero != null) {
                Object[] fila3 = {tercero.getIdentificacion(), tercero.getNombre(), tercero.getAnio_ingreso(), tercero.getSalarioBase(), tercero.getTotalVentas(), tercero.getComision()};
                modeloTabla.addRow(fila3);
            }
        }

        if (e.getSource().equals(vista.btnLimpiar)) {
            modeloTabla.setRowCount(0); // Limpiar la tabla completamente
        }
    }
}
