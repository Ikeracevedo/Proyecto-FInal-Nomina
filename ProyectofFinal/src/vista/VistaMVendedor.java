package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMVendedor extends JFrame {

	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTable table;
	public JLabel lblTitulo;
	public JLabel lblIdentificacin;
	public JLabel lblNombre;
	public JLabel lblIngreso;
	public JLabel lblSalario;
	public JLabel lblTotVentas;
	public JLabel lblTotalComision;
	public JButton btnConsultar;
	public JButton btnLimpiar;
	
	
	
	
	

	/**
	 * Create the frame.
	 */
	public VistaMVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1293, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitulo = new JLabel("Mayores Vendedores");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(494, 45, 285, 65);
		contentPane.add(lblTitulo);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(182, 167, 891, 48);
		contentPane.add(table);
		
		lblIdentificacin = new JLabel("Identificación");
		lblIdentificacin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdentificacin.setBounds(202, 143, 100, 14);
		contentPane.add(lblIdentificacin);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(357, 143, 100, 14);
		contentPane.add(lblNombre);
		
		lblIngreso = new JLabel("Ingreso");
		lblIngreso.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIngreso.setBounds(510, 137, 100, 26);
		contentPane.add(lblIngreso);
		
		lblSalario = new JLabel("Salario basico");
		lblSalario.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSalario.setBounds(650, 143, 100, 14);
		contentPane.add(lblSalario);
		
		lblTotVentas = new JLabel("Total de ventas");
		lblTotVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotVentas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotVentas.setBounds(793, 143, 119, 14);
		contentPane.add(lblTotVentas);
		
		lblTotalComision = new JLabel("Total comision");
		lblTotalComision.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalComision.setBounds(946, 143, 119, 14);
		contentPane.add(lblTotalComision);
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnConsultar.setBounds(458, 275, 119, 32);
		contentPane.add(btnConsultar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpiar.setBounds(683, 275, 119, 32);
		contentPane.add(btnLimpiar);
	}

}
