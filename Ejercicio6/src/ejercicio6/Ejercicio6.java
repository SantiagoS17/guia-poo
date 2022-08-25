/*

 */
package ejercicio6;

import Entidades.Nespresso;
import Servicio.NespressoServicio;
import java.util.Scanner;

public class Ejercicio6 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         NespressoServicio s1 = new NespressoServicio();
         Nespresso c1 = s1.llenarCafetera();
        System.out.println("Que deseas hacer ? Ingresa la opcion correspondiente");
        System.out.println("1)Servir una taza");
        System.out.println("2)Agragar cafe manualmente");
        System.out.println("3)Vaciar la cafetera");
        int opc = leer.nextInt();
        
        switch (opc){
         
            case 1 :s1.servirTaza(c1);
                    break;
            case 2 :s1.agregarCafe(c1);
                     break;
            case 3 :s1.vaciarCafetera(c1);
                     break;
        }
     
       
          
      
    }
    
}
