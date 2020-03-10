package test.giocatore;


import com.campionato.giocatore.Giocatore;

import java.util.Date;

class GiocatoreTest {




    public static void main (String []args){

        Date ddn= new Date(99,7,20);
        Date bdn= new Date(100,11,31);
        Giocatore edo=new Giocatore(13,"Edoardo","Marchetti","difensore", ddn,5,0,0,1,1,0);
        Giocatore test= new Giocatore();

        //Test get
        System.out.println(edo.getNum_maglia());
        System.out.println(edo.getNome());
        System.out.println(edo.getCognome());
        System.out.println(edo.getRuolo());
        System.out.println(edo.getDdn());
        System.out.println(edo.getPg());
        System.out.println(edo.getGol());
        System.out.println(edo.getAssist());
        System.out.println(edo.getC_gialli());
        System.out.println(edo.getC_rossi());
        System.out.println(edo.getCl_sheet());
        System.out.println(edo.toString());

        //Test set
        test.setNum_maglia(3);
        test.setNome("Benwski");
        test.setCognome("Puzzolona");
        test.setRuolo("centrocampista");
        test.setDdn(bdn);
        test.setPg(3);
        test.setGol(3);
        test.setAssist(3);
        test.setC_gialli(0);
        test.setC_rossi(0);
        test.setCl_sheet(0);
        System.out.println(test.toString());


    }
}