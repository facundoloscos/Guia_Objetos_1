public class Hora {
    //Atributos
    private int hora;
    private int minuto;
    private int segundo;

    //Metodos

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23){
            System.out.println("Hora incorrecta");
        }else{
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59){
            System.out.println("Minuto incorrecto");
        }else{
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59){
            System.out.println("Segundo incorrecto");
        }else{
            this.segundo = segundo;
        }
    }

    public String mostrar (){  //Inciso 1
        String horita, minutito, segundito;
        if (this.hora < 10){
            horita = "0"+this.hora;
        }else{
            horita = ""+this.hora;
        }
        if (this.minuto < 10){
            minutito = ":0"+this.minuto;
        }else{
            minutito = ":"+this.minuto;
        }
        if (this.segundo < 10){
            segundito = ":0"+this.segundo;
        }else{
            segundito = ":"+this.segundo;
        }
        return horita+minutito+segundito;
    }

    public void avanzaSegundo (){  //Inciso 2
        segundo ++;
        if (segundo == 60){
            segundo = 0;
            minuto++;
            if (minuto == 60){
                minuto = 0;
                hora++;
                if (hora == 24){
                    hora = 0;
                }
            }
        }
    }

    public void retrocedeSegundo (){  //Inciso 3
        segundo --;
        if (segundo == -1){
            segundo = 59;
            minuto --;
            if (minuto == -1){
                minuto = 59;
                hora --;
                if (hora == -1){
                    hora = 23;
                }
            }
        }
    }

}
