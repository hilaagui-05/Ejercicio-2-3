public class Enfermero extends Persona{
    private int cantidadMedicamentos;
    private final int PRECIO_MEDICAMENTO = 2000;// Esa variable escrita una vez
    private final double IMP_VENTAS;
    private int dinero;
    private String nombresEnfermeros[] = {"Ari Tarasova","Eimy Vega"}; //arreglo
    private IPower power;

    public Enfermero(String pName, int pCantidadMedicamentos){
        this.nombre= pName;
        this.cantidadMedicamentos = pCantidadMedicamentos;
        this.dinero= 0;
    }

    public int vender(int pCantidad) {
        int vendido = 0;
        if (pCantidad<=this.cantidadMedicamentos) {
            vendido = pCantidad;
        } else {
            vendido = this.cantidadMedicamentos;
        }

        //this.dinero = this.dinero + (pCantidad * PRECIO_DROGA);
        this.dinero += vendido * PRECIO_MEDICAMENTO;  // esto hace lo mismo que arriba es operar una variable sobre si misma, por ejemplo  x=x+2 -->   x+=2;  -=, *=, /=, %=
        this.cantidadMedicamentos -= vendido;
        System.out.println("Otro cliente feliz con "+vendido+" de medicamento.");
        return vendido;
    }

    public int getDinero(){
        return this.dinero;
    }

    public void setNombreFalse(){
        this.nombre= nombresEnfermeros[(int)Math.random()*3];
        this.edad= (byte)34;
    }

    @Override
    public void reducirDeudaConIngreso(double pIngreso){
        pIngreso -= pIngreso*IMP_VENTAS;
        super.reducirDeudaConIngreso(pIngreso);
    }

    public void escapar() {
        System.out.println("Voy jalando....");
    }


}