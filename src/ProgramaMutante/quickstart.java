package programaMutante;

import personas.*;
import poderes.*;
import profesiones.*;

public class quickstart {
    public static void main(String[] args) {

        System.out.println("Hello clase de Poo");

        Persona hila = new Persona();
        Persona p1 = new Persona("Juliana Lopez", (byte)22);

        System.out.println(hila.getNombre());
        hila.cantar();

        System.out.println("------------------------------");

        String nombreResultado = p1.getNombre();
        System.out.println(nombreResultado);
        p1.cantar();

        System.out.println("------------------------------");

        System.out.println("Edad de " + hila.getNombre() + " " + hila.getEdad());

        hila.setEdad((byte)18);

        System.out.println("Edad de " + hila.getNombre() + " " + hila.getEdad());

        System.out.println("------------------------------");

        // Aquí no hubo new, solo es un apuntador a la misma instancia
        // a la que apunta p1
        Persona xyz = p1;

        System.out.println("Edad de " + p1.getNombre() + " " + p1.getEdad());
        System.out.println("Edad de " + xyz.getNombre() + " " + xyz.getEdad());

        xyz.setEdad((byte)27);

        System.out.println("Edad de " + p1.getNombre() + " " + p1.getEdad());

        hila = xyz;

        // Ahora hila, xyz y p1 apuntan a la misma instancia.

        System.out.println("------------------------------");

        Enfermero ari = new Enfermero("Ari Tarasova", 200);

        ari.vender(30);

        System.out.println("Ahora " + ari.getNombre() +
                           " tiene " + ari.getDinero());

        ari.cantar();

        System.out.println("Ahora " + ari.getNombre() +
                           " tiene " + ari.getDinero());

        ari.setNombreFalse();

        System.out.println("Ahora " + ari.getNombre() +
                           " tiene " + ari.getDinero());

        ari.reducirDeudaConIngreso(1500);

        System.out.println("------------------------------");

        // Probando el poder de la herencia en Persona
        // y el polimorfismo de IPower y de Persona

        Persona profesionales[] = new Persona[5];
        IPower poderesDisponibles[] = {new PowerCorazones(),new PowerDinero(), new PowerFuego(), new PowerRayo(),new PowerAgua()};

        for (int i = 0; i < 5; i++) {
            int tipoProfesion = (int)(Math.random() * 3);
            System.out.println(tipoProfesion);
            switch (tipoProfesion) {
                case 0:
                    profesionales[i] = new Enfermero("Ari " + i, 40 * i);
                    break;
                case 1:
                    profesionales[i] = new Doctor("Eimy " + i, 55);
                    break;
                case 2:
                    profesionales[i] = new Recepcionista("Mathías " + i, i + 10);
                    break;
                default:
                    profesionales[i] = new Enfermero("Ari " + i, 40 * i);
            }
            profesionales[i].setPower(poderesDisponibles[i]);
        }

        for (Persona p : profesionales) {
            System.out.println("Ataca " + p.getNombre());
            p.atacar();
        }
    }
}