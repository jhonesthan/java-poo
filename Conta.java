
public class Conta {
    private String nome;
    private String cpf;
    private double saldo;
    private double limiteCartao;
    public static final double MAX_SAQUE=1000;

   
        public Conta(String nome, String cpf, double saldo, double limiteCartao) {
            this.nome = nome;
            this.cpf = cpf;
            this.saldo = saldo;
            this.limiteCartao = limiteCartao;
        }
       
        public boolean sacar(int valor) {                    //saque
            if (valor > Conta.MAX_SAQUE){
                System.out.print("O valor máximo para saque é: " + Conta.MAX_SAQUE);
                return false;
            }
            if(valor > this.saldo) {
                System.out.print("voce não tem saldo suficiente para este valor.");
                return false;
            }
                this.saldo -= valor;
                return true;
            }
           
            public void depositar(int valor) {               //depósito
                this.saldo += valor;
            }
           
            public void transferir( Conta destino, int valor) {   // transfência
                if(this.sacar(valor)) {
                    destino.depositar(valor);
                }
            }
   
            public double getSaldo(){                           // saldo
            return this.saldo;
            }
        }
