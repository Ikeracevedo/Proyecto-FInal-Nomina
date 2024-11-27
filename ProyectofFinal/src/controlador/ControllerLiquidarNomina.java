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
	
	public ControllerLiquidarNomina(VistaLiquidarNomina vista) {
		super();
		this.vista = vista;
		this.modeloR = new RepartidorDao();
		this.modeloV = new VendedorDao();
		
		this.vista.btnCalcularRepartidores.addActionListener(this);
		this.vista.btnCalcularVendedor.addActionListener(this);
		this.vista.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		List<Repartidor> listaRepartidores = modeloR.readAll();
		List<Vendedor> listaVendedores = modeloV.readAll();
		
		
			if(e.getSource().equals(vista.btnCalcularRepartidores)){
				
				for(Repartidor repartidor : listaRepartidores) {
					repartidor.setSalario(modeloR.calcularSalario(repartidor, repartidor.getZona())); 
					modeloR.guardar();
					vista.textField.setText("Termino repartidores");
				
				}

			}
			if(e.getSource().equals(vista.btnCalcularVendedor)) {
				
				for(Vendedor vendedor : listaVendedores ) {
					modeloV.CalcularSalario(vendedor);
					//modeloV.guardar();
					vista.textField.setText("Termino vendedores ");
				}

			}

		}
	}

			
