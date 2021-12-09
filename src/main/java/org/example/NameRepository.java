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

        String newst[]=findByFirstName("Samaar");
        for(String s:newst){
            System.out.println("First  " +s);
        }

        String newst1[]=findByLastName("AlTaeshi");
        for(String s:newst1){
            System.out.println("last  " +s);
        }
        for(String s:names){
            System.out.println("before updated  " +s);
        }
        update("Darwen AlTaeshi", "Helio Amaral");


        for(String s:names){
            System.out.println("updated  " +s);
        }
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


    public static String[] findByFirstName(final String firstName){
        String name[]=new String[4];
        int i=0;


        for(String s:names){
            if(firstName.equals(s.substring(0, s.indexOf(" ")))){
                name[i]=s;
                i++;
            }
        }
        return name;
    }

    public static String[] findByLastName(final String lastName){
        String name[]=new String[4];
        int i=0;
        String testt="";

        for(String s:names){
            testt=s.substring(s.indexOf(" ")+1,s.length() );

            if(lastName.equals(testt)){
                name[i]=s;
                i++;
            }
        }
        return name;
    }
   // public static boolean update(final String original, final String updatedName){}
   public static boolean update(final String original, final String updatedName){
        boolean check= false;

        if(!original.equals(updatedName)){

       for(int i=0;i< names.length;i++){
           if(names[i].equals(original)){ names[i]= updatedName;  check=true;
           }
       }

        }
       return check;
   }


}

