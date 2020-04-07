package br.mack.ps2.persistencia;

import br.mack.ps2.entidades.Controle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ControleDAOMySQL implements ControleDAO {
    private String createSQL = "INSERT INTO controle VALUES (?, ?, ?,?)";
    private String readSQL = "SELECT * FROM controle";

    final MySQLConnection mysql = new MySQLConnection();

    @Override
    public boolean create(Controle controle) {
        Connection conexao = mysql.getConnection();
        try {
            PreparedStatement pstm = conexao.prepareStatement(createSQL);

            //Inicializando os valores
            pstm.setInt(1, controle.getTia());
            pstm.setString(2, controle.getHorario_Entrada());
            pstm.setString(3, controle.getHorario_Saida());
            pstm.setString(4, controle.getNome());

            int registros = pstm.executeUpdate();
            return registros > 0 ? true : false;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Controle> read() {
        Connection conexao = mysql.getConnection();
        List<Controle> frequencia = new ArrayList();

        try {
            PreparedStatement pstm = conexao.prepareStatement(readSQL);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Controle controle = new Controle();
                controle.setTia(rs.getInt("tia"));
                controle.setNome(rs.getString("nome"));
                controle.setHorario_Entrada(rs.getString("Horario_Entrada"));
                controle.setHorario_Saida(rs.getString("Horario_Saida"));
                frequencia.add(controle);
            }

            return frequencia;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return frequencia;
    }
}


