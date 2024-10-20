import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Oi usuário!");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Seja bem-vindo! " + nome);
        System.out.println("Agora, faça a multiplicação de dois números:");

        // Solicita dois números ao usuário
        System.out.print("Escolha um número: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Escolha um segundo número: ");
        int numero2 = sc.nextInt();

        // Cria uma instância da classe Calcula
        Calcula calcula = new Calcula();
        
        // Chama o método multiplicar da classe Calcula
        int resultado = calcula.multiplicar(numero1, numero2);
        
        // Exibe o resultado
        System.out.println("O resultado da multiplicação é: " + resultado);
        
        sc.close();
    }
}
