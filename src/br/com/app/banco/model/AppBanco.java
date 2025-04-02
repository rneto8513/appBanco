package br.com.app.banco.model;

public class AppBanco {
    public Conta conta;

    public AppBanco(Conta conta) {
        this.conta = conta;
    }

    public void entrar(String cpf, String senha) {
        if (conta.entrar(cpf, senha)) {
            System.out.println("login realizado com sucesso!!!");
        } else {
            System.out.println("Credenciais Inválidas!");
        }
    }

    public void sair(){
        if (conta.sair()) {
            System.out.println("Saiu da conta!");
        } else {
            System.out.println("Erro ao sair!");
        }
    }

    public void depositar(double valor){
        conta.depositar(valor);
        System.out.println("Depósito realizado");
    }

    public void sacar(double valor){
        if (conta.sacar(valor)) {
            System.out.println("O valor foi sacado!");
        } else {
            System.out.println("Sem permissão para sacar!");
        }
    }

    public void consultarSaldo() {
        double valor = conta.consultarSaldo();
        if (valor > -1){
            System.out.println("Saldo atual: " + valor);
        } else {
            System.out.println("Sem permissão para visualizar!");
        }
    }

    @Override
    public String toString() {
        return conta.toString();
    }
}

