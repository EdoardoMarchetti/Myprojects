package com.campionato.giocatore;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Giocatore {

    private int num_maglia;
    private String nome;
    private String cognome;
    private String ruolo;
    private Date ddn;
    private int pg;
    private int gol;
    private int assist;
    private int c_gialli;
    private int c_rossi;
    private int cl_sheet;


    public Giocatore() {
    }

    public Giocatore(int num_maglia, String nome, String cognome, String ruolo, Date ddn, int pg, int gol, int assist, int c_gialli, int c_rossi, int cl_sheet) {
        this.num_maglia = num_maglia;
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
        this.ddn = ddn;
        this.pg = pg;
        this.gol = gol;
        this.assist = assist;
        this.c_gialli = c_gialli;
        this.c_rossi = c_rossi;
        this.cl_sheet = cl_sheet;
    }

    public Giocatore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public static void getGiocatori(ResultSet rs) throws SQLException {
        while(rs.next()){
            StringBuffer buffer=new StringBuffer();

            buffer.append(rs.getInt("Numero maglia")+" ");
            buffer.append(rs.getString("Nome")+" ");
            buffer.append((rs.getString("Cognome").toUpperCase())+" ");
            buffer.append("RUOLO: "+rs.getString("Ruolo")+" ");
            buffer.append(rs.getDate("Data di nascita")+" ");
            buffer.append("PG: "+rs.getInt("Partite giocate")+" ");
            buffer.append("GOL: "+rs.getInt("Gol")+" ");
            buffer.append("ASSIST: "+rs.getInt("Assist")+" ");
            buffer.append("CG: "+rs.getInt("Cartellini G")+" ");
            buffer.append("CR: "+rs.getInt("Cartellini R")+" ");
            buffer.append("CLS: "+rs.getInt("Clean Sheet")+" ");

            System.out.println(buffer.toString());
        }

    }

    public int getNum_maglia() {
        return num_maglia;
    }

    public void setNum_maglia(int num_maglia) {
        this.num_maglia = num_maglia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public Date getDdn() {
        return ddn;
    }

    public void setDdn(Date ddn) {
        this.ddn = ddn;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getC_gialli() {
        return c_gialli;
    }

    public void setC_gialli(int c_gialli) {
        this.c_gialli = c_gialli;
    }

    public int getC_rossi() {
        return c_rossi;
    }

    public void setC_rossi(int c_rossi) {
        this.c_rossi = c_rossi;
    }

    public int getCl_sheet() {
        return cl_sheet;
    }

    public void setCl_sheet(int cl_sheet) {
        this.cl_sheet = cl_sheet;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "num_maglia=" + num_maglia +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", ruolo='" + ruolo + '\'' +
                ", ddn=" + ddn +
                ", pg=" + pg +
                ", gol=" + gol +
                ", assist=" + assist +
                ", c_gialli=" + c_gialli +
                ", c_rossi=" + c_rossi +
                ", cl_sheet=" + cl_sheet +
                '}';
    }
}
