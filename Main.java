import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        //criando um objeto a partir da classe calculadora
        //java segue como se fosse varias caixinhas uma dentro da outra
        //classe existente/ variavel que me permite acessar o metodo dentro da classe/ criação do objeto
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
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        int menu = sc.nextInt(); 

        switch (menu) {
            case 1:
                System.out.println("Resultado da soma: " + calcular.somar(numero1, numero2));
                //oq me permite acessar oq esta dentro da classe calculadora,
                // é a variavel de acesso que eu dei pra ela no começo do codigo
                //atraves dessa variavel de acesso que consigo acessar tudo que ta dentro da classe calculadora
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calcular.subtrair(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + calcular.multiplicacao(numero1, numero2));
                break;
                case 4:
                System.out.println("Resultado da divisão: " + calcular.divisao(numero1, numero2));
                break;

            default: //se nenhuma dessas opçoes derem certo use o default
                System.out.println("Opção inválida.");
                break;
        }

        sc.close(); //fecha o scanner sempre pra economizar memoria
    }
}
