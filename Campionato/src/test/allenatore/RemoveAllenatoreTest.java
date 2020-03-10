package test.allenatore;


import com.campionato.allenatore.a_database.RemoveAllenatore;
import com.campionato.giocatore.g_database.RemoveGiocatore;

import java.sql.SQLException;
import java.util.Scanner;

class RemoveAllenatoreTest {

    public static void main (String [] args) throws SQLException {

        Scanner input =new Scanner(System.in);
        System.out.println("Inserisci squadra dell'allenatore da rimuovere");
        String squadra= input.nextLine();
        RemoveAllenatore.remCognome(squadra);

        System.out.println("Inserisci cognome da rimuovere");
        String cognome= input.nextLine();
        RemoveAllenatore.remCognome(cognome);

    }
}