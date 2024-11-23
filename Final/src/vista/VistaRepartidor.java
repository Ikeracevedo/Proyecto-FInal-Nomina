package vista;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VistaRepartidor extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textFieldId;
	public JTextField textFieldNombre;
	public JTextField textFieldEdad;
	public JTextField textFieldIngreso;
	public JTextField textFieldRepartos;
	public JLabel LabelId;
	public JLabel LabelRepartidores;
	public JLabel LabelNombre;
	public JLabel LabelEdad;
	public JLabel LabelIngreso;
	public JLabel LabelRepartos;
	public JLabel LabelZona;
	public JComboBox comboBoxZona;
	public JButton btnAgregar;
	public JButton btnModificar;
	public JButton btnBorrar;
	public JButton btnBuscar;

	/**
	 * Create the frame.
	 */
	public VistaRepartidor() {
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
		
		LabelRepartidores = new JLabel("REPARTIDORES");
		LabelRepartidores.setFont(new Font("Tahoma", Font.PLAIN, 30));
		LabelRepartidores.setBounds(504, 31, 214, 54);
		contentPane.add(LabelRepartidores);
		
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
		
		LabelRepartos = new JLabel("Numero de repartos");
		LabelRepartos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelRepartos.setBounds(72, 308, 188, 32);
		contentPane.add(LabelRepartos);
		
		LabelZona = new JLabel("Zona");
		LabelZona.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelZona.setBounds(72, 346, 143, 39);
		contentPane.add(LabelZona);
		
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
		
		textFieldRepartos = new JTextField();
		textFieldRepartos.setBounds(367, 313, 307, 25);
		contentPane.add(textFieldRepartos);
		textFieldRepartos.setColumns(10);
		
		comboBoxZona = new JComboBox();
		comboBoxZona.setEditable(true);
		comboBoxZona.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxZona.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBoxZona.setToolTipText("");
		comboBoxZona.setBounds(366, 359, 89, 21);
		contentPane.add(comboBoxZona);
		
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
