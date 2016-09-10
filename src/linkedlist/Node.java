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
public class Node {

    private double data;
    private Node nextNode;
    private Node previousNode;

    public Node() {
        nextNode = null;
        previousNode = null;
    }

    public void setData(double value) {
        data = value;
    }

    public double getData() {
        return data;
    }

    public void setNextNode(Node n) {
        nextNode = n;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setPreviousNode(Node n) {
        previousNode = n;
    }

    public Node getPreviousNode() {
        return previousNode;
    }
}
