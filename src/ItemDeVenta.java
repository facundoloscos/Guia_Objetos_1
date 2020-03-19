public class ItemDeVenta {
    //Atributos
    private int id;
    private String descripcion;
    private int cantidad;
    private float pUnitario;
    private float pTotal = preTotal();

    //Metodos

    public ItemDeVenta(int id, String descripcion, int cantidad, float pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
    }

    public float preTotal(){
        float precioTotal = pUnitario*cantidad;
        return precioTotal;
    }

    @Override
    public String toString() {
        return "ItemDeVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", pUnitario=" + pUnitario +
                ", pTotal=" + preTotal() +
                '}';
    }
}
