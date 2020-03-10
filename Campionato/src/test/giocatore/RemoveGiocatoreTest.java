package test.giocatore;


import com.campionato.giocatore.g_database.RemoveGiocatore;

import java.sql.SQLException;
import java.util.Scanner;

class RemoveGiocatoreTest {

    public static void main (String [] args) throws SQLException {


        Scanner input =new Scanner(System.in);
        System.out.println("Inserisci squadra: ");
        String squadra=input.nextLine();
        System.out.println("Inserisci cognome da rimuovere");
        String ans= input.nextLine();
        RemoveGiocatore.remCognome(squadra,ans);


        RemoveGiocatore.remNumMaglia(squadra,81);

    }

}