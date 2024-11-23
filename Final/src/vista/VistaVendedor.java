package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class VistaVendedor extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textFieldId;
	public JTextField textFieldNombre;
	public JTextField textFieldEdad;
	public JTextField textFieldIngreso;
	public JTextField textFieldTotalVentas;
	public JLabel LabelId;
	public JLabel LabelVendedores;
	public JLabel LabelNombre;
	public JLabel LabelEdad;
	public JLabel LabelIngreso;
	public JLabel LabelTotalVentas;
	public JButton btnAgregar;
	public JButton btnModificar;
	public JButton btnBorrar;
	public JButton btnBuscar;

	/**
	 * Create the frame.
	 */
	public VistaVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1293, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LabelId = new JLabel("Identificacion");
		LabelId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelId.setBounds(72, 134, 136, 40);
		contentPane.add(LabelId);
		
		LabelVendedores = new JLabel("VENDEDORES");
		LabelVendedores.setFont(new Font("Tahoma", Font.PLAIN, 30));
		LabelVendedores.setBounds(504, 31, 214, 54);
		contentPane.add(LabelVendedores);
		
		LabelNombre = new JLabel("Nombre");
		LabelNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelNombre.setBounds(72, 188, 118, 25);
		contentPane.add(LabelNombre);
		
		LabelEdad = new JLabel("Edad");
		LabelEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelEdad.setBounds(72, 232, 107, 25);
		contentPane.add(LabelEdad);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(366, 146, 308, 25);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		LabelIngreso = new JLabel("Año de ingreso");
		LabelIngreso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelIngreso.setBounds(72, 273, 165, 25);
		contentPane.add(LabelIngreso);
		
		LabelTotalVentas = new JLabel("Total de Ventas");
		LabelTotalVentas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelTotalVentas.setBounds(72, 308, 188, 32);
		contentPane.add(LabelTotalVentas);
	
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(366, 188, 308, 26);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setBounds(366, 233, 308, 25);
		contentPane.add(textFieldEdad);
		textFieldEdad.setColumns(10);
		
		textFieldIngreso = new JTextField();
		textFieldIngreso.setBounds(367, 274, 307, 25);
		contentPane.add(textFieldIngreso);
		textFieldIngreso.setColumns(10);
		
		textFieldTotalVentas = new JTextField();
		textFieldTotalVentas.setBounds(367, 313, 307, 25);
		contentPane.add(textFieldTotalVentas);
		textFieldTotalVentas.setColumns(10);
		
		btnAgregar = new JButton("Agregar nuevo");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAgregar.setBounds(98, 438, 194, 46);
		contentPane.add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnModificar.setBounds(366, 438, 194, 40);
		contentPane.add(btnModificar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBorrar.setBounds(644, 438, 194, 40);
		contentPane.add(btnBorrar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBuscar.setBounds(719, 140, 107, 33);
		contentPane.add(btnBuscar);
	}

}
