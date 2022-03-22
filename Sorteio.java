import util.java.Scanner;
import util.java.Random;

public class Sorteio {
    
    public static void main (String [] args){
 
        Scanner teclado = new Scanner(System.in);
        System.out.println("--SORTEIO--");
        Random gerador = new Random(); // usar random para gerar numero aleatorios
        int c = 1, num;
        double media =0;

        while(c <= 1000){
            num = 1 + gerador.nextInt(100);
            soma += num; // add +  para ir ao número total desejado 0 = 100 do q 1 = 100
            System.out.println(num);
            c++;
        }
        media =/1000.0d;
        System.out.prinln("media", + media);
    }
}