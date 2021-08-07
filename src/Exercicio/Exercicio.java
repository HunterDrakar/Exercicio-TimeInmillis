package Exercicio;

import java.util.Date;

public class Exercicio {

    public static void main(String[] args) {

        Date anoAniversario = new Date(1024455600000L);

        Date anoFuturo = new Date(1273892400000L);

        boolean isAfter = anoAniversario.after(anoFuturo);

        if (isAfter == true) {
            System.out.println("Essa data é posterior a 15 de maio de 2010");
        }
        else{
            System.out.println("Essa data é anterior a 15 de maio de 2010");
        }
    }
}