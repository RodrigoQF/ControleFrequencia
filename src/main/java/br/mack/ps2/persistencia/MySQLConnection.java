package br.mack.ps2.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    String url="jdbc:mysql://localhost:3306/controle_frequencia?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String usuario = "root";
    String senha = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, usuario, senha);
        } catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
