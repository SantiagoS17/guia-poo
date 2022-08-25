/*

 */
package Principal;

import Entidades.Persona;
import Servicio.personaServicio;


public class personaPrincipal {

  
    public static void main(String[] args) {
        personaServicio ps1 = new personaServicio();
//      personaServicio ps2 = new personaServicio();
//      personaServicio ps3 = new personaServicio();
//      personaServicio ps4 = new personaServicio();

        Persona p1 = ps1.crearPersona();
//        ps1.calcularIMC(p1);
//        ps1.mayorEdad(p1);

        Persona p2 = ps1.crearPersona();
//        ps1.calcularIMC(p2);
//        ps1.mayorEdad(p2);

        Persona p3 = ps1.crearPersona();
//        ps1.calcularIMC(p3);
//        ps1.mayorEdad(p3);

        Persona p4 = ps1.crearPersona();
//         ps1.calcularIMC(p4);
//         ps1.mayorEdad(p4);

        int mayores = 0;
        int menores = 0;
        if (ps1.mayorEdad(p1) == true) {
            mayores++;
        } else {
            menores++;
        }
        if (ps1.mayorEdad(p2) == true) {
            mayores++;
        } else {
            menores++;
        }
        if (ps1.mayorEdad(p3) == true) {
            mayores++;
        } else {
            menores++;
        }
        if (ps1.mayorEdad(p4) == true) {
            mayores++;
        } else {
            menores++;
        }

        double promMayores = (mayores * 100) / 4;
        double promMenores = (menores * 100) / 4;

        int bajoPeso = 0;
        int normalPeso = 0;
        int sobrePeso = 0;
        if (ps1.calcularIMC(p1) == -1) {
            bajoPeso++;
            System.out.println(p1.getNombre() + " esta por debajo de su peso ideal");
        } else if (ps1.calcularIMC(p1) == 0) {
            normalPeso++;
        } else {
            sobrePeso++;
        }

        if (ps1.calcularIMC(p2) == -1) {
            bajoPeso++;
        } else if (ps1.calcularIMC(p2) == 0) {
            normalPeso++;
        } else {
            sobrePeso++;
        }

        if (ps1.calcularIMC(p3) == -1) {
            bajoPeso++;
        } else if (ps1.calcularIMC(p3) == 0) {
            normalPeso++;
        } else {
            sobrePeso++;
        }

        if (ps1.calcularIMC(p4) == -1) {
            bajoPeso++;
        } else if (ps1.calcularIMC(p4) == 0) {
            normalPeso++;
        } else {
            sobrePeso++;
        }

        double promFlacos = (bajoPeso * 100) / 4;
        double promNormal = (normalPeso * 100) / 4;
        double promGordos = (sobrePeso * 100) / 4;

        System.out.println("El promedio de personas mayores de edad es: " + promMayores);
        System.out.println("El promedio de personas menores de edad es: " + promMenores);
        System.out.println("");
        System.out.println("El promedio de personas por debajo de su peso ideal es: " + promFlacos);
        System.out.println("El promedio de personas en su peso ideal es: " + promNormal);
        System.out.println("El promedio de personas por encima de su peso ideal es: " + promGordos);
    }

}
