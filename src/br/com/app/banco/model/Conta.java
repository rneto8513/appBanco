package br.com.app.banco.model;

public class Conta {
    public String nome;
    public String cpf;
    public String senha;
    public double saldo;
    public boolean autentificado;
    public Data criadoEm;

    public Conta(String nome, String cpf, String senha, Data criadoEm) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.criadoEm = criadoEm;
    }

    public boolean entrar(String cpf, String senha){
        if (cpf == this.cpf && senha == this.senha) {
            autentificado = true;
            return true;
        } else {
            autentificado = false;
            return false;
        }
    }

    public boolean sair() {
        autentificado = false;
        return false;
    }

    public void depositar(double valor) {
        if (valor > 0 ) {
            this.saldo += valor;
        } else {
            System.out.println("não e possivel depositar valores negativos");
        }
    }

    public boolean sacar(double valor) {
        if (autentificado == true) {
            if (valor <= this.saldo) {
                System.out.println("saque realizado com sucesso!!!");
                this.saldo -= valor;
                return true;
            } else {
                System.out.println("você não tem saldo suficiente para realizar o saque!!!");
                return false;
            }
        } else {
            System.out.println("você precisa estar logado para realizar um saque");
            return false;
        }
    }

    public double consultarSaldo(){
        if (autentificado) {
            return this.saldo;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", criadoEm=" + criadoEm +
                '}';
    }
}
