package com.campionato.squadra;

import com.campionato.DBConnection;
import com.campionato.allenatore.Allenatore;
import com.campionato.allenatore.a_database.TrovaAllenatore;
import com.campionato.giocatore.Giocatore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Squadra {

    private String nome;
    private Allenatore allenatore;
    private ArrayList<Giocatore> rosa;
    private ArrayList<Giocatore> marcatori;
    private ArrayList<Giocatore> assistman;
    private int numGiocatori;

    public Squadra() {
    }

    public Squadra(String nome, Allenatore allenatore, ArrayList<Giocatore> rosa) throws SQLException {
        this.nome = nome;
        this.allenatore = allenatore;
        this.rosa = rosa;
        this.setMarcatoriDB();
        this.setAssistmanDB();
        this.numGiocatori = this.rosa.size();
    }

    public Squadra(String nome) throws SQLException {      //Funziona
        this.nome = nome;
        this.allenatore=TrovaAllenatore.trovaSquadra(this.nome);
        this.setRosa();
        this.setMarcatori();
        this.setAssistman();
        this.numGiocatori=this.rosa.size();
    }

    public String getNome() {                                     //FUNZIONA
        return nome;
    }

    public void setNome(String nome) {                             //FUNZIONA
        this.nome = nome;
    }

    public Allenatore getAllenatore() {                             //FUNZIONA
        return allenatore;
    }

    public void setAllenatore(Allenatore allenatore) {             //Imposto l'allenatore passando un OGGETTO allenatore                //FUNZIONA
        this.allenatore = allenatore;
    }

    public void setAllenatore() throws SQLException {              //Imposto l'allenatore della squadra dal Nome della squadra stessa   //FUNZIONA
        this.allenatore= TrovaAllenatore.trovaSquadra(this.nome);
    }

    public ArrayList<Giocatore> getRosa() {                        //FUNZIONA
        return rosa;
    }

    public void getElencoGiocatori() throws SQLException {         //FUNZIONA
        String SQL="SELECT * FROM `"+this.nome+"`";
        ResultSet rs=null;

        try{
            Connection conn=DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs=stmt.executeQuery();
            Giocatore.getGiocatori(rs);
        }catch (Exception e){
            System.out.println(e);
        }finally {

        }
    }

    public void setRosa(ArrayList<Giocatore> rosa) {              //Imposto la rosa passando un OGGETTO arraylist    //FUNZIONA
        this.rosa = rosa;
    }

    public void setRosa() throws SQLException {              //Imposto la rosa passando il NOME della squadra  //FUNZIONA
        String SQL="SELECT * FROM `"+this.nome+"`";
        ArrayList<Giocatore> rosa= new ArrayList<Giocatore>();
        ResultSet rs=null;
        try{
            Connection conn= DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs= stmt.executeQuery();

            while (rs.next()){
                Giocatore g= new Giocatore();
                g.setNum_maglia(rs.getInt(1));
                g.setNome(rs.getString(2));
                g.setCognome(rs.getString(3));
                g.setRuolo(rs.getString(4));
                g.setDdn(rs.getDate(5));
                g.setPg(rs.getInt(6));
                g.setGol(rs.getInt(7));
                g.setAssist(rs.getInt(8));
                g.setC_gialli(rs.getInt(9));
                g.setC_rossi(rs.getInt(10));
                g.setCl_sheet(rs.getInt(11));
                rosa.add(g);
            }
        }catch (Exception e){
            System.out.println(e);;
        }finally {
            if (rs!=null){
                rs.close();
            }
        }

        this.rosa=rosa;
    }

    public ArrayList<Giocatore> getMarcatori() {                     //FUNZIONA
        return marcatori;
    }

    public void getElencoMarcatori(){                               //FUNZIONA
        String SQL="SELECT * FROM `"+this.nome+"` WHERE `Gol` !=0";
        ResultSet rs=null;

        try{
            Connection conn=DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs=stmt.executeQuery();
            Giocatore.getGiocatori(rs);
        }catch (Exception e){
            System.out.println(e);
        }finally {

        }
    }

    public void setMarcatori() {                                     //FUNZIONA
        ArrayList <Giocatore> marcatori= new ArrayList<Giocatore>();
        for(Giocatore g: this.rosa){
            if (g.getGol()!=0){
                marcatori.add(g);
            }
        }
        this.marcatori = marcatori;
    }

    public void setMarcatoriDB() throws SQLException {              //Imposto la rosa passando il NOME della squadra  //FUNZIONA
        String SQL="SELECT * FROM `"+this.nome+"` WHERE `Gol` != 0";
        ArrayList<Giocatore> marcatori= new ArrayList<Giocatore>();
        ResultSet rs=null;
        try{
            Connection conn= DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs= stmt.executeQuery();

            while (rs.next()){
                Giocatore g= new Giocatore();
                g.setNum_maglia(rs.getInt(1));
                g.setNome(rs.getString(2));
                g.setCognome(rs.getString(3));
                g.setRuolo(rs.getString(4));
                g.setDdn(rs.getDate(5));
                g.setPg(rs.getInt(6));
                g.setGol(rs.getInt(7));
                g.setAssist(rs.getInt(8));
                g.setC_gialli(rs.getInt(9));
                g.setC_rossi(rs.getInt(10));
                g.setCl_sheet(rs.getInt(11));
                marcatori.add(g);
            }
        }catch (Exception e){
            System.out.println(e);;
        }finally {
            if (rs!=null){
                rs.close();
            }
        }

        this.marcatori=marcatori;
    }




    public ArrayList<Giocatore> getAssistman() {                         //FUNZIONA
        return assistman;
    }

    public void getElencoAssistman(){                                   //FUNZIONA
        String SQL="SELECT * FROM `"+this.nome+"` WHERE `Assist` !=0";
        ResultSet rs=null;

        try{
            Connection conn=DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs=stmt.executeQuery();
            Giocatore.getGiocatori(rs);
        }catch (Exception e){
            System.out.println(e);
        }finally {

        }
    }

    public void setAssistman() {                                         //FUNZIONA
        ArrayList <Giocatore> assistman= new ArrayList<Giocatore>();
        for(Giocatore g: this.rosa){
            if (g.getAssist()!=0){
                assistman.add(g);
            }
        }
        this.assistman = assistman;
    }

    public void setAssistmanDB() throws SQLException {              //Imposto la rosa passando il NOME della squadra      //FUNZIONA
        String SQL="SELECT * FROM `"+this.nome+"` WHERE `Assist` != 0";
        ArrayList<Giocatore> assistman= new ArrayList<Giocatore>();
        ResultSet rs=null;
        try{
            Connection conn= DBConnection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs= stmt.executeQuery();

            while (rs.next()){
                Giocatore g= new Giocatore();
                g.setNum_maglia(rs.getInt(1));
                g.setNome(rs.getString(2));
                g.setCognome(rs.getString(3));
                g.setRuolo(rs.getString(4));
                g.setDdn(rs.getDate(5));
                g.setPg(rs.getInt(6));
                g.setGol(rs.getInt(7));
                g.setAssist(rs.getInt(8));
                g.setC_gialli(rs.getInt(9));
                g.setC_rossi(rs.getInt(10));
                g.setCl_sheet(rs.getInt(11));
                assistman.add(g);
            }
        }catch (Exception e){
            System.out.println(e);;
        }finally {
            if (rs!=null){
                rs.close();
            }
        }

        this.assistman=assistman;
    }

    public int getNumGiocatori() {              //FUNZIONA
        return numGiocatori;
    }

    @Override
    public String toString() {                  //FUNZIONA
        return "Squadra{" +
                "nome='" + nome + '\'' +
                ", allenatore=" + allenatore +
                ", rosa=" + rosa +
                ", marcatori=" + marcatori +
                ", assistman=" + assistman +
                ", numGiocatori=" + numGiocatori +
                '}';
    }
}
