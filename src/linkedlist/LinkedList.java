/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author JorgeLuis
 */
public class LinkedList {

    private Node first;
    private Node last;
    private int counter;

    public LinkedList() {
        first = null;
        last = null;
        counter = 0;
    }

    public void add(double value) {
        Node n = new Node();
        n.setData(value);
        if (first == null) {
            first = n;
            last = n;
            counter = 1;
        } else {
            last.setNextNode(n);
            n.setPreviousNode(last);
            last = n;
            counter++;
        }
    }

    public int size() {
        return counter;
    }

    public double get(int index) {
        if (index >= 0 && index < size()) {
            Node n = first;
            for (int i = 0; i < index; i++) {
                n = n.getNextNode();
            }
            return n.getData();
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de límites.");
        }
    }

}
