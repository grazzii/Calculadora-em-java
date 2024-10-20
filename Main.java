import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora(); 
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;


        System.out.println("Olá! Digite 2 números! ");
        System.out.println("Digite o primeiro: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo: ");
        numero2 = sc.nextInt();


        System.out.println("Obrigada! Agora escolha a operação que deseja:");
        System.out.println("--------Menu---------");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");

        int menu = sc.nextInt(); 


        switch (menu) {
            case 1:
                System.out.println("Resultado da soma: " + calcular.somar(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calcular.subtrair(numero1, numero2));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close(); 
    }
}
