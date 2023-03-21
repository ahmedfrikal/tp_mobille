package org.example.Exercise2;

public class MyListLinked {

    //Taille de tableau
    private int size;
    private Node premierElement;
    public MyListLinked(){
        size=0;
        premierElement=null;
    }
    public  int getSize(){return size;}

    public void AjouterAvant(int data)
    {
        Node newNode=new Node(data);
        newNode.setNodeNv(newNode.getNodeNv());
        newNode.setNodeNv(premierElement);
        premierElement=newNode;
        size++;
    }

}
