package test.squadra;


import com.campionato.allenatore.Allenatore;
import com.campionato.giocatore.Giocatore;
import com.campionato.squadra.Squadra;

import java.sql.SQLException;
import java.util.ArrayList;

class SquadraTest {


    public static void main(String [] args) throws SQLException {

        Squadra inter= new Squadra("Inter");
        System.out.println("creato");
        System.out.println(inter.getAllenatore().toString());
        System.out.println(inter.getNome());
        inter.getElencoGiocatori();
        System.out.println("\n\n\n\n Marcatori");
        inter.getElencoMarcatori();
        System.out.println("\n\n\n\n Assistman");
        inter.getElencoAssistman();
        System.out.println("\n\n\n\n toString\n");
        System.out.println(inter.toString());
        System.out.println(inter.getNumGiocatori());
        /*inter.setNome("prova");
        System.out.println(inter.getNome());
        Allenatore a=new Allenatore("Edoardo","Marchetti", "Inter");
        inter.setAllenatore(a);
        System.out.println(inter.getAllenatore().toString());*/
        //System.out.println(inter.getRosa());
        /*Giocatore edo= new Giocatore("Edo", "Mar");
        Giocatore gio= new Giocatore("Gio", "Mar");
        ArrayList<Giocatore> nuova_r= new ArrayList<Giocatore>();
        nuova_r.add(edo);
        nuova_r.add(gio);
        inter.setRosa(nuova_r);
        System.out.println(inter.getRosa());*/
        System.out.println(inter.getAssistman());
        System.out.println(inter.getMarcatori());
    }
}