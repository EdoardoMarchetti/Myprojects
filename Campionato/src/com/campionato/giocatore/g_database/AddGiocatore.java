package com.campionato.giocatore.g_database;

import com.campionato.DBConnection;
import com.campionato.giocatore.Giocatore;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class AddGiocatore {

    public AddGiocatore() {
    }

    public void addDaKeyboard(String squadra,String nm, String n, String cgm,String ruolo, String ddn, String pg, String g, String a , String cg, String cr, String cls ) throws SQLException {

        String SQL="INSERT INTO `"+squadra+"` (`Numero maglia`, `Nome`, `Cognome`, `Ruolo`, `Data di nascita`, `Partite giocate`, `Gol`, `Assist`, `Cartellini G`, `Cartellini R`, `Clean Sheet`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(
                Connection conn= DBConnection.getConnection();
                PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)

                ){

            stmt.setString(1, nm);
            stmt.setString(2, n);
            stmt.setString(3,cgm);
            stmt.setString(4,ruolo);
            stmt.setString(5,ddn);
            stmt.setString(6,pg);
            stmt.setString(7,g);
            stmt.setString(8,a);
            stmt.setString(9,cg);
            stmt.setString(10,cr);
            stmt.setString(11,cls);

            stmt.execute();
        }catch (Exception e){
            System.out.println("Errore");
        }

    }


    public void addObjGiocatore(String squadra,Giocatore g) throws SQLException {

        String SQL="INSERT INTO `"+squadra+"` (`Numero maglia`, `Nome`, `Cognome`, `Ruolo`, `Data di nascita`, `Partite giocate`, `Gol`, `Assist`, `Cartellini G`, `Cartellini R`, `Clean Sheet`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(
                Connection conn= DBConnection.getConnection();
                PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)

        ){
            Date sqldate=new Date(g.getDdn().getTime());
            stmt.setInt(1, g.getNum_maglia());
            stmt.setString(2, g.getNome());
            stmt.setString(3, g.getCognome());
            stmt.setString(4, g.getRuolo());
            stmt.setDate(5, sqldate);
            stmt.setInt(6, g.getPg());
            stmt.setInt(7, g.getGol());
            stmt.setInt(8, g.getAssist());
            stmt.setInt(9,g.getC_gialli());
            stmt.setInt(10,g.getC_rossi());
            stmt.setInt(11,g.getCl_sheet());

            stmt.execute();
        }catch (MySQLIntegrityConstraintViolationException n ){
            System.out.println("Numero di maglia già occupato");
        }

    }
}
