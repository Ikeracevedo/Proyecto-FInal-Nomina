package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class VistaConsultaVR extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
    public JTable tableNomina;
    public JLabel lblTitulo;
    public JButton btnConsultarEmpleados;
    public JLabel lblEmpleado;
    public JLabel lblIdentificacion;
    public JLabel lblBonificaciones;
    public JLabel lblIngreso;
    public JLabel lblEdad;

	/**
	 * Create the frame.
	 */
	public VistaConsultaVR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(100, 100, 1293, 742);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        lblTitulo = new JLabel("Empleados");
	        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
	        lblTitulo.setBounds(503, 21, 295, 88);
	        contentPane.add(lblTitulo);
	        
	        lblEmpleado = new JLabel("Nombre");
	        lblEmpleado.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        lblEmpleado.setBounds(162, 115, 70, 14);
	        contentPane.add(lblEmpleado);
	        
	        lblIdentificacion = new JLabel("Identificacion");
	        lblIdentificacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        lblIdentificacion.setBounds(373, 115, 100, 14);
	        contentPane.add(lblIdentificacion);
	        
	        lblBonificaciones = new JLabel("Empleado");
	        lblBonificaciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        lblBonificaciones.setBounds(998, 115, 110, 14);
	        contentPane.add(lblBonificaciones);
	        
	        lblIngreso = new JLabel("Año Ingreso");
	        lblIngreso.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        lblIngreso.setBounds(563, 115, 100, 14);
	        contentPane.add(lblIngreso);
	        
	        lblEdad = new JLabel("Edad");
	        lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        lblEdad.setBounds(815, 115, 100, 14);
	        contentPane.add(lblEdad);

	        tableNomina = new JTable();
	        tableNomina.setModel(new DefaultTableModel(
	        	new Object[][] {
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        		{null, null, null, null, null},
	        	},
	        	new String[] {
	        		"Empleado", "Salario B\u00E1sico", "Bonificaciones", "Deducciones", "Total a Pagar"
	        	}
	        ) {
	        	boolean[] columnEditables = new boolean[] {
	        		false, false, false, true, true
	        	};
	        	public boolean isCellEditable(int row, int column) {
	        		return columnEditables[column];
	        	}
	        });
	        tableNomina.setBounds(92, 140, 1090, 384);
	        contentPane.add(tableNomina);

	        btnConsultarEmpleados = new JButton("Consultar Empleados");
	        btnConsultarEmpleados.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        btnConsultarEmpleados.setBounds(529, 596, 326, 40);
	        contentPane.add(btnConsultarEmpleados);
	    }

}
