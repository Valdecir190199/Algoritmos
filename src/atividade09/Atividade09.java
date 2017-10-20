
package atividade09;

import java.util.Random;
import java.util.Scanner;


public class Atividade09 {

    
    public static void main(String[] args) {
       
        numeroAleatorio();
        diaDomes();
        
        
    }
    
    public static int pedirNumero(){
        Scanner e = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int n = e.nextInt();
        
        System.out.println("O valor digitado é "+n);
        return n;
    }
    
    public static int numeroAleatorio(){
        
        Scanner e = new Scanner(System.in);
        
        Random r = new Random();
        
        int n = r.nextInt(60);
        
        System.out.println("O numero Aleatorio é: "+n);
        
        return n;
        
    }
    
    public static String diaDomes(){
        
        String mes;
        int p = pedirNumero();
       
        if(p==1){
            //            System.out.println("O mês correspondente é Janeiro");
            mes = "janeiro";
        }else if(p==2){
            mes = "fevereiro";
        }else if(p==3){
            mes = "março";
        }else if(p==4){
            mes ="abril";
        }
        else if(p==5){
            mes ="maio";
        }
        else if(p==6){
            mes ="junho";
        }
        else if(p==7){
            mes = "julho";
        }
        else if(p==8){
            mes  = "Agosto";
        }else if (p==9){
            mes = "Setembro";
        } 
        else if (p==10){
            mes = "Outubro";
        }
        else if(p==11){
            mes = "Novembro";
        } 
        else if(p==12){
            mes = "Dezembro";
        }
        else{
            mes = "numero invalido";
        }
        
        return mes;
    }
     
}
