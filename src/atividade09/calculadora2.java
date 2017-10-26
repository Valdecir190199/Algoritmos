
package atividade09;

import java.util.Scanner;


public class calculadora2 {

    public static void menu() {
        System.out.println("----------Menu--------");
        System.out.println("--------------------");
        System.out.println("------1.Somar------");
        System.out.println("-----2.Subtrair----");
        System.out.println("----3. Multiplicar--");
        System.out.println("-----4. Dividir-----");
        System.out.println("-------0.Sair------");
        System.out.println("--------------------");

    }

    public static double calc(double option) {
        Scanner e = new Scanner(System.in);

        System.out.println("Informe um Numero");
        int a = e.nextInt();

        System.out.println("Informe um Numero");
        int b = e.nextInt();

        double c = 0;

        if (option == 1) {
            c = a + b;
            System.out.println("A resposta é: "+c);
        } else if (option == 2) {
            c = a - b;
System.out.println("A resposta é"+c);
        } else if (option == 3) {
            c = a * b;
System.out.println("A resposta é"+c);
        } else if (option == 4) {
            c = a / b;
System.out.println("A resposta é"+c);
        } else {

            System.out.println("Saindo do programa");
        }
        return c;
    }

    public static double pedirNumer() {
        Scanner e = new Scanner(System.in);

        System.out.println("Digite um numero");

        double a = e.nextDouble();
        return a;
    }

    public static void main(String[] args) {
        
       menu();

        calc(pedirNumer());
        
        
    }

}
