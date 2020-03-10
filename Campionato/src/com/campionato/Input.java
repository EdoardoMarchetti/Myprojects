package com.campionato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public static  String getInput(String value){
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println(value);
        //System.out.flash();

        try{
            return reader.readLine();
        } catch (IOException e) {
            return "Error: "+e;
        }

    }

    public static int getInt(String value){
        return Integer.parseInt(getInput(value));
    }
}
