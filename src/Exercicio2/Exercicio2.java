package Exercicio2;

import java.util.Calendar;
import java.util.Date;

public class Exercicio2 {

    public static void main(String[] args){

        Calendar agora = Calendar.getInstance();

        System.out.printf("A data de emissão do boleto é: %tD\n ", agora);

        agora.add(Calendar.DATE, 10);
        System.out.printf("A data de vencimento do boleto é no dia: %tD\n", agora);


        if(agora.get(Calendar.DAY_OF_WEEK) == 1){
            agora.add(Calendar.DATE, 1);

            System.out.printf("Você irá pagar o boleto no dia: %tD\n ", agora);
        }
        else if (agora.get(Calendar.DAY_OF_WEEK) == 7){
            agora.add(Calendar.DATE, 2);

            System.out.printf("Você irá pagar o boleto no dia: %tD\n ", agora);

        }
    }

}