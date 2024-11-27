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
    public JLabel lblTitulo;
    public JTextField textField;
    public JButton btnCalcularRepartidores;
    public JLabel lblProgreso;
    public JButton btnCalcularVendedor;
    

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

        
        btnCalcularRepartidores = new JButton("Nomina Repartidores");
        btnCalcularRepartidores.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnCalcularRepartidores.setBounds(503, 181, 220, 40);
        contentPane.add(btnCalcularRepartidores);
        
        textField = new JTextField();
        textField.setBounds(503, 478, 240, 19);
        contentPane.add(textField);
        textField.setColumns(10);
        
        lblProgreso = new JLabel("Progreso");
        lblProgreso.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblProgreso.setBounds(559, 412, 119, 56);
        contentPane.add(lblProgreso);
        
        btnCalcularVendedor = new JButton("Nomina Vendedor");
        btnCalcularVendedor.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnCalcularVendedor.setBounds(503, 260, 220, 40);
        contentPane.add(btnCalcularVendedor);
    }
}
