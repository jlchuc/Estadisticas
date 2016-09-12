/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset;

import linkedlist.LinkedList;
import linkedlist.Node;

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
        Node n = new Node();
        n.setData(value);
        lista.add(n);
    }

    public int size() {
        return lista.size();
    }

    public double average() throws Exception {
        int n = lista.size();
        if (n > 0) {
            Node nodo = null;
            double suma = 0.0;
            for (int i = 0; i < n; i++) {
                nodo = lista.get(i);
                suma += nodo.getData();
            }
            return suma / n;
        } else {
            throw new Exception("Lista vac�a");
        }
    }

    public double stdDev() throws Exception {
        int n = lista.size();
        double promedio = average();
        if (n > 1) {
            Node nodo = null;
            double suma = 0.0;
            for (int i = 0; i < n; i++) {
                nodo = lista.get(i);
                suma += Math.pow(nodo.getData() - promedio, 2);
            }
            return Math.sqrt(suma / (n - 1));
        } else {
            throw new Exception("Datos no suficientes para calcular Desv. Std.");
        }
    }
    
}
