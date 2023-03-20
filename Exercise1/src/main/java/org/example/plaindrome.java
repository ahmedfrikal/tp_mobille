package org.example;

public class plaindrome {
   public boolean verifierNombreSiPalaindrome(int nombre) {
       boolean res = false;
       int resteNombre = 0;
       int nombreReverse = 0;
       if (nombre > 0) {
           if (nombre > 0 && nombre < 10) {
               nombreReverse = nombre;
           } else {
               while (nombre > 0) {
                   resteNombre = (nombre % 10) + resteNombre * 10;
                   //nombreReverse=resteNombre+(resteNombre*10);
                   //System.out.println("Nombre Reverse"+resteNombre);
                   nombreReverse = resteNombre;
                   nombre = nombre / 10;
                   System.out.println(nombre);
               }
           }
       }

       if (nombre == nombreReverse) {
           return true;
       } else {
           return false;
       }
   }
}
