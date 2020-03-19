import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner entry = new Scanner(System.in);
        int opcion;
        char control = 's';

        do{
            System.out.println("\t\t\t\t--Guia Objetos 1--\n");
            System.out.println("Elija ejercicio: \n");
            System.out.println("-|1|-|2|-|3|-|4|-|5|-");
            opcion = entry.nextInt();

            switch (opcion){
                case 1:
                    float alto, ancho;
                    //Inciso a:
                    Rectangulo r = new Rectangulo();

                    //Inciso b:
                    System.out.println("Alto: "+r.getAlto());
                    System.out.println("Ancho: "+r.getAncho());

                    //Inciso c:
                    System.out.println("Area: "+r.area());
                    System.out.println("Perimetro: "+r.perimetro());

                    //Inciso d:
                    System.out.print("Ingrese nuevo alto por favor: ");
                    alto = entry.nextFloat();
                    System.out.print("Ingrese nuevo ancho: ");
                    ancho = entry.nextFloat();
                    r.setAlto(alto);
                    r.setAncho(ancho);

                    //Inciso e:
                    System.out.println("Nueva Area: "+r.area());
                    System.out.println("Nuevo Perimetro: "+r.perimetro());

                    //Inciso f:
                    Rectangulo nuevoR = new Rectangulo();
                    System.out.println("Segundo Rectangulo:");
                    System.out.println("Alto: "+nuevoR.getAlto());
                    System.out.println("Ancho: "+nuevoR.getAncho());
                    break;
                case 2:
                    //Inciso a:
                    Empleado emple1 = new Empleado(23456345, "Carlos", "Gutoerrez", 25000);

                    //Inciso b:
                    Empleado emple2 = new Empleado(34234123, "Ana", "Sanchez", 27500);

                    //Inciso c:
                    System.out.println(emple1.toString());
                    System.out.println(emple2.toString());

                    //Inciso d:
                    emple1.aumento(15);
                    System.out.println("Salario Anual de Carlos luego del aumento: "+emple1.salarioAnual());
                    break;
                case 3:
                    //Inciso a:
                    ItemDeVenta item1 = new ItemDeVenta(1, "Silla", 10, 150);

                    //Inciso b:
                    System.out.println(item1.toString());
                    break;

                default:
                    System.out.println("Opcion Invalida!");
            }

            System.out.println("Desea continuar? (s/n)");
            control = entry.next().charAt(0);

        }while ((control == 's') || (control == 'S'));
        System.out.println("Gracias por su visita!!!");

    }
}
