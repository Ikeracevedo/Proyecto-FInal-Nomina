package modeloDao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.*;

import modeloDto.Vendedor;

public class VendedorDao {
	private List<Vendedor> listaVendedor;
	private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo;
	
	public VendedorDao() {
        this.archivo = "vendedor";
        File file = new File (archivo);
        if (file.isFile()) {
            try{
                this.entrada = new ObjectInputStream(new FileInputStream(archivo));
                this.listaVendedor = (ArrayList<Vendedor>) entrada.readObject();
                this.entrada.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
                guardar();
            } 
        }else{
            listaVendedor = new ArrayList<>();
        }
    }
        
	 /*
     * Guarda los datos en la capa de persistencia
     */

     public void guardar(){
        try{
            this.salida = new ObjectOutputStream(new FileOutputStream(archivo));
            this.salida.writeObject(listaVendedor);
            this.salida.close();
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
     }
     
     /**
      * Funcion para agregar nuevos Vendedores a la lista de objetos
      * @param vendedor
      * @return
      */
	
	public boolean create (Vendedor vendedor) {
		return listaVendedor.add(vendedor);
	}
	
	/*
	 * Funcion para buscar un vendedor en la lista de vendedores
     * @param id parametro clave para buscar dentro de la lista 
     * @return
	 */
	
	public Vendedor read (int id) {
		for (Vendedor vendedor : listaVendedor) {
            if (vendedor.getIdentificacion() == id) {
                return vendedor;
            }
        }
        return null;
	}
	/**
     * Funcion para actualizar los datos del vendedor
     * @param index parametro util para conocer la posicion del vendedor en la lista
     * @param vendedor el objeto de la clase vendedor
     */
    public void Update(int index , Vendedor vendedor){
            listaVendedor.set(index, vendedor);
            guardar();
    }


    /**
     * @param vendedor parametro necesario para saber cual vendedor eliminar dentro de la lista
     * @return
     */
    public boolean Delete(Vendedor repartidor){
        listaVendedor.remove(repartidor);
        guardar();
        return true;
    }

    /**
     * @return
     */
    public List<Vendedor> readAll(){
        return listaVendedor;
    }
    
    /**
     * Funcion para conocer la posicion del vendedor
     * @param vendedor parametro necesario para conocer su posicion
     * @return
     */
    public int buscarIndex(Vendedor vendedor){
        return listaVendedor.indexOf(vendedor);
    }
    
    public double calcularSalario(Vendedor vendedor, Integer TotalVentas){
    	
    	if(LocalDate.now().getYear() - vendedor.getAnio_ingreso() > 20){
            return (((vendedor.getSalarioBase() + ((vendedor.getTotalVentas() * 0.15))) - (vendedor.getSalarioBase() * 0.10) + 100000));
        }
    	else {
    		return ((vendedor.getSalarioBase() + ((vendedor.getTotalVentas() * 0.15))) - (vendedor.getSalarioBase() * 0.10));
        }
    }
}
   

