public class quickstart {
        public static void main(String[] args) {
        System.out.println("Hello clase de Poo");

        Persona rodri= new Persona();
        Persona p1 = new Persona("Juliana Lopez",(byte)22);

        System.out.println(rodri.getNombre());
        rodri.Cantar();

        System.out.println("------------------------------");

        String nombreResultado= p1.getNombre();
        System.out.println(nombreResultado);
        p1.Cantar();

        System.out.println("------------------------------");

        System.out.println("Edad de "+ rodri.getNombre()+ " "+ rodri.getEdad());
        rodri.setEdad((byte)18);
        System.out.println("Edad de "+ rodri.getNombre()+ " "+ rodri.getEdad());

        System.out.println("------------------------------");
        
        Persona xyz = p1;
        System.out.println("Edad de "+ p1.getNombre()+ " " + p1.getEdad());
        System.out.println("Edad de "+ xyz.getNombre()+ " "+ xyz.getEdad());

        enfermero ari = new enfermero("Ari Tarasova", 200);
        ari.vender(30);
        System.out.println("Ahora" + ari.getNombre() + " tiene " + ari.getDinero());

        ari.cantar();
        ari.nombre= "Ari Tarasova";



    System.out.println("Ahora "+dani.getNombre()+ " tiene "+dani.getDinero());
    dan1.setNombreFalse();
    System.out.println("Ahora "+dani.getNombre()+ " tiene "+dani.getDinero());

    dani.reducirDeudaConIngreso(1500);

    // probando el poder de la herencia en Persona y el polimorfismo de IPower y de Person.

    Persona profesionales[]= new Persona[10];
    IPower poderesDisponibles[] = {new}

    for(int i=0; i<10; i++){
        int tipoProfesion = (int)(Math.random() * 3);
        switch(tipoProfesion){
            case 0:
                profesionales[i] = new Enfermero("Ari " + i, 40*i);
                break;
            case 1:
                profesionales[i] = new Doctor("Eimy" + i,55);
                break;
            case 2:
                profesionales[i] = new Recepcionista("Doctor " + i, "Especialidad " + i);
                break;
            default:
                profesionales[i] = new Persona("Ari " + i *40);
                break;
        }
        profesionales[i].setPower(poderesDisponibles[(int)(Math.random()*2)]);
    }
    for(Persona p: profesionales){
        System.out.println("Ataca "+p.getNombre());
        p.atacar();
    }
}