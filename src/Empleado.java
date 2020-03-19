public class Empleado {
    //Atributos
    private int dni;
    private String nombre;
    private String apellido;
    private float salario;

    //Metodos

    public Empleado(int dni, String nombre, String apellido, float salario) {   //Constructor
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public float salarioAnual(){
        float sAnual = salario * 12;
        return sAnual;
    }

    public void aumento(float num){
        float incremento = (salario*num)/100;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
