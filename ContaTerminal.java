package teste;

import java.util.Scanner;

public class ContaTerminal {


    

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
      
		String nome;
       int numero;
      int agencia;
       Double saldo = 100.05;
		
       	System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite o numero da sua conta: ");
        numero = sc.nextInt();
        
		System.out.println("Digite sua agencia: ");
        agencia =  sc.nextInt();
        System.out.println(	"Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        
        
        sc.close();
    }
}
