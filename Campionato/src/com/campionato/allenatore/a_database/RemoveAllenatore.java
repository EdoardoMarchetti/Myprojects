package com.campionato.allenatore.a_database;

import com.campionato.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RemoveAllenatore {

    public RemoveAllenatore() {
    }

    public static void remSquadra(String squadra) throws SQLException {
        String SQL = "DELETE FROM `allenatori` WHERE `Squadra`=?";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)

        ) {

            stmt.setString(1, squadra);
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void remCognome(String cgm){
        String SQL = "DELETE FROM `allenatori` WHERE `Cognome`=?";

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
