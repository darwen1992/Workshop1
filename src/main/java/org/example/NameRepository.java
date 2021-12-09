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
        System.out.println( find("Darwen AlTaeshi"));
        System.out.println(add("Samaar ahmed"));
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
    public static String find(final String fullName){
        String st=null;
        for(String s:names){

            if(s.equals(fullName)){ st=fullName;}
        }
        return st;
    }

    public static boolean add(final String fullName){
        boolean check=true;
        for(String s:names){
            if(s.equals(fullName)){ check=false;}
        }
        if(check==true){
            names[0]=fullName;
        }
 return  check;
    }
}

/*

    public static String find(final String fullName)
    Returns name if found and null if not found.

public static boolean add(final String fullName)
        Should add a new name to the array. Returns true when name was added and false when the array contains
        the name.
 */

