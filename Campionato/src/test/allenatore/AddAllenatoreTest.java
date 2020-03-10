package test.allenatore;


import com.campionato.allenatore.Allenatore;
import com.campionato.allenatore.a_database.AddAllenatore;
import com.campionato.giocatore.Giocatore;
import com.campionato.giocatore.g_database.AddGiocatore;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

class AddAllenatoreTest {

    public static void main (String [] args) throws SQLException {

        Scanner input = new Scanner(System.in);
        String ans = input.nextLine();

        if (ans.equalsIgnoreCase("yes")) {

            System.out.println("Inserisci nome: ");
            String n = input.nextLine();
            System.out.println("Inserisci cognome: ");
            String cgm = input.nextLine();
            System.out.println("Inserisci la squadra allenata: ");
            String squadra = input.nextLine();


            AddAllenatore create = new AddAllenatore();
            create.addDaKeyboard(n, cgm, squadra);
        } else {
            System.exit(1);
        }


        Allenatore edo = new Allenatore("Edoardo", "Marchetti", "Perugia");

        AddAllenatore prova = new AddAllenatore();
        prova.addObjAllenatore(edo);
    }

}