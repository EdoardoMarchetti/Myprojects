package test.allenatore;


import com.campionato.allenatore.Allenatore;
import com.campionato.allenatore.a_database.TrovaAllenatore;
import com.campionato.giocatore.g_database.TrovaGiocatore;

import java.sql.SQLException;
import java.util.Scanner;

class TrovaAllenatoreTest {

    public static void main (String [] args) throws SQLException {


        Scanner numero =new Scanner(System.in);
        System.out.println("Inserisci la squadra dell'allenatore da trovare: ");
        String ans= numero.nextLine();

        Allenatore a= TrovaAllenatore.trovaSquadra(ans);
        System.out.println(a.toString());

        Scanner cognome =new Scanner(System.in);
        System.out.println("Inserisci il cognome dell'allenatore da trovare: ");
        String b= cognome.nextLine();

        TrovaAllenatore.trovaCognome(b);

    }

}