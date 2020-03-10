package test.giocatore;


import com.campionato.giocatore.g_database.TrovaGiocatore;

import java.sql.SQLException;
import java.util.Scanner;

class TrovaGiocatoreTest {

    public static void main (String [] args) throws SQLException {

        System.out.println("Prova numero");
        Scanner numero =new Scanner(System.in);
        System.out.println("Inserisci la squadra a cui appartiene: ");
        String squadra=numero.nextLine();
        System.out.println("Inserisci il numero di maglia da trovare: ");
        String ans= numero.nextLine();

        TrovaGiocatore.trovaNumMaglia(squadra.toLowerCase(),Integer.parseInt(ans));

        Scanner cognome =new Scanner(System.in);
        System.out.println("Inserisci il cognome: ");
        String b= cognome.nextLine();

        TrovaGiocatore.trovaCognome(squadra,b);


    }

}