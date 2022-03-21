import java.util.Scanner;

public class Calendario{

    public static String mostrarMesIf(int mes){
    String nomeMes ="";
    if (mes == 1){
        nomeMes = "Janeiro";
    }else if(mes == 2){
        nomeMes = "Fevereiro";
    }else if (mes == 3){
        nomeMes = "Março";
    }else if (mes ==4){
        nomeMes = "Abril";
    }else if (mes == 5){
        nomeMes = "Maio";
    }else if (mes == 6){
        nomeMes = "Junho";
    }else if (mes ==7){
        nomeMes = "Julho";
    }else if(mes == 8){
        nome = "Agosto";
    }else if (mes== 9){
        nomeMes = "Setembro";
    }else if (mes == 10){
        nomeMes = "Outubro";
    }else if (mes == 11){
        nomeMes = "Novembro";
    }else if ( mes == 12){
        nomeMes = "Dezembro";
    }
    return nomeMes;
} 

    public static String mostrarMesSwitch(int mes){
        String nomeMes="";
        switch (mes){
            case 1: 
                nomeMes = "Janeiro";
                break;
            case 2: 
                nomeMes = "Fevereiro";
                break;
            case 3: nomeMes = "Março";
                break;
            case 4: nomeMes = "Abril";
                break;
            case 5: 
                nomeMes = "Maio";
                break;
            case 6: 
                nomeMes = "Junho";
                break;
            case 7: 
                nomeMes = "Julho";
                break;
            case 8: nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10: 
                nomeMes = "Outobro";
                break;
            case 11: 
                nomeMes = "Novembro";
                break;
            case 12: 
                nomeMes = "Dezembro";
                break;
        default:
        break;
    }while (op != 0);



public static void main(String []args){
    int mes;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o mes:");
    mes = teclado.nextInt();
    System.out.println();
    System.out.println(
        "Mes (if) = " + mostrarMesIf(mes)
        );
    System.out.println(
        "Mes (switch = " + mostrarMesSwitch(mes)
        );
    teclado.close();
    }
}