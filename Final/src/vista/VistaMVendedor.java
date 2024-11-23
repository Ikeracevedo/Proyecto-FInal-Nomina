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

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	

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
		
		JLabel lblTitulo = new JLabel("Mayores Vendedores");
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
		
		JLabel lblIdentificacin = new JLabel("Identificación");
		lblIdentificacin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdentificacin.setBounds(202, 143, 100, 14);
		contentPane.add(lblIdentificacin);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(357, 143, 100, 14);
		contentPane.add(lblNombre);
		
		JLabel lblIdentificacin_1_1 = new JLabel("Ingreso");
		lblIdentificacin_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdentificacin_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdentificacin_1_1.setBounds(510, 137, 100, 26);
		contentPane.add(lblIdentificacin_1_1);
		
		JLabel lblIdentificacin_1_1_1 = new JLabel("Salario basico");
		lblIdentificacin_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdentificacin_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdentificacin_1_1_1.setBounds(650, 143, 100, 14);
		contentPane.add(lblIdentificacin_1_1_1);
		
		JLabel lblIdentificacin_1_1_2 = new JLabel("Total de ventas");
		lblIdentificacin_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdentificacin_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdentificacin_1_1_2.setBounds(793, 143, 119, 14);
		contentPane.add(lblIdentificacin_1_1_2);
		
		JLabel lblIdentificacin_1_1_3 = new JLabel("Total comision");
		lblIdentificacin_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdentificacin_1_1_3.setBounds(946, 143, 119, 14);
		contentPane.add(lblIdentificacin_1_1_3);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(458, 275, 119, 32);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpiar.setBounds(683, 275, 119, 32);
		contentPane.add(btnLimpiar);
	}

}
