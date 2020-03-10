package com.campionato.giocatore.g_database;

import com.campionato.DBConnection;
import com.campionato.giocatore.Giocatore;

import java.sql.*;

import static com.campionato.giocatore.Giocatore.getGiocatori;

public class TrovaGiocatore {



    public TrovaGiocatore() {
    }

    public static void trovaNumMaglia(String squadra,int nm) throws SQLException {

        String SQL = "SELECT * FROM`"+squadra+"`WHERE `Numero maglia`=?";

        ResultSet rs=null;

        try {
            Connection conn= DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setInt(1,nm);

            rs=stmt.executeQuery();


            if (rs.next() && rs.getInt("Numero maglia")==nm) {
                rs.beforeFirst();
                Giocatore.getGiocatori(rs);
            }else{
                System.out.println("Giocatore non trovato");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    public static void trovaCognome(String squadra,String cgm) throws SQLException {
        String SQL = "SELECT * From `"+squadra+"` WHERE `Cognome`=?";

        ResultSet rs = null;

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1, cgm);

            rs = stmt.executeQuery();

            if (rs.next() && rs.getString("Cognome").equalsIgnoreCase(cgm)) {
                rs.beforeFirst();
                Giocatore.getGiocatori(rs);
            }else{
                System.out.println("Giocatore non trovato");
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
