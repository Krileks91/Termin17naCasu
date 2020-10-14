package com.example.termin17nacasu;

import java.util.ArrayList;
import java.util.List;

public class JeloProvider {
    private static List<Jelo> jela;
    private static void init(){
        if(jela == null){
            jela = new ArrayList<Jelo>();
            List<String> sastojci = new ArrayList<>();
            sastojci.add("Sastojak1");
            sastojci.add("Sastojak1");
            sastojci.add("Sastojak1");
            Jelo jelo = new Jelo("Gulas", 3.7f, 123,
                    "Madjarsko pikantno jelo",sastojci, 854, 599.90);
            jela.add(jelo);
            new Jelo("Pasta", 4.8f, 456,
                    "Pasta karabonara",sastojci, 787, 999.90);
            jela.add(jelo);
        }
    }
    public static List<Jelo> getAllJela(){
        init();
        return jela;
    }
    public static Jelo getJeloById(int id){
        Jelo jelo = null;
        for(Jelo j : jela){
            if(j.getId() == id){
                jelo = j;
                break;
            }
        }
        return jelo;
    }
}
