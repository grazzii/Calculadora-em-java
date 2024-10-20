import java.util.Scanner; 

public class Nome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Oi usuário!");
        System.out.println("Digite seu nome: ");

        String nome = sc.nextLine();
        System.out.println("Seja bem vindo! " + nome);

        
    }
}