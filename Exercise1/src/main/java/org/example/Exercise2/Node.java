package org.example.Exercise2;

public class Node {
    private int nombre;
    private Node nodeNv;

    public Node getNodeNv() {
        return nodeNv;
    }

    public void setNodeNv(Node nodeNv) {
        nodeNv = nodeNv;
    }
    public Node(int nombre){
        this.nombre= nombre;
        this.nodeNv= null;
    }
}
