package com.campionato.allenatore.a_database;

import com.campionato.DBConnection;
import com.campionato.allenatore.Allenatore;
import com.campionato.giocatore.Giocatore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TrovaAllenatore {

    public TrovaAllenatore() {
    }

    /*public static void trovaSquadra(String squadra) throws SQLException {
        String SQL="SELECT * From `allenatori` WHERE `Squadra`=?";

        ResultSet rs=null;

        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,squadra);

            rs=stmt.executeQuery();


            if (rs.next() && rs.getString("Squadra").equalsIgnoreCase(squadra)) {
                rs.beforeFirst();
                Allenatore.getAllenatori(rs);
            }else{
                System.out.println("Allenatore non trovato");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (rs != null) {
                rs.close();
            }
        }
    }*/

    public static Allenatore trovaSquadra(String squadra) throws SQLException {
        String SQL="SELECT * From `allenatori` WHERE `Squadra`=?";

        ResultSet rs=null;
        Allenatore all= new Allenatore();
        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,squadra);

            rs=stmt.executeQuery();


            if (rs.next() && rs.getString("Squadra").equalsIgnoreCase(squadra)) {
                all.setNome(rs.getString("Nome"));
                all.setCognome(rs.getString("Cognome"));
                all.setSquadra(rs.getString("Squadra"));
            }else{
                System.out.println("Allenatore non trovato");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (rs != null) {
                rs.close();
            }
        }

        return all;
    }

    public static void trovaCognome(String cgm) throws SQLException {
        String SQL = "SELECT * From `allenatori` WHERE `Cognome`=?";

        ResultSet rs = null;

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1, cgm);

            rs = stmt.executeQuery();

            if (rs.next() && rs.getString("Cognome").equalsIgnoreCase(cgm)) {
                rs.beforeFirst();
                Allenatore.getAllenatori(rs);
            }else{
                System.out.println("Allenatore non trovato");
            }

        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

}
