import java.util.Scanner;

public class teste {
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Olá! Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

    System.out.println("Ótimo, " + nome + ", agora, digite 2 números para realizar as operações matemáticas");
    System.out.println("Digite o primeiro número: ");
    int numero1 = sc.nextInt();
    
    System.out.println("Digite o segundo número: ");
    int numero2 = sc.nextInt();

    System.out.println("1- Adição");
    System.out.println("2- Subtração");
    System.out.println("3- Multiplicação");
    System.out.println("4- Divisão");

    int operacao = sc.nextInt();
    switch(operacao) {
        case 1:
                System.out.println("A soma é: " + calculator.somar(numero1, numero2));
                break;

        case 2:
                System.out.println("A subtração é: " + calculator.subtrair(numero1, numero2));
                break;
        
        case 3:
        System.out.println("A multiplicação é: " + calculator.multiplicar(numero1, numero2));
        break;

        case 4:
        System.out.println("A divisão é: " + calculator.dividir(numero1, numero2));
        break;
    }
    }
}