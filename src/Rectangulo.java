public class Rectangulo {
    //Atributos
    private float ancho = 1.0f;
    private float alto = 1.0f;

    //Metodos

    public float getAncho() {
        return ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float area(){
        float a = alto*ancho;
        return a;
    }

    public float perimetro(){
        float p = 2*(ancho*alto);
        return p;
    }
}
