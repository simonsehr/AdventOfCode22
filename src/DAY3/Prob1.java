package DAY3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("./AdventOfCode22/src/DAY3/input.txt"), "UTF-8");

        ArrayList<String> comp1 = new ArrayList<String>();
        ArrayList<String> comp2 = new ArrayList<String>();
        String temp = "";
        String str = "";
        int total = 0;
    

        while(scan.hasNext()){ // Fyller listorna med respektive halva

            str = scan.nextLine();
            temp = "";
            for(int i = str.length()/2; i < str.length()-1; i++){
                temp = temp + str.charAt(i);
            }
            comp1.add(temp);

            temp = "";
            for(int j = 0; j < str.length()/2;j++){
                temp = temp + str.charAt(j);
            }
            comp2.add(temp);    
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> times = new HashMap<Character, Integer>();
        
        char a = 'a';
        char A = 'A';
        
        for(int i = 0; i < 26; i++){
            if(i == 0){
                times.put(a, 0);
                times.put(A, 0);
                map.put(a , 1);
                map.put(A, 27);
 
            }else{
            a = (char) ((char) a+1);
            A = (char) ((char) A+1);
            times.put(a, 0);
            times.put(A, 0);
            map.put(a , i+1);
            map.put(A, i+27);
            }

        }
        int next = 0;
        int value = 0;
        ArrayList<Character> alredyAdded = new ArrayList<Character>();
        while(next < comp1.size()){

            String half1 = comp1.get(next);
            String half2 = comp2.get(next);
            String c = "";
            
            
            /*for(int i = 0; i < half2.length(); i++){
                c = "" + half2.charAt(i);
                if(half1.contains(c)){
                    value = map.get(half2.charAt(i));
                    total = total + value;
                    System.out.println(value + " was added for: " + half2.charAt(i));
                }
            }*/

            for(int i = 0; i < half2.length(); i++){
                for(int j = 0; j < half1.length(); j++){
                    if(half1.charAt(j) == half2.charAt(i)){
                        if(!alredyAdded.contains(half1.charAt(j))){
                            value = map.get(half1.charAt(j));
                            total = total + value;
                            alredyAdded.add(half1.charAt(j));
                        }
   
                    }
                }
            }
            next++;

        }


            System.out.println(total);


    }
    
}