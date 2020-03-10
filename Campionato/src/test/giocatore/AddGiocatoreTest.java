package test.giocatore;


import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import com.campionato.giocatore.Giocatore;
import com.campionato.giocatore.g_database.AddGiocatore;

class AddGiocatoreTest {

    public static void main (String [] args) throws SQLException {
        System.out.println("Vuoi aggiungere?");
        Scanner input = new Scanner(System.in);
        String ans= input.nextLine();

        if (ans.equalsIgnoreCase("yes")){
            System.out.println("Inserisci la squadra in cui vuoi aggiungere: ");
            String squadra=input.nextLine();
            System.out.println("Inserisci numero di maglia: ");
            String nm= input.nextLine();
            System.out.println("Inserisci nome: ");
            String n= input.nextLine();
            System.out.println("Inserisci cognome: ");
            String cgm= input.nextLine();
            System.out.println("Inserisci ruolo: ");
            String r= input.nextLine();
            System.out.println("Inserisci data di nascita: ");
            String ddn= input.nextLine();
            System.out.println("Inserisci numero partite giocate: ");
            String pg= input.nextLine();
            System.out.println("Inserisci gol: ");
            String g= input.nextLine();
            System.out.println("Inserisci assist: ");
            String a= input.nextLine();
            System.out.println("Inserisci cartellini gialli: ");
            String cg= input.nextLine();
            System.out.println("Inserisci caertellini rossi: ");
            String cr= input.nextLine();
            System.out.println("Inserisci clean sheet: ");
            String cl= input.nextLine();

            AddGiocatore create= new AddGiocatore();
            create.addDaKeyboard(squadra,nm,n,cgm,r,ddn,pg,g,a,cg,cr,cl);
        }else{
            System.exit(1);
        }

        Date ddn= new Date(99,7,20);
        Giocatore edo=new Giocatore(81,"Edoardo","Marchetti","difensore", ddn,5,0,0,1,1,0);

        AddGiocatore prova=new AddGiocatore();
        System.out.println("Squadra: ");
        String squadra= input.nextLine();
        prova.addObjGiocatore(squadra,edo);





    }




}