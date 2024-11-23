package controlador;
	
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JOptionPane;
	import modeloDao.RepartidorDao;
	import modeloDto.Repartidor;
	import modeloDto.Vendedor;
	import vista.VistaRepartidor;
	
	public class ControllerRepartidor implements ActionListener {
		  private Repartidor repartidor;
		  private RepartidorDao modelo;
		  private VistaRepartidor vista;
		  private int index;
	
		    public ControllerRepartidor(VistaRepartidor vista) {
		        this.vista = vista;
		        this.modelo = new RepartidorDao();
		        this.vista.btnAgregar.addActionListener(this);
		        this.vista.btnBorrar.addActionListener(this);
		        this.vista.btnModificar.addActionListener(this);
		        this.vista.btnBuscar.addActionListener(this);
		        this.vista.comboBoxZona.addActionListener(this);
		        this.vista.setVisible(true);
	
		    }
	
		    @Override
		    public void actionPerformed(ActionEvent e){
		        /*
		         * Registra un nuevo repartidor
		         */
		    if (e.getSource().equals(vista.btnAgregar)) {
		    	//repartidor = new Repartidor();
	            boolean datosCompletos = true;
	        try {
	        	int id = Integer.valueOf(vista.textFieldId.getText());
  	            String nombre = vista.textFieldNombre.getText();
  	            int edad = Integer.valueOf(vista.textFieldEdad.getText());
  	            int anio = Integer.valueOf(vista.textFieldIngreso.getText());
  	            int repartos = Integer.valueOf(vista.textFieldRepartos.getText());
  	            int zona = Integer.valueOf(vista.comboBoxZona.getSelectedItem().toString());
  	            
  	            repartidor = new Repartidor(id,nombre,edad,anio,repartos,zona);
  	            
  	            repartidor.setIdentificacion(Integer.valueOf(vista.textFieldId.getText()));
	            repartidor.setNombre(vista.textFieldNombre.getText());
	            repartidor.setEdad(Integer.valueOf(vista.textFieldEdad.getText()));
	            repartidor.setAnio_ingreso(Integer.valueOf(vista.textFieldIngreso.getText()));
	            repartidor.setZona(Integer.valueOf((String) vista.comboBoxZona.getSelectedItem()));
	            
	            if(modelo.create(repartidor)) {
	            	JOptionPane.showMessageDialog(null, "Se agrego el repartidor");  
	            }else {
	            	JOptionPane.showMessageDialog(null, "Se produjo un error al crear el repartidor");  
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
		            JOptionPane.showMessageDialog(null, "El campo de identificacion no puede estar vacío.");
		            limpiarCampos(); // Limpia los campos si el ID está vacío
		            return;
		        }
	
		        try {
		            int id = Integer.valueOf(idText); // Convierte el ID a un entero
		            
		            repartidor = modelo.read(id); // Busca el repartidor en la base de datos
	
		            if (repartidor == null) { // Si no se encuentra
		                JOptionPane.showMessageDialog(null, "El repartidor no existe.");
		                limpiarCampos(); // Limpia los campos si la búsqueda falla
		                return; // Sal del método
		            }else {
	
		            // Si el repartidor existe, llena los campos con sus datos
		            index = modelo.buscarIndex(repartidor);
		            vista.textFieldNombre.setText(repartidor.getNombre());
		            vista.textFieldEdad.setText(String.valueOf(repartidor.getEdad()));
		            vista.textFieldIngreso.setText(String.valueOf(repartidor.getAnio_ingreso()));
		            vista.comboBoxZona.setSelectedItem(String.valueOf(repartidor.getZona()));
		            vista.textFieldRepartos.setText(String.valueOf(repartidor.getNumeroDeRepartos()));
		            }
	
		        } catch (Exception ee) { // Si el ID no es un número válido
		            JOptionPane.showMessageDialog(null, "Por favor, ingresa un ID válido.");
		            limpiarCampos(); // Limpia los campos si el ID es inválido
		        }
		    }
		         /*
		          * Borrar un repartidor de los datos
		          */
		    	if (e.getSource().equals(vista.btnBorrar)) {
		    		if (repartidor == null) {
		    			JOptionPane.showMessageDialog(null, "Primero debes buscar un repartidor válido.");
		            	return; // Detener la ejecución si no hay repartidor seleccionado
		        }
		        // Continuar con la lógica de borrado
		    		int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de borrar a este empleado?", "Confirmar", JOptionPane.YES_NO_OPTION);
		    		if (respuesta == JOptionPane.YES_OPTION) {
		    			boolean borrado = modelo.Delete(repartidor);
		    			if (borrado) {
		    				JOptionPane.showMessageDialog(null, "Repartidor borrado de la lista.");
		    				limpiarCampos();// Crear un método para reiniciar los campos
		    			}	else {
		                	JOptionPane.showMessageDialog(null, "Se presentó un error al borrar el empleado.");
		            }
		        }
		    }
		          /*
		           * Modifica los datos de los repartidores
		           */
		          if(e.getSource().equals(vista.btnModificar)) {
		        	  if(repartidor == null) {//Validar si el vendedor existe
		        		  JOptionPane.showMessageDialog(vista, "El repartidor debe existir antes de modificarlo");
		        	  }
		        	  try {
		        		  repartidor.setIdentificacion(Integer.parseInt(vista.textFieldId.getText()));
		        		  repartidor.setNombre(vista.textFieldNombre.getText());
		        		  repartidor.setNumeroDeRepartos(Integer.parseInt(vista.textFieldRepartos.getText()));
		        		  repartidor.setZona(Integer.valueOf(vista.comboBoxZona.getSelectedItem().toString()));
		        		  repartidor.setEdad(Integer.parseInt(vista.textFieldEdad.getText()));
		        		  repartidor.setAnio_ingreso(Integer.parseInt(vista.textFieldIngreso.getText()));
		        	 
		        	  int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de modificar a este empleado?", "Confirmar", JOptionPane.YES_NO_OPTION); 
		        	  if(respuesta == JOptionPane.YES_OPTION) {
		        		  modelo.Update(index, repartidor); 
		        		  JOptionPane.showMessageDialog(null, "Los datos del empleado fueron modificados."); 
		        		  } 
		        	  } catch(Exception ee){
		        		  JOptionPane.showMessageDialog(null, "Por favor, ingresa valores válidos.");
		        		  
		         }
		       }
		    }
		    
		    private void limpiarCampos() {
		        repartidor = null; // Reinicia el objeto
		        vista.textFieldId.setText("");
		        vista.textFieldNombre.setText("");
		        vista.textFieldEdad.setText("");
		        vista.textFieldIngreso.setText("");
		        vista.textFieldRepartos.setText("");
		        vista.comboBoxZona.setSelectedIndex(0);
		    }
		}
