package controlador;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JOptionPane;
	import modeloDao.VendedorDao;
	import modeloDto.Vendedor;
	import vista.VistaVendedor;
	
		public class ControllerVendedor implements ActionListener {
			
			private Vendedor vendedor;
			private VendedorDao modelo;
			private VistaVendedor vista;
			private int index;

		    public ControllerVendedor(VistaVendedor vista) {
		        this.vista = vista;
		        this.modelo = new VendedorDao();
		        this.vista.btnAgregar.addActionListener(this);
		        this.vista.btnBorrar.addActionListener(this);
		        this.vista.btnModificar.addActionListener(this);
		        this.vista.btnBuscar.addActionListener(this);
		        this.vista.setVisible(true);
	
		    }

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (e.getSource().equals(vista.btnAgregar)) {
		            //vendedor = new Vendedor();
		            boolean datosCompletos = true;
		        try {
		        	int id = Integer.valueOf(vista.textFieldId.getText());
	  	            String nombre = vista.textFieldNombre.getText();
	  	            int edad = Integer.valueOf(vista.textFieldEdad.getText());
	  	            int anio = Integer.valueOf(vista.textFieldIngreso.getText());
	  	            int ventas = Integer.valueOf(vista.textFieldTotalVentas.getText());
	  	            
	  	            vendedor = new Vendedor(id,nombre,edad,anio,ventas);
	  	            vendedor.setIdentificacion(Integer.valueOf(vista.textFieldId.getText()));
		            vendedor.setNombre(vista.textFieldNombre.getText());
		            vendedor.setEdad(Integer.valueOf(vista.textFieldEdad.getText()));
		            vendedor.setAnio_ingreso(Integer.valueOf(vista.textFieldIngreso.getText()));
		            vendedor.setTotalVentas(Integer.valueOf(vista.textFieldTotalVentas.getText()));
		            
		            if(modelo.Create(vendedor)) {
		            	JOptionPane.showMessageDialog(null, "Se agrego el vendedor ");  
		            }
		         
		  	     } catch (Exception ee) {
		  				JOptionPane.showMessageDialog(null, "Error faltan datos");
		  				datosCompletos = false;
		  				
		  			} finally {
		  				
		  		        limpiarCampos();
		  		    }
				}
				
		        /*
		         * Busca un nuevo repartidor en los datos si existe muetsra un mensaje sino presenta un error
		         *
		         */
	
		    if (e.getSource().equals(vista.btnBuscar)) {
		        String idText = vista.textFieldId.getText(); // Obtén el ID del campo de texto
		        if (idText.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.");
		            limpiarCampos(); // Limpia los campos si el ID está vacío
		            return;
		        }
	
		        try {
		            int id = Integer.valueOf(idText); // Convierte el ID a un entero
		            
		            vendedor = modelo.Read(id); // Busca el repartidor en la base de datos
	
		            if (vendedor == null) {
		                JOptionPane.showMessageDialog(null, "El repartidor no existe.");
		                limpiarCampos(); 
		            }
		            // Si el repartidor existe, llena los campos con sus datos
		            index = modelo.BuscarIndex(vendedor);
		            vista.textFieldNombre.setText(vendedor.getNombre());
		            vista.textFieldEdad.setText(String.valueOf(vendedor.getEdad()));
		            vista.textFieldIngreso.setText(String.valueOf(vendedor.getAnio_ingreso()));
		            vista.textFieldTotalVentas.setText(String.valueOf(vendedor.getTotalVentas()));
	
		        } catch (NumberFormatException ex) { // Si la identificacion no es un número válido
		            JOptionPane.showMessageDialog(null, "Por favor, ingresa una identificacion válida.");
		            limpiarCampos(); // Limpia los campos si el ID es inválido
		        }
		    }
		    
		    /*
	          * Borrar un repartidor de los datos
	          */
	    	if (e.getSource().equals(vista.btnBorrar)) {
	    		if (vendedor == null) {
	    			JOptionPane.showMessageDialog(null, "Primero debes buscar un repartidor válido.");
	            	return; // Detener la ejecución si no hay repartidor seleccionado
	        }
	        // Continuar con la lógica de borrado
	    		int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de borrar a este empleado?", "Confirmar", JOptionPane.YES_NO_OPTION);
	    		if (respuesta == JOptionPane.YES_OPTION) {
	    			boolean borrado = modelo.Delete(vendedor);
	    			if (borrado) {
	    				JOptionPane.showMessageDialog(null, "Repartidor borrado de la lista.");
	    				limpiarCampos();// Crear un método para reiniciar los campos
	    			}	else {
	                	JOptionPane.showMessageDialog(null, "Se presentó un error al borrar el empleado.");
	            }
	        }
	    }
	    	if(e.getSource().equals(vista.btnModificar)) {
	        	 
	    		if (vendedor == null) { // Validar si el objeto vendedor es nulo
	    	        JOptionPane.showMessageDialog(null, "Primero debes buscar un repartidor antes de modificar.");
	    	    }
	    		try {
	    	        vendedor.setNombre(vista.textFieldNombre.getText());
	    	        vendedor.setEdad(Integer.parseInt(vista.textFieldEdad.getText()));
	    	        vendedor.setAnio_ingreso(Integer.parseInt(vista.textFieldIngreso.getText()));
	    	        vendedor.setTotalVentas(Integer.parseInt(vista.textFieldTotalVentas.getText()));

	    	        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de modificar a este empleado?", "Confirmar", JOptionPane.YES_NO_OPTION); 
		        	  if(respuesta == JOptionPane.YES_OPTION) {
		        		  modelo.Update(index, vendedor); 
		        		  JOptionPane.showMessageDialog(null, "Los datos del empleado fueron modificados."); 
		        		  }  
	    	        }
	    				catch (NumberFormatException ex) {
	    					JOptionPane.showMessageDialog(null, "Por favor, ingresa valores válidos.");
	    	    }
	        	  
	    	}  
	    	
				
		}
			private void limpiarCampos() {
		        vendedor = null; // Reinicia el objeto
		        vista.textFieldId.setText("");
		        vista.textFieldNombre.setText("");
		        vista.textFieldEdad.setText("");
		        vista.textFieldIngreso.setText("");
		        vista.textFieldTotalVentas.setText("");
		    }
}