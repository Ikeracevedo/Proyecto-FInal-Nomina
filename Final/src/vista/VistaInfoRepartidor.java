package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaInfoRepartidor extends JFrame {

    public static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JTable tableRepartidores;
    public JTextField textFieldValorPagar;
    public JLabel lblTitulo;
    public JButton btnMostrarTabla;
    public JButton btnValorTotalPagar;
    public JLabel lblNombre;
    public JLabel lblIngreso;
    public JLabel lblSalarioBasico;
    public JLabel lblZona;
    public JLabel lblAcumuladoRepartos;
    public JLabel lblDescuentos;
    public JLabel lblTotal;
    public JLabel lblIdentificacin;

    /**
     * Create the frame.
     */
    public VistaInfoRepartidor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1293, 742);
        contentPane = new JPanel();
        contentPane.setForeground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblTitulo = new JLabel("Nomina Repartidores");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblTitulo.setBounds(503, 21, 295, 88);
        contentPane.add(lblTitulo);
        
        lblNombre = new JLabel("Nombre"); 
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNombre.setBounds(282, 115, 62, 14); 
        contentPane.add(lblNombre); 
        
        lblIngreso = new JLabel("Año Ingreso"); 
        lblIngreso.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblIngreso.setBounds(405, 106, 91, 32); 
        contentPane.add(lblIngreso); 
        
        lblSalarioBasico = new JLabel("Salario Básico"); 
        lblSalarioBasico.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblSalarioBasico.setBounds(544, 115, 100, 14); 
        contentPane.add(lblSalarioBasico);
        
        lblZona = new JLabel("Zona"); 
        lblZona.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblZona.setBounds(710, 115, 41, 14); 
        contentPane.add(lblZona); 
        
        lblAcumuladoRepartos = new JLabel("Acumulado"); 
        lblAcumuladoRepartos.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblAcumuladoRepartos.setBounds(837, 115, 82, 14); 
        contentPane.add(lblAcumuladoRepartos); 
        
        lblDescuentos = new JLabel("Descuentos"); 
        lblDescuentos.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblDescuentos.setBounds(979, 115, 82, 14);
        contentPane.add(lblDescuentos); 
        
        lblTotal = new JLabel("Total"); 
        lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblTotal.setBounds(1136, 115, 41, 14); 
        contentPane.add(lblTotal);

        tableRepartidores = new JTable();
        tableRepartidores.setModel(new DefaultTableModel(
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
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"Identificaci\u00F3n", "Nombre", "A\u00F1o Ingreso", "Salario B\u00E1sico", "Zona", "Acumulado Repartos", "Descuentos", "Total"
        	}
        ) {
        	boolean[] columnEditables = new boolean[] {
        		false, false, false, false, false, false, true, true
        	};
        	public boolean isCellEditable(int row, int column) {
        		return columnEditables[column];
        	}
        });
        tableRepartidores.setBounds(92, 140, 1135, 384);
        contentPane.add(tableRepartidores);

        btnMostrarTabla = new JButton("Consultar repartidores");
        btnMostrarTabla.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnMostrarTabla.setBounds(188, 595, 257, 40);
        contentPane.add(btnMostrarTabla);

        // Acción para el botón "Consultar repartidores"
        btnMostrarTabla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar al pulsar el botón
            }
        });

        btnValorTotalPagar = new JButton("Valor a pagar");
        btnValorTotalPagar.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnValorTotalPagar.setBounds(606, 595, 192, 40);
        contentPane.add(btnValorTotalPagar);

        textFieldValorPagar = new JTextField();
        textFieldValorPagar.setBackground(new Color(255, 255, 255));
        textFieldValorPagar.setEditable(false);
        textFieldValorPagar.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldValorPagar.setFont(new Font("Tahoma", Font.PLAIN, 22));
        textFieldValorPagar.setBounds(873, 595, 218, 40);
        contentPane.add(textFieldValorPagar);
        textFieldValorPagar.setColumns(10);
        
        lblIdentificacin = new JLabel("Identificación");
        lblIdentificacin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblIdentificacin.setBounds(118, 113, 100, 14);
        contentPane.add(lblIdentificacin);
    }
}

