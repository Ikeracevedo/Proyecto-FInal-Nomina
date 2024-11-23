package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import modeloDao.VendedorDao;
import modeloDto.Vendedor;
import vista.VistaConsultaVendedor;

public class ControllerConsultaVendedor implements ActionListener{

	private VistaConsultaVendedor vista;
	private VendedorDao modelo;
	private DefaultTableModel modeloTabla;
	
	public ControllerConsultaVendedor(VistaConsultaVendedor vista) {
		this.vista = vista;
		this.modelo = new VendedorDao();
		modeloTabla = (DefaultTableModel)this.vista.tableVendedores.getModel();
		this.vista.btnConsultaVendedores.addActionListener(this);
		this.vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.btnConsultaVendedores)) {
			ArrayList<Vendedor> listaVendedores = modelo.readAll();
			double salariototalGeneral=0;
			int filas = modeloTabla.getRowCount();
			
			for(int i = 0 ; i < filas ; i++) {
				modeloTabla.removeRow(0);
			}
			
			for(Vendedor vendedor : listaVendedores) {
				modelo.CalcularSalario(vendedor);
				salariototalGeneral += vendedor.getSalario();
				Object[] fila = {vendedor.getIdentificacion(), vendedor.getNombre(), vendedor.getAnio_ingreso(), vendedor.getSalarioBase(), vendedor.getTotalVentas(),vendedor.getComision(),vendedor.getDescuento(), vendedor.getSalario()};
				modeloTabla.addRow(fila);
			}
			
			vista.textFieldTotalGeneral.setText(String.valueOf(salariototalGeneral));
		}
			
	}
	
}
