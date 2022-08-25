/*
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class personaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingresa tu nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingresa tu edad");
        p1.setEdad(leer.nextInt());
        String opc;
        do {
            System.out.println("Ingresa el genero con el que te percibis");
            System.out.println("H)HOMBRE");
            System.out.println("M)MUJER");
            System.out.println("O)OTRO");
            opc = leer.next();
            opc = opc.toUpperCase();

        } while (!(opc.equals("M") || opc.equals("H") || opc.equals("O")));

        System.out.println("Ingresa tu peso en kg");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingresa tu altura en metros");
        p1.setAltura(leer.nextDouble());

        return p1;

    }

    public int calcularIMC(Persona p1) {
        int rdo;
        double imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        if (imc < 20) {
            return rdo = -1;
        } else if (imc >= 20 && imc <= 25) {
            return rdo = 0;
        } else {
            return rdo = 1;

        }

    }

    public boolean mayorEdad(Persona p1) {

        return p1.getEdad() >= 18;
    }
}
