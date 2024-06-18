import java.util.Scanner;



public class contaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Scanner

        Scanner sc = new Scanner(System.in);

        // Exibir menssagens para nosso usuario
        System.out.println("Por favor, digite o número da Agência:");
        int numero = sc.nextInt();
        
        
        System.out.println("Por favor, digite a Agência:");
        String agencia = sc.next();

        System.out.println("Por favor, digite seu Nome:");
        String nome = sc.next();

        System.out.println("Por favor, digite o Saldo:");
        double saldo = sc.nextDouble();

       //Imprimir a msg conta criada

       System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta  " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}
