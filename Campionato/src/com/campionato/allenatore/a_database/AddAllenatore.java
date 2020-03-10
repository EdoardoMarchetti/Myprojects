package com.campionato.allenatore.a_database;

import com.campionato.DBConnection;
import com.campionato.allenatore.Allenatore;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import java.sql.*;

public class AddAllenatore {

    public AddAllenatore() {
    }

    public void addDaKeyboard(String n, String cgm,String squadra ) throws SQLException {

        String SQL="INSERT INTO `allenatori` (`Nome`, `Cognome`, `Squadra`) VALUES (?, ?, ?)";

        try(
                Connection conn= DBConnection.getConnection();
                PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)

        ){


            stmt.setString(1, n);
            stmt.setString(2,cgm);
            stmt.setString(3,squadra);


            stmt.execute();
        }catch (Exception e){
            System.out.println("Errore");
        }

    }

    public void addObjAllenatore(Allenatore a) throws SQLException {

        String SQL="INSERT INTO `allenatori` (`Nome`, `Cognome`, `Squadra`) VALUES (?, ?, ?)";

        try(
                Connection conn= DBConnection.getConnection();
                PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)

        ){

            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getCognome());
            stmt.setString(3, a.getSquadra());

            stmt.execute();
        }catch (MySQLIntegrityConstraintViolationException n ){
            System.out.println("Numero di maglia già occupato");
        }
    }
}
