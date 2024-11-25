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

public class RepartidorDao {
    
	
    private ArrayList<Repartidor> listaRepartidores;
    
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo;

	public RepartidorDao() {
        this.archivo = "Repartidor";
        File file = new File(archivo);
        if (file.isFile()) {
            try {
                this.entrada = new ObjectInputStream(new FileInputStream(archivo));
                this.listaRepartidores = (ArrayList<Repartidor>) entrada.readObject();
                this.entrada.close();
            } catch (Exception e) {
            	System.out.println(e.getMessage());
                guardar();
            }
        } else {
            listaRepartidores = new ArrayList<>();
            
        }
        
    }
	/*
     * Guarda los datos en la capa de persistencia
     */

    public void guardar() {
        try {
            this.salida = new ObjectOutputStream(new FileOutputStream(archivo));
            this.salida.writeObject(listaRepartidores);
            this.salida.close();
            System.out.println("Datos guardados correctamente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean create(Repartidor repartidor) {
        listaRepartidores.add(repartidor);
        guardar();
        return true;
    }

    public Repartidor read(int id) {
        for (Repartidor repartidor : listaRepartidores) {
            if (id == repartidor.getIdentificacion()) {
                return repartidor;
            }
        }
        return null;
    }

    public void Update(int index, Repartidor repartidor) {
        listaRepartidores.set(index, repartidor);
        guardar();
    }

    public boolean Delete(Repartidor repartidor) {
        listaRepartidores.remove(repartidor);
        guardar();
        return true;
    }

    public List<Repartidor> readAll() {
        return listaRepartidores;
    }

    public int buscarIndex(Repartidor repartidor) {
        return listaRepartidores.indexOf(repartidor);
    }

    public double calcularSalario(Repartidor repartidor, Integer zona) {
        double salario;
        double descuento = repartidor.getSalarioBase()*0.08;
        double bonificacion;
        
        if ((repartidor.getZona() == 5) && (LocalDate.now().getYear() - repartidor.getAnio_ingreso() > 5)) {
            bonificacion = 50000;
        }else {
        	bonificacion = 0;
        }
        
        //Calculamos valores por separado
        salario = (((repartidor.getSalarioBase() + (repartidor.getNumeroDeRepartos() * 10000)) - descuento) + bonificacion);

        //Enviamos los valries
        repartidor.setDescuento(descuento);
		repartidor.setBonificacion(bonificacion);
		
		return salario;
    }
    
}
