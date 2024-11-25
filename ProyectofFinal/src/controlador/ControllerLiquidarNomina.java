package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import modeloDao.RepartidorDao;
import modeloDao.VendedorDao;
import modeloDto.Repartidor;
import modeloDto.Vendedor;
import vista.VistaLiquidarNomina;

public class ControllerLiquidarNomina implements ActionListener{
	private VistaLiquidarNomina vista;
	private RepartidorDao modeloR;
	private VendedorDao modeloV;
	private DefaultTableModel modeloTabla;
	
	public ControllerLiquidarNomina(VistaLiquidarNomina vista) {
		super();
		this.vista = vista;
		this.modeloR = new RepartidorDao();
		this.modeloV = new VendedorDao();
		modeloTabla = (DefaultTableModel)this.vista.tableNomina.getModel();
		this.vista.btnCalcularNomina.addActionListener(this);
		this.vista.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(vista.btnCalcularNomina)) {
			List<Vendedor> listaVendedores = modeloV.readAll();
			List<Repartidor> listaRepartidores = modeloR.readAll();
			
			int filas = modeloTabla.getRowCount();
			
			for(int i = 0; i < filas; i++) {
				modeloTabla.removeRow(0);
			}
			
			double totalPagar;
			
			for(Repartidor repartidor : listaRepartidores) {
				repartidor.setSalario(modeloR.calcularSalario(repartidor, repartidor.getZona())); 
				totalPagar = (repartidor.getSalario() - repartidor.getDescuento());
				Object[] fila = {repartidor.getNombre(),repartidor.getIdentificacion(), "Repartidor " ,repartidor.getDescuento(),repartidor.getSalario()};
				modeloTabla.addRow(fila);
			}
			
			for(Vendedor vendedor : listaVendedores ) {
				vendedor.setSalario(modeloV.CalcularSalario(vendedor));
				totalPagar = (vendedor.getSalario() - vendedor.getDescuento());
				Object[] fila = {vendedor.getNombre(), vendedor.getIdentificacion(),"Vendedor", vendedor.getDescuento(), vendedor.getSalario()};
				modeloTabla.addRow(fila);
			}
			
			
			}
			
		}
	}

			
