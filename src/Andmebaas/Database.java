package Andmebaas;

import java.sql.*;

/**
 * Created by skallari on 22.11.15.
 */
public class Database {

    Connection conn;

    public Database() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("JDBC:sqlite:login.db");
            System.out.println("Andmebaas on ühendatud");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sulgeYhendus() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean kasKasutajaOlemas(String kasutajaNimi) {

        String sql = String.format("SELECT username FROM kasutajad WHERE username = '%s' ", kasutajaNimi);
        boolean olemas = kaivitaKasutajaOlemasToiming(sql);
        return olemas;
    }

    private boolean kaivitaKasutajaOlemasToiming(String sql) {
        try {
            Statement stat = conn.createStatement();
            ResultSet tulemus = stat.executeQuery(sql);

            String username = tulemus.getString("username");

            tulemus.close();
            stat.close();

            System.out.println("Kasutajanimi: " + username);

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;

    }

    public void looTabel() {
        try {
            Statement stat = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS kasutajad (ID INT AUTO_INCREMENT, username TEXT, password TEXT, fullname TEXT)";
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registreeri(String kasutajanimi, String parool) {
        try {
            Statement stat = conn.createStatement();
            String sql = String.format("INSERT INTO kasutajad (username, password) VALUES ('%s', '%s')", kasutajanimi, parool);
            stat.execute(sql);
            stat.close();
            System.out.println("Kasutaja registreeritud");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
