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
    public static final long serialVersionUID = 1L;
    private List<Repartidor> listaRepartidores;
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
            this.listaRepartidores = new ArrayList<>();
            guardar();
        }
        
    }

    public void guardar() {
        try {
            this.salida = new ObjectOutputStream(new FileOutputStream(archivo));
            this.salida.writeObject(listaRepartidores);
            this.salida.close();
            System.out.println("Datos guardados correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public boolean create(Repartidor repartidor) {
        return listaRepartidores.add(repartidor);
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
        double descuento;

        if ((repartidor.getZona() == 5) && (LocalDate.now().getYear() - repartidor.getAnio_ingreso() > 5)) {
            salario = ((repartidor.getSalarioBase() + (repartidor.getNumeroDeRepartos() * 10000)) + 50000);
            descuento = salario * 0.08;
            return salario - descuento;
        } else {
            salario = (repartidor.getSalarioBase() + (repartidor.getNumeroDeRepartos() * 10000));
            descuento = salario * 0.08;
            return salario - descuento;
        }
    }
}
