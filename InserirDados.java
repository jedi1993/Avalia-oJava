package br.com.abc.Projeto;

import curiosidades3.Comprador2;
import curiosidades3.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InserirDados {

        public static void save(SigaBemSaida sigaBemSaida,SigaBemEntrada sigaBemEntrada) {
            String sql = "INSERT INTO `agencia`.`empresa` (`valor total frete`, `peso`, `nome destinatario`, `CEP Origem`, `CEP Destino`)" +
                    " VALUES ('"+sigaBemSaida.getVlrTotalFrete()+"', '"+sigaBemEntrada.getPeso()+"', " +
                    "'"+sigaBemEntrada.getNomeDestinatario()+"', '"+sigaBemEntrada.getDDD()+"', " +
                    "'"+sigaBemSaida.getDDD()+"')";
           // String sql2 = "INSERT INTO `agencia`.`total` (`Total`) VALUES ('"+sigaBemSaida.calculoFrete()+"')";

            Connection conn = Conexão.getConexao();
            try {
                Statement stmt = conn.createStatement();
                System.out.println(stmt.execute(sql));
                Conexão.close(conn,stmt);
            } catch (SQLException e) {
                e.printStackTrace();
            }

                System.out.println("Registro inserido com sucesso");

        }

}
