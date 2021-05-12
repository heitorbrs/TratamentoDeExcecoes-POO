public class ContaBancaria {
    private int Conta;
    public int op;
    private String Dono; 
    private double Saldo;
    private double Limite;
    
    public ContaBancaria() {
        this.Conta=0;
        this.Dono=" ";
        this.Saldo=0;
        this.Limite=0; 
    }

    public int getNumero() {
        return Conta; 
    }
    public void setNumero(int Numero) {
        this.Conta = Numero; 
    }
    public String getDono() {
        return Dono; 
    }
    public void setDono(String Dono) {
        this.Dono = Dono; 
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    public double getLimite() {
        return Limite;
    }
    public void setLimite(double Limite) {
        this.Limite = Limite;
    }
    void sacar(double quantidade) {
        if (this.Saldo<quantidade) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        if (quantidade<0) {
            throw new IllegalArgumentException("Não é permitido saque negativo!");
        }
        if(quantidade==0) {
            throw new IllegalArgumentException("Valor insuficiente!");
        }
        else {
            this.Saldo = this.Saldo - quantidade;
        }
    }

    void depositar(double quantidade) {
        if(quantidade<0) {
            throw new IllegalArgumentException("Não é permitido depósito negativo!");
        }
        if(quantidade==0) {
            throw new IllegalArgumentException("Valor insuficiente!");
        }
        if((getSaldo()+quantidade)>getLimite()) {
            throw new IllegalArgumentException("Limite ultrapassado!");
        }
        else {
            this.Saldo = this.Saldo + quantidade;
        }
    }

    void inserirDados(String a, int b, float c, float l) {
        this.Dono = a;
        this.Conta = b;
        this.Saldo = c;
        this.Limite = l;
    }

    void mostrarDados() {
        System.out.println("Dono da Conta: " + this.getDono());
        System.out.println("Numero da Conta: " + this.getNumero());
        System.out.println("Saldo atual: " + this.getSaldo());
    }

    void mostrarSaldo() {
        System.out.println("Saldo Atual: " + this.getSaldo()); 
        
    }
}
