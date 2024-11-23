package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setTitle("SISTEMA GENERAL FINANCIERO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 444, 22);
		contentPane.add(menuBar);
		
		JMenu mnDatos = new JMenu("Datos");
		menuBar.add(mnDatos);
		
		JMenuItem mntmVendedores = new JMenuItem("Vendedores");
		mnDatos.add(mntmVendedores);
		
		JMenuItem mntmRepartidores = new JMenuItem("Repartidores");
		mnDatos.add(mntmRepartidores);
		
		JMenu mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		JMenu mnVendedoresConsulta = new JMenu("Vendedores");
		mnConsultas.add(mnVendedoresConsulta);
		
		JMenuItem mntmNominaV = new JMenuItem("Nomina");
		mnVendedoresConsulta.add(mntmNominaV);
		
		JMenuItem mntmMVendedor = new JMenuItem("Mayores Vendedores (3)");
		mnVendedoresConsulta.add(mntmMVendedor);
		
		JMenu mnRepartidoresConsulta = new JMenu("Repartidores");
		mnConsultas.add(mnRepartidoresConsulta);
		
		JMenuItem mntmNominaR = new JMenuItem("Nomina");
		mnRepartidoresConsulta.add(mntmNominaR);
		
		JMenuItem mntmMRepartidores = new JMenuItem("Mayor Repartidor");
		mnRepartidoresConsulta.add(mntmMRepartidores);
		
		JMenuItem mntmEmpleados = new JMenuItem("Empleados");
		mnConsultas.add(mntmEmpleados);
		
		JMenu mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnSalir.add(mntmSalir);
		
		
	}
}
