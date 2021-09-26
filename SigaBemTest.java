package br.com.abc.Projeto;

import ZZC.jdbc.com.classes.Comprador;
import ZZC.jdbc.com.db.Compradordb;
import curiosidades3.Comprador2;

import java.sql.Connection;

public class SigaBemTest {
    public static void main(String[] args) {
       // inserçao();
        SigaBemEntrada sigaBemEntrada = new SigaBemEntrada(20.5, "333.232.444.55", "SP", "Fernando","34");
        SigaBemSaida sigaBemSaida = new SigaBemSaida(200.0, "333.132.444.55", "MG","34");

        sigaBemSaida.calculoFrete(sigaBemEntrada,sigaBemSaida);

    }
    public static void inserçao(){
        SigaBemEntrada sigaBemEntrada = new SigaBemEntrada(20.5, "333.2321.33", "MG", "Fernando","34");
        SigaBemSaida sigaBemSaida = new SigaBemSaida(200.0, "333.2321.33", "MG","34");
        InserirDados.save( sigaBemSaida,sigaBemEntrada);
    }


}
