package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaLiquidarNomina extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JTable tableNomina;
    public JLabel lblTitulo;
    public JButton btnCalcularNomina;
    public JLabel lblEmpleado;
    public JLabel lblIdentificacion;
    public JLabel lblBonificaciones;
    public JLabel lblDeducciones;
    public JLabel lblTotalPagar;

    /**
     * Create the frame.
     */
    public VistaLiquidarNomina() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1293, 742);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblTitulo = new JLabel("Liquidar Nómina");
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
        lblBonificaciones.setBounds(589, 115, 110, 14);
        contentPane.add(lblBonificaciones);
        
        lblDeducciones = new JLabel("Deducciones");
        lblDeducciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblDeducciones.setBounds(807, 115, 100, 14);
        contentPane.add(lblDeducciones);
        
        lblTotalPagar = new JLabel("Total a Pagar");
        lblTotalPagar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblTotalPagar.setBounds(1013, 115, 100, 14);
        contentPane.add(lblTotalPagar);

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

        btnCalcularNomina = new JButton("Calcular Nómina");
        btnCalcularNomina.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnCalcularNomina.setBounds(529, 596, 192, 40);
        contentPane.add(btnCalcularNomina);
    }
}
