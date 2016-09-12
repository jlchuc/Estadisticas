package estadisticas;

import dataset.DataSet;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JorgeLuis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataSet datos = new DataSet();
        double valor;
        try {
            Scanner entrada = new Scanner(new FileReader("datos.txt"));
            while (entrada.hasNext()) {
                valor = entrada.nextDouble();
                datos.add(valor);
            }
        } catch (InputMismatchException ime) {
            System.err.println("Error en datos de archivo de entrada");
        } catch (FileNotFoundException fnfe) {
            System.err.println("Archivo de entrada no encontrado");
        }

        try {
            System.out.println("Promedio: " + datos.average());
            System.out.println("Desv. Std.: " + datos.stdDev());
        } catch (Exception ex) {
            System.err.println("Error al calcular datos estad�sticos");
        }
    }
}
