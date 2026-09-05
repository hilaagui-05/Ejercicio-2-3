//Constructor: es el método que inicializa un objeto(instancia)
//java y en general los lenguales de POO, distinguen las firmas de los métodos
//por el nombre del método y el orden de los tipos de datos, NO DEL NOMBRE DE LOS PARÁMETROS,
//si no del DataType

public class Persona{
    private byte edad;
    protected String nombre;
    private double deudasAPagar;

    //private vector(int)
    //Constructor no tiene valor de retorno y se llama igual que la clase
    public Persona(){ //constructor primero reserva memoria luego ejecuta
        //inicializa los atributos
        edad= 19;
        nombre= "Hilary Aguilar";
        deudasAPagar = 10000;
    }

    //un segundo constructor que si recibe parámetros
    public Persona(byte pEdad, String pNombre){
        this();
        this.edad= pEdad;  //Se puede usar this./ que se refiere a está instancia
        this.nombre= pNombre;
    }

    public Persona(String pNombre, byte pEdad){
        this();
        this.edad = pEdad;
        this.nombre = pNombre;
    }

    public Persona(String nombre){
        this();
        this.edad= 0;
        this.nombre = nombre;
        //java no sufre de ambigÜedad
    }

    public String getNombre(){
        return this.nombre;
    }

    public byte getEdad(){
        return this.edad;
    }
    public void setEdad(byte pEdad){
        this.edad= pEdad;
    }

    public void reducirDeudaConIngreso(double pIngreso){
        System.out.println("Debo "+this.deudasAPagar+" y le abono "+pIngreso+ "quedo debiendo "+(this.deudasAPagar-pIngreso));
        this.deudasAPagar -= pIngreso;

    }

    //método
    public void Cantar(){
        System.out.println("Para ser más sincero y certero"+ "\n"+
            "Mi signo de Cáncer es muy vulnerable para un Leo"+"\n"+
            "Puede que sea por Venus que no puedo"+"\n"+
            "Apagar las llamas, y así me quemo en tu fuego");
    }

    public void setPower(IPower pPower){
        this.power= pPower;
    }

    public void atacar(){
        this.power.dispararPoder();
    }
}