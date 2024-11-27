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
		LabelId.setBounds(72, 134, 136, 40);
		LabelId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(LabelId);
		
		LabelRepartidores = new JLabel("REPARTIDORES");
		LabelRepartidores.setBounds(504, 31, 214, 54);
		LabelRepartidores.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(LabelRepartidores);
		
		LabelNombre = new JLabel("Nombre");
		LabelNombre.setBounds(72, 188, 118, 25);
		LabelNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(LabelNombre);
		
		LabelEdad = new JLabel("Edad");
		LabelEdad.setBounds(72, 232, 107, 25);
		LabelEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(LabelEdad);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(366, 146, 308, 25);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		LabelIngreso = new JLabel("Año de ingreso");
		LabelIngreso.setBounds(72, 273, 165, 25);
		LabelIngreso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(LabelIngreso);
		
		LabelRepartos = new JLabel("Numero de repartos");
		LabelRepartos.setBounds(72, 308, 188, 32);
		LabelRepartos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(LabelRepartos);
		
		LabelZona = new JLabel("Zona");
		LabelZona.setBounds(72, 346, 143, 39);
		LabelZona.setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		comboBoxZona.setBounds(366, 359, 89, 21);
		comboBoxZona.setEditable(true);
		comboBoxZona.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxZona.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBoxZona.setToolTipText("");
		contentPane.add(comboBoxZona);
		
		btnAgregar = new JButton("Agregar nuevo");
		btnAgregar.setBounds(98, 438, 194, 46);
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnAgregar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(366, 438, 194, 40);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnModificar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(644, 438, 194, 40);
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnBorrar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(719, 140, 107, 33);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnBuscar);
	}
}
