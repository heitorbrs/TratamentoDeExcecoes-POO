import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) throws Exception {

    ContaBancaria minhaConta = new ContaBancaria();
    Scanner teclado = new Scanner(System.in);

    String nome;
    int num, op;
    float saldo=0, valor, limite;

        do{
            System.out.println("+--------------------+");
            System.out.println("|   Conta Bancaria   |");
            System.out.println("+--------------------+");
            System.out.println("1- Inserir dados:");
            System.out.println("2- Mostrar dados");
            System.out.println("3- Depositar valor");
            System.out.println("4- Sacar valor");
            System.out.println("5- Mostrar saldo");
            System.out.println("0 - Sair");
            System.out.print(">>> ");
            op = teclado.nextInt();

            if(op==1){
                System.out.println("Nome do cliente: "); 
                nome = teclado.next();
                
                System.out.println("Número da conta: "); 
                num = teclado.nextInt();
                
                System.out.println("Limite: ");
                limite = teclado.nextFloat();
                
                minhaConta.inserirDados(nome, num, saldo, limite);
            }
            else if(op==2) {
                minhaConta.mostrarDados();
            }
            else if(op==3) {
                try {
                    System.out.println("Valor a ser depositado: ");
                    valor = teclado.nextFloat();
                    minhaConta.depositar(valor);
                }
                catch(IllegalArgumentException e){
                    System.out.println("Deposito nao realizado! " + e.getMessage());
                }
            }
            else if(op==4) {
                try {
                    minhaConta.mostrarSaldo();
                    System.out.println("Valor a ser sacado: ");
                    valor = teclado.nextFloat();
                    minhaConta.sacar(valor);
                } 
                catch(IllegalArgumentException e) {
                    System.out.println("Saque nao realizado! " + e.getMessage());
                }
            }
            else if(op==5) {
                minhaConta.mostrarSaldo();
            }
            else if(op==0) {
                break;
            }
            else {
                System.out.println("Digite um valor válido!");
            }      
        } while(op != 0);
     teclado.close();
    }
}
