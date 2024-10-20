import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //criação de um scanner, "caixa que guarda infos fornecidas pelo usuario"

        System.out.println("Oi usuário!");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine(); //tipo / nome da variavel/ sc (chama o metodo scanner) / nextline (faz com que guarde a info ate o final)
        

        System.out.println("Seja bem-vindo! " + nome);
        System.out.println("Agora, faça a multiplicação de dois números");


        System.out.print("Escolha um número: ");
        int numero1 = sc.nextInt(); //tipo / nome variavel/ chama o scanner/ faz com que leia ate o final
        
        System.out.print("Escolha um segundo número: ");
        int numero2 = sc.nextInt(); //tipo / nome variavel/ chama o scanner/ faz com que leia ate o final


        Multiplicacao calcula = new Multiplicacao(); //calcula é nome do objeto criado a partir da classe Multiplicacao. é o que vai "chamar" o método multiplicar.
        int resultado = calcula.multiplicar(numero1, numero2); //tipo / variavel/ chama o objeto calcula/ chama o metodo da multiplicacao/ parametros
        System.out.println("O resultado da multiplicação é: " + resultado);
        
        sc.close();
    }
}
