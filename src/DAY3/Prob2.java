package DAY3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prob2 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("./AdventOfCode22/src/DAY3/input.txt"), "UTF-8");

        ArrayList<String> comp1 = new ArrayList<String>();
        int group = 0;
        int total = 0;
        HashMap<Character, Integer> dublo = new HashMap<Character, Integer>();

        while(scan.hasNext()){ // Fyller listorna med respektive halva
            String str = scan.nextLine();
            comp1.add(str);
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        
        char a = 'a';
        char A = 'A';
        
        for(int i = 0; i < 26; i++){
            if(i == 0){
                dublo.put(a, 0);
                dublo.put(A, 0);
                map.put(a , 1);
                map.put(A, 27);
 
            }else{
            a = (char) ((char) a+1);
            A = (char) ((char) A+1);

            dublo.put(a, 0);
            dublo.put(A, 0);

            map.put(a , i+1);
            map.put(A, i+27);
            }

        }
        int next = 0;
        int value = 0;
        String s = "";
        ArrayList<Character> alredyAdded = new ArrayList<Character>();
        char right = 'a';
        
        while(next < comp1.size()){
            s = comp1.get(next);
            alredyAdded.clear();

            for(int i = 0; i < s.length(); i++){
                if(!alredyAdded.contains(s.charAt(i))){

                    if(dublo.get(s.charAt(i)) == null){
                        dublo.put(s.charAt(i), 1);
                        alredyAdded.add(s.charAt(i));
                    }else{
                        value = dublo.get(s.charAt(i));
                        value = value +1;
                        System.out.println(value);
                        dublo.put(s.charAt(i), value);
                        alredyAdded.add(s.charAt(i));
                        if(value == 3){
                            right = s.charAt(i);
                        }

                    }

                }
            }
            group++;

            if(group == 3){
                group = 0;

                total = total + map.get(right);
                
                dublo.clear();
            }

            next++;

        }

        System.out.println(total);

    }
    
}