package com.campionato.giocatore.g_database;

import com.campionato.DBConnection;

import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RemoveGiocatore {

    public RemoveGiocatore() {
    }

    public static void remNumMaglia(String squadra,int nm) throws SQLException {
        String SQL = "DELETE FROM `"+squadra+"` WHERE `Numero maglia`=?";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)

        ) {

            stmt.setInt(1, nm);

            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void remCognome(String squadra,String cgm){
        String SQL = "DELETE FROM `"+squadra+"` WHERE `Cognome`=?";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)

        ) {

            stmt.setString(1, cgm);

            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
