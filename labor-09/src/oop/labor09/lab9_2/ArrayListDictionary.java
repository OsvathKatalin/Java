package oop.labor09.lab9_2;

import java.util.ArrayList;

public class ArrayListDictionary implements IDictionary{
    private static ArrayListDictionary instance=null;
    private ArrayList<String> words=new ArrayList<>();


    public static IDictionary newInstance(){
        if(instance!=null)
        {
            return instance;
        }
        instance = new ArrayListDictionary();
        return instance;
    }
}
