import java.util.Scanner;
public class TimeTeste {
    public  static void main(String args[]){
        Time t = new Time();
        t.setTime(22,9,56);

        System.out.println(t.exibirHoraUniversal());
        System.out.println(t.exibirHoraPadrao());

    }
}
