package DAY1;

import java.io.File;
import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("./src/DAY1/input.txt"), "UTF-8");

        int max = Integer.MIN_VALUE;
        int total = 0;

        while(scan.hasNext()){

            String str = scan.nextLine();


            if(!str.equals("")){

                total = total + Integer.parseInt(str);
                                  
            } else{

                if(total > max){
                    max = total;
        
                }

                total = 0; 
            }
            
        }

        System.out.println(max);

    }
    
}
