/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset;

import linkedlist.LinkedList;

/**
 *
 * @author JorgeLuis
 */
public class DataSet {

    private LinkedList lista;

    public DataSet() {
        lista = new LinkedList();
    }

    public void add(double value) {
        lista.add(value);
    }

    public int size() {
        return lista.size();
    }

    public double average() throws Exception {
        int n = lista.size();
        if (n > 0) {
            double value;
            double suma = 0.0;
            for (int i = 0; i < n; i++) {
                value = lista.get(i);
                suma += value;
            }
            return suma / n;
        } else {
            throw new Exception("Lista vacía");
        }
    }

    public double stdDev() throws Exception {
        int n = lista.size();
        double promedio = average();
        if (n > 1) {
            double value;
            double suma = 0.0;
            for (int i = 0; i < n; i++) {
                value = lista.get(i);
                suma += Math.pow(value - promedio, 2);
            }
            return Math.sqrt(suma / (n - 1));
        } else {
            throw new Exception("Datos no suficientes para calcular Desv. Std.");
        }
    }
    
}
