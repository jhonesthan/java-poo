import java.util.Scanner;
public class Main {
  
public static void main(String[] args) {
   
   Conta c1 = new Conta("joao", "123", 1000, 300);
   Conta c2 = new Conta("lucas", "321", 1000, 300);
   
   Scanner scan = new Scanner(System.in);
   
   int conta1, conta2;
   int acao;
   int saldo = 1000;
   int deposito;
   int valorDeposito = 1000;
   int sacar;
   int valorSaque =1500;
   int valorTrasferencia = 1000;
   
System.out.println("Digite a opção abaixo");
System.out.println(" [1] DEPÓSITO");
System.out.println(" [2] SAQUE");
System.out.println(" [3] TRANSFERÊNCIA");
System.out.println(" [4] SALDO");

acao = scan.nextInt();

    switch (acao) {                    
    case 1:
        System.out.println("Seu atual é de: " + c1.getSaldo());
        System.out.print("Digite um valor para depósito: R$ ");  
        valorDeposito = scan.nextInt();
        c1.depositar(valorDeposito);
        System.out.println("Seu saque de (" + valorSaque + " R$) foi realizado com sucesso!" );
        System.out.print("Valor saldo atual " + c1.getSaldo() );
    break;
    case 2:                   
        System.out.println("Seu atual é de: " + c1.getSaldo());
        System.out.print("Digite o valor para o saque: R$ "); 
        valorSaque = scan.nextInt();
        c1.sacar(valorSaque);
        System.out.println("Seu saque de (" + valorSaque + " R$) foi realizado com sucesso!" );
        System.out.println("Valor do seu saldo atual é: " + c1.getSaldo() );
    break;
    case 3:
        System.out.println("Seu atual é de: " + c1.getSaldo());
        System.out.print("Digite o valor da transferencia para conta 2: R$");
        valorTrasferencia = scan.nextInt();
        c1.transferir(c2, valorTrasferencia);
        System.out.println("Sua transferencia de (" + valorTrasferencia + " R$) foi realizada com sucesso!" );
        System.out.println("O valor do saldo atual da conta 2 é: R$ " + c2.getSaldo());
    break;
    case 4:
        System.out.println("Seu saldo atual: " + c1.getSaldo());
    default:
        System.out.println("Operação inválida");
    }
    } 

}
