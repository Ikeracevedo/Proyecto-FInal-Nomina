package modeloDao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modeloDto.Repartidor;
import modeloDto.Vendedor;

public class RepartidorDao {

    private List<Repartidor> listaRepartidores;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo;

    public RepartidorDao() {
        this.archivo = "Repartidor";
        File file = new File(archivo);
        if (file.isFile()) {
            try{
                this.entrada = new ObjectInputStream(new FileInputStream(archivo));
                this.listaRepartidor = (ArrayList<Repartidores>) entrada.readObject();
                this.entrada.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
                guardar();
            } 
        }else{
            listaRepartidores = new ArrayList<>();
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
     * Funcion para agregar nuevos repartidores a la lista de objetos
     * @param repartidor
     * @return
     */
    public boolean create(Repartidor repartidor){

    	return listaRepartidores.add(repartidor);
    	
    }

    /**
     * Funcion para buscar un repartido en la lista de repartidores
     * @param id parametro clave para buscar dentro de la lista 
     * @return
     */
    public Repartidor read(int id){
        for (Repartidor repartidor : listaRepartidores) {
            if (id == repartidor.getIdentificacion()) {
                return repartidor;
            }
      }
      return null;
    }
 
    /**
     * Funcion para actualizar los datos del repartidor
     * @param index parametro util para conocer la poscision del repartidor en la lista
     * @param repartidor el objeto de la clase repartidor
     */
    public void Update(int index , Repartidor repartidor){
            listaRepartidores.set(index, repartidor);
            guardar();
    }
    

    /**
     * @param repartidor parametro necesario para saber cual repartidor eliminar dentro de la lista
     * @return
     */
    public boolean Delete(Repartidor repartidor){
        listaRepartidores.remove(repartidor);
        guardar();
        return true;
    }

    /**
     * @return
     */
    public List<Repartidor> readAll(){
        return listaRepartidores;
    }

    
    /**
     * Funcion para conocer la posicion del repartidor
     * @param repartidor parametro necesario para conocer su posicion
     * @return
     */
    public int buscarIndex(Repartidor repartidor){
        return listaRepartidores.indexOf(repartidor);
    }

    public double calcularSalario(Repartidor repartidor, Integer zona){
    	double salario;
    	double descuento;
    	

        if((repartidor.getZona()==5)&&(LocalDate.now().getYear() - repartidor.getAnio_ingreso() > 5)){
        	salario = ((repartidor.getSalarioBase() + (repartidor.getNumeroDeRepartos() * 10000)) + 50000);
        	descuento = salario * 0.08;
            return salario - descuento;
        }else {
        	salario = (repartidor.getSalarioBase() + (repartidor.getNumeroDeRepartos() * 10000));
        	descuento = salario * 0.08;
        	return salario - descuento;
        }
        
    }
    

}
