package com.example.termin17nacasu;

import java.util.ArrayList;
import java.util.List;

public class NamesProvider {

    private static List<String> names;

    private static void init(){
        if(names == null){
            names = new ArrayList<>();
            names.add("Pera");
            names.add("Mika");
            names.add("Djoka");
            names.add("Zika");
        }
    }
    public static List<String> getAllNames(){
        init();
        return names;
    }
    public static String getNameById(int id){
        init();
        if((id >= 0) && (id < names.size())){
            return names.get(id);
        }
        return null;
    }
}
