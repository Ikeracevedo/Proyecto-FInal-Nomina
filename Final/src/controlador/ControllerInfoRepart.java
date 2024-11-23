package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import modeloDao.RepartidorDao;
import modeloDto.Repartidor;
import vista.VistaInfoRepartidor;


public class ControllerInfoRepart implements ActionListener {
	private VistaInfoRepartidor vista;
	private RepartidorDao modelo;
	private DefaultTableModel modeloTabla;
	
	
	public ControllerInfoRepart(VistaInfoRepartidor vista) {
		this.vista = vista;
		this.modelo = new RepartidorDao();
		modeloTabla = (DefaultTableModel)this.vista.tableRepartidores.getModel();
		this.vista.btnMostrarTabla.addActionListener(this);
		this.vista.btnValorTotalPagar.addActionListener(this);
		this.vista.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.btnMostrarTabla)) {
			List<Repartidor> listaRepartidores = modelo.readAll();
			
			int filas = modeloTabla.getRowCount();
			
			for(int i = 0 ; i < filas ; i++) {
				modeloTabla.removeRow(0);
			}
			
			for(Repartidor repartidor : listaRepartidores) {
				double salario = modelo.calcularSalario(repartidor, repartidor.getZona());
				Object[] fila = {repartidor.getIdentificacion(), repartidor.getNombre(), repartidor.getAnio_ingreso(), repartidor.getSalarioBase(), repartidor.getZona() , repartidor.getNumeroDeRepartos(),"NN", salario};
				modeloTabla.addRow(fila);
			}
		}
		
		if (e.getSource().equals(vista.btnValorTotalPagar)) {
			List<Repartidor> listaRepartidores = modelo.readAll();
			double total = 0;
			
			for(Repartidor repartidor : listaRepartidores) {
				double salario = modelo.calcularSalario(repartidor, repartidor.getZona());
				total += salario;
			}
			
			vista.textFieldValorPagar.setText(String.valueOf(total));
		}
		
	}
	
	
	
	
}

