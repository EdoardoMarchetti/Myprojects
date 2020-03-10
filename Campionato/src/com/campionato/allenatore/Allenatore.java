package com.campionato.allenatore;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Allenatore {

    private String nome;
    private String cognome;
    private String squadra;

    public Allenatore() {
    }

    public Allenatore(String nome, String cognome, String squadra) {
        this.nome = nome;
        this.cognome = cognome;
        this.squadra = squadra;
    }

    public static void getAllenatori(ResultSet rs) throws SQLException {
        while(rs.next()){
            StringBuffer buffer=new StringBuffer();

            buffer.append(rs.getString("Nome")+" ");
            buffer.append((rs.getString("Cognome").toUpperCase())+" ");
            buffer.append(rs.getString("Squadra")+" ");

            System.out.println(buffer.toString());
        }

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

    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    @Override
    public String toString() {
        return "Allenatore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", squadra='" + squadra + '\'' +
                '}';
    }
}
