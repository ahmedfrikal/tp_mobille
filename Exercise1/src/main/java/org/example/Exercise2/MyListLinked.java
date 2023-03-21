package org.example.Exercise2;

public class MyListLinked {
<<<<<<< HEAD

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
    public  void listDisplay()
    {
        Node nodeAfficher=premierElement;
        while (nodeAfficher!=null)
        {
            System.out.println(nodeAfficher.getNombre());
            nodeAfficher=nodeAfficher.getNodeNv();
        }
    }

=======
>>>>>>> parent of b2cebfa (Ajouter des attribut de class et methode get pour size de tableau)
}
