import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite sua agência:");
        int numeroAgencia = scanner.nextInt();
        
        System.out.println("Digite o valor do deposito: ");
        float saldo = scanner.nextFloat();
    
        scanner.close();  
    
        System.out.println("O nome do cliente é: " + nomeCliente + " \n Obrigado por criar uma conta em nosso banco, \n sua agência é: " + numeroAgencia + "\n Conta é: " + numeroConta + " e seu saldo é: " + saldo + " já está disponível");      
                
    }

}
