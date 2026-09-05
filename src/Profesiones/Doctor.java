//Narco= Doctor

package profesiones;

import java.util.Vector;
import personas.Persona;

public class Doctor extends Persona {
    private Vector<Enfermero> enfermeros;
    private Vector<Recepcionista> recepcionistas;

    public Doctor(String pName, int pEdad) {
        super(pName,(byte)pEdad); // cuando se desea llamar al constructor del padre, se debe hacer solo dentro de otro constructor y debe ser la primer línea de código
        enfermeros = new Vector<Enfermero>();
        recepcionistas = new Vector<Recepcionista>();
    }

    public void contratarEnfermero(Enfermero pEnfermero) {
        enfermeros.add(pEnfermero);
        System.out.println(pEnfermero.getNombre()+" ahora trabaja con "+this.getNombre());
    }

    public void contratarRecepcionista(Recepcionista pRecepcionista) {
        recepcionistas.add(pRecepcionista);
        System.out.println(pRecepcionista.getNombre()+" ahora trabaja con "+this.getNombre());
    }

    // estoy encapsulando al no exponer la lista de dealers, solo retorno la cantidad
    public int getCantidadRecepcionistas() {
        return recepcionistas.size();
    }

    public int getCantidadEnfermeros() {
        return enfermeros.size();
    }

    //un sabor del polimorfismo
    public void despedir(Persona pPersona) {
        if (pPersona!=null) {
            if (pPersona instanceof Enfermero enfermero) {
                enfermeros.remove(enfermero);
            } else if (pPersona instanceof Recepcionista recepcionista) {
                recepcionistas.remove(recepcionista);
            }
        }
    }
}