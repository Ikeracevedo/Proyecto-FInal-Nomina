package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import modeloDao.RepartidorDao;
import modeloDao.VendedorDao;
import modeloDto.Repartidor;
import modeloDto.Vendedor;
import vista.VistaConsultaVR;

public class ControllerConsultaVR implements ActionListener{
	
	private VistaConsultaVR vista;
	private RepartidorDao modeloR;
	private VendedorDao modeloV;
	private DefaultTableModel modeloTabla;
	
	public ControllerConsultaVR(VistaConsultaVR vista) {
		super();
		this.vista = vista;
		this.modeloR = new RepartidorDao();
		this.modeloV = new VendedorDao();
		modeloTabla = (DefaultTableModel)this.vista.tableNomina.getModel();
		this.vista.btnConsultarEmpleados.addActionListener(this);
		this.vista.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.btnConsultarEmpleados)) {
			List<Vendedor> listaVendedores = modeloV.readAll();
			List<Repartidor> listaRepartidores = modeloR.readAll();
			
			int filas = modeloTabla.getRowCount();
			
			for(int i = 0; i < filas; i++) {
				modeloTabla.removeRow(0);
			}
			
			
			for(Repartidor repartidor : listaRepartidores) {
				repartidor.setSalario(modeloR.calcularSalario(repartidor, repartidor.getZona())); 
				Object[] fila = {repartidor.getNombre(),repartidor.getIdentificacion(),repartidor.getAnio_ingreso(), repartidor.getEdad(), " Repartidor"};
				modeloTabla.addRow(fila);
			}
			
			for(Vendedor vendedor : listaVendedores ) {
				vendedor.setSalario(modeloV.CalcularSalario(vendedor));
				Object[] fila = {vendedor.getNombre(), vendedor.getIdentificacion(),vendedor.getAnio_ingreso(), vendedor.getEdad(), " Vendedor"};
				modeloTabla.addRow(fila);
			}
			
			
			}
			
		}

}
