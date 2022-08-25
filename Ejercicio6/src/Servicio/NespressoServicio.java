/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidades.Nespresso;
import java.util.Scanner;


public class NespressoServicio {

    Scanner leer = new Scanner(System.in);

    public Nespresso llenarCafetera() {
        Nespresso c1 = new Nespresso();
        c1.setCapacidadMaxima(30);
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La cafetera esta al maximo, contiene para " + c1.getCapacidadMaxima() + " cafes");
        return c1;
    }

    public Nespresso servirTaza(Nespresso c1) {
        int t1 = 1, t2 = 2, t3 = 3;
        System.out.println("Ingrese el tamano de la taza que desea servirse");
        System.out.println("Las opciones son: ");
        System.out.println("1)Taza chica");
        System.out.println("2)Taza mediana");
        System.out.println("3)Taza grande");

        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                if (c1.getCantidadActual() < 1) {
                    System.out.println("No hay cafe suficiente, por favor recargar la maquina");
                    break;
                } else {
                    c1.setCantidadActual(c1.getCantidadActual() - 1);
                    System.out.println("Ya podes retirar tu taza de cafe");
                    break;
                }

            case 2:
                if (c1.getCantidadActual() < 2) {
                    System.out.println("No hay cafe suficiente, por favor recargar la maquina");
                    break;
                } else {
                    c1.setCantidadActual(c1.getCantidadActual() - 2);
                    System.out.println("Ya podes retirar tu taza de cafe");
                    break;
                }

            case 3:
                if (c1.getCantidadActual() < 3) {
                    System.out.println("No hay cafe suficiente, por favor recargar la maquina");
                    break;
                } else {
                    c1.setCantidadActual(c1.getCantidadActual() - 3);
                    System.out.println("Ya podes retirar tu taza de cafe");
                    break;
                }

        }

        return c1;
    }

    public Nespresso vaciarCafetera(Nespresso c1) {
        c1.setCantidadActual(0);
        System.out.println("La cafetera fue vaciada con exito");
        return c1;
    }

    public Nespresso agregarCafe(Nespresso c1) {
        System.out.println("Ingresa la cantidad que deseas agregar");
        int cant = leer.nextInt();
        if ((c1.getCantidadActual() + cant)> c1.getCapacidadMaxima()){
            System.out.println("No podes ingresar tanta cantidad porque excede la capacidad maxima de :" + c1.getCapacidadMaxima());
                   System.out.println("Ingresa la cantidad que deseas agregar");
                   cant = leer.nextInt();
        }else {
            c1.setCantidadActual(c1.getCantidadActual() + cant);
        }
        
        System.out.println("La cantidad actual de la cafetera es: " + c1.getCantidadActual());
        return c1;
    }
}
