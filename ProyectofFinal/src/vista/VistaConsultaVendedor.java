package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaConsultaVendedor extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTable tableVendedores;
	public JButton btnConsultaVendedores;
	public JTextField textFieldTotalGeneral;
	public JLabel lblTotalGeneral;
	public JLabel lblNombre;
	public JLabel lblIngreso;
	public JLabel lblSalarioBasico;
	public JLabel lblTotalVentas;
	public JLabel lblAcumuladoRepartos;
	public JLabel lblDescuentos;
	public JLabel lblTotal;
	public JLabel lblIdentificacin;
	public JLabel lblTitulo;
	public JLabel lblId;
	
	@SuppressWarnings("serial")
	public VistaConsultaVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblTitulo = new JLabel("Nomina Vendedores");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTitulo.setBounds(49, 7, 189, 23);
        contentPane.add(lblTitulo);
        
        lblNombre = new JLabel("Nombre"); 
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNombre.setBounds(126, 65, 62, 14); 
        contentPane.add(lblNombre); 
        
        lblIngreso = new JLabel("Año Ingreso"); 
        lblIngreso.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblIngreso.setBounds(219, 56, 91, 32); 
        contentPane.add(lblIngreso); 
        
        lblSalarioBasico = new JLabel("Salario Básico"); 
        lblSalarioBasico.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblSalarioBasico.setBounds(306, 65, 100, 14); 
        contentPane.add(lblSalarioBasico);
        
        lblTotalVentas = new JLabel("Total de Ventas"); 
        lblTotalVentas.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblTotalVentas.setBounds(400, 65, 115, 14); 
        contentPane.add(lblTotalVentas); 
        
        lblAcumuladoRepartos = new JLabel("Total Comision"); 
        lblAcumuladoRepartos.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblAcumuladoRepartos.setBounds(505, 65, 115, 14); 
        contentPane.add(lblAcumuladoRepartos); 
        
        lblDescuentos = new JLabel("Descuentos"); 
        lblDescuentos.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblDescuentos.setBounds(591, 65, 115, 14);
        contentPane.add(lblDescuentos); 
        
        lblTotal = new JLabel("Valor a Pagar"); 
        lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblTotal.setBounds(683, 65, 115, 14); 
        contentPane.add(lblTotal);
		
		btnConsultaVendedores = new JButton("Consultar Nomina Vendedores");
		btnConsultaVendedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultaVendedores.setBounds(276, 11, 196, 23);
		contentPane.add(btnConsultaVendedores);
		
		tableVendedores = new JTable();
		tableVendedores.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Nombre", "A\\u00F1o Ingreso", "Salario Basico", "Total de Ventas", "Total Comision", "Descuentos", "Valor a Pagar"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableVendedores.getColumnModel().getColumn(4).setPreferredWidth(89);
		tableVendedores.setBounds(27, 89, 746, 195);
		contentPane.add(tableVendedores);
		
		lblTotalGeneral = new JLabel("Total General");
		lblTotalGeneral.setBounds(452, 309, 98, 14);
		contentPane.add(lblTotalGeneral);
		
		textFieldTotalGeneral = new JTextField();
		textFieldTotalGeneral.setBounds(560, 306, 86, 20);
		contentPane.add(textFieldTotalGeneral);
		textFieldTotalGeneral.setColumns(10);
		
		lblId = new JLabel("Id");
		lblId.setBounds(38, 66, 46, 14);
		contentPane.add(lblId);
	}
}
