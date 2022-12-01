package DAY1;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Prob2 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("./src/DAY1/input.txt"), "UTF-8");
        int total = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(scan.hasNext()){

            String str = scan.nextLine();


            if(!str.equals("")){

                total = total + Integer.parseInt(str);

                                  
            } else{
                list.add(total);
                total = 0;
            }
            
        }

        list.sort((a, b) -> b.compareTo(a) );

        System.out.println(list.get(0) + list.get(1) + list.get(2));

    }

    
}
