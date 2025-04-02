package br.com.app.banco.main;

import br.com.app.banco.model.AppBanco;
import br.com.app.banco.model.Conta;
import br.com.app.banco.model.Data;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(02,04,2025);

        Conta conta = new Conta("Raimundo", "00000","323412", data);

        AppBanco banco = new AppBanco(conta);

        banco.depositar(150);
        banco.sacar(50);
        banco.entrar("3123123", "8513");
        banco.entrar("00000", "323412");
        banco.sacar(50);
    }
}
