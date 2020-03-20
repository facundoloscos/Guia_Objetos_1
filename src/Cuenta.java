public class Cuenta {
    //Atributos
    private int id;
    private String nombre;
    private float balance;

    //Metodos
    public Cuenta(int id, String nombre, float balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float credito (float deposito){
        balance += deposito;
        return balance;
    }

    public float debito (float sustraccion){
        if ((balance - sustraccion) < 0){
            System.out.println("Usted no tiene el dinero suficiente para realizar la operacion deseada");
        }else{
            balance -= sustraccion;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
