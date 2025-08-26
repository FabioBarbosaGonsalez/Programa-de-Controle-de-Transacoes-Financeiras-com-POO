import java.util.ArrayList;
import java.util.List;

class Conta {
    private String numero;
    private String titular; 
    protected double saldo;
    private List<String> historico;

    public Conta(String titular, String numero) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.00;
        this.historico = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add("Depósito de R$" + valor);
            System.out.println("Depósito realizado na conta " + numero);
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double valor) {
        if (valor > saldo || valor < 0) {
            System.out.println("Valor indisponível para saque");
        } else {
            saldo -= valor;
            historico.add("Saque de R$" + valor);
            System.out.println("Saque realizado da conta " + numero);
        }
    }

    public void transferencia(Conta destino, double valor) {
        if (valor > saldo || valor < 0) {
            System.out.println("Valor indisponível para transferência");
        } else {
            saldo -= valor;
            destino.depositar(valor);
            historico.add("PIX de R$" + valor + " feito para " + destino.getTitular());
        }
    }

    public void verSaldo() {
        System.out.println("Saldo da conta " + numero + ": R$" + saldo);
    }

    public void verHistorico() {
        System.out.println("Histórico:");
        for (String i: historico) {
            System.out.println(i);
        }
    }
     public void aplicarInvestimento() {
        System.out.println("Esse tipo de conta não pode fazer investimentos");
    }
}
 class ContaCorrente extends Conta {
    public ContaCorrente(String titular, String numero) {
        super(titular, numero);
    }

    @Override
    public void transferencia(Conta destino, double valor) {
        if (valor > saldo) {
            System.out.println("Valor indisponível para transferência");
        } else {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("PIX realizado para " + destino.getTitular());
        }
    }
    @Override
    public void aplicarInvestimento() {
        double rendimento = getSaldo() * 0.01;
        saldo += rendimento;
        System.out.println("Investimento feito (Conta Corrente)");
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, String numero) {
        super(titular, numero);
    }

    @Override
    public void aplicarInvestimento() {
        double rendimento = getSaldo() * 0.02; 
        saldo += rendimento;
        System.out.println("Investimento feito (Conta Poupança)");
    }
}

public class ContaBanco {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente("Fabio", "001");
        ContaPoupanca cp = new ContaPoupanca("Gabriel", "002");

        //testes
        //cc.depositar(1000);
        //cc.verSaldo();
        //cp.depositar(500);
        //cp.verSaldo();
        //cc.sacar(200);
        //cc.verSaldo();
        //cc.transferencia(cp, 300);
        //cc.verSaldo();
        //cp.verSaldo();
        //cc.aplicarInvestimento();
        //cc.verSaldo();
        //cp.aplicarInvestimento();
        //cp.verSaldo();
        //cc.verHistorico();
        //cp.verHistorico();
    }
}