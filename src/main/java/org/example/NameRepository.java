package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */

public class NameRepository
{
    private static   String  names[]= new String[4];
    public static void main( String[] args )
    {
        String  temp[]= new String[4];
        Arrays.fill(temp, "Darwen AlTaeshi");

        System.out.println(" Array size =  "+getSize());

        setNames(temp);

        String newName[]=findAll();

        clear();
    }

    public static int getSize(){
       int Size= names.length;
       return Size;
    }


    public static void setNames(String[] names){
        NameRepository.names=  Arrays.copyOf(names,names.length);

    }

    public static void clear() {
        names=new String[4];
    }

    public static String[] findAll(){
        return names;
    }
}





