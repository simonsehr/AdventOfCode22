package DAY4;

import java.io.File;
import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("./AdventOfCode22/src/DAY4/input.txt"), "UTF-8");
        String[] array1 = new String[4];
        String[] interval1 = new String[2];
        String[] interval2 = new String[2];
        int nbr = 0;



        while(scan.hasNext()){
            String str = scan.nextLine();

            //Split
            array1 = str.split(",");
            interval1 = array1[0].split("-");
            interval2 = array1[1].split("-");
            //first interval
            int digit1 = Integer.parseInt(interval1[0]);
            int digit2 = Integer.parseInt(interval1[1]);
            //second interval
            int digit3 = Integer.parseInt(interval2[0]);
            int digit4 = Integer.parseInt(interval2[1]);

            if(digit1 >= digit3 && digit2 <= digit4){
                nbr += 1;
            }

            else if(digit3 >= digit1 && digit4 <= digit2){
                nbr += 1;
            }
        }  

    
        System.out.println(nbr);
    }
    
}