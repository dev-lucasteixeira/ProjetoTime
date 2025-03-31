public class Time {
    private int hora;
    private int minuto;
    private int segundos;

    public void setTime(int hora, int minuto, int segundos){
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
    }

    public Time(int hora, int minuto){
        super();
        this.hora = hora;
        this.minuto = minuto;
    }

    public Time(int hora){
        super();
        this.hora = hora;
    }

    public Time(){
        super();
    }

    public void setTime(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = 0;
    }

    public void setTime(int hora){
        this.hora = hora;
        this.minuto = 0;
        this.segundos = 0;
    }

    public String exibirHoraUniversal(){
        return formatNumero(hora) + ":" + formatNumero(minuto) + ":" + formatNumero(segundos);
    }

    public String exibirHoraPadrao(){
        String strHora, sufixo;
        if (this.hora == 12) {
            strHora = "12";
            sufixo = "PM";
        }
        else if (this.hora == 0){
            strHora = "12";
            sufixo = "AM";
        }
        else if (this.hora >= 1 && this.hora <= 11) {
            strHora = formatNumero(hora);
            sufixo = "AM";
        }
        else {
            strHora = formatNumero(this.hora - 12);
            sufixo = "PM";
        }
        return strHora + ":" + formatNumero(minuto) + ":" + formatNumero(segundos);
    }

    private String formatNumero(int numero){
        if (numero < 10){
            return "0" + numero;
        }
        return String.valueOf(numero);
    }
}
