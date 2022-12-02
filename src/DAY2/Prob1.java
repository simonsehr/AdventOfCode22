package DAY2;

import java.io.File;
import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("./src/DAY2/input.txt"), "UTF-8");

        //String str = scan.nextLine();
        //System.out.println(str);
        //System.out.println(str.charAt(2));
        String str = "";
        int totalCast = 0;
        int totalWinLoss = 0;

        while(scan.hasNext()){

            str = scan.nextLine();
            char c = str.charAt(2);
            char a = str.charAt(0);

            if(c == 'X'){
                if(a == 'A'){
                    c = 'Z';
                    totalCast += 3;
                } else if(a == 'B'){
                    c = 'X';
                    totalCast += 1;
                }else{
                    c = 'Y';
                    totalCast += 2;
                }
                
            } else if(c == 'Y'){
                if(a == 'A'){
                    c = 'X';
                    totalCast += 1;
                }else if(a == 'B'){
                    c = 'Y';
                    totalCast += 2;
                }else{
                    c = 'Z';
                    totalCast += 3;
                }

            }else{
                if(a == 'A'){
                    c = 'Y';
                    totalCast += 2;
                } else if(a == 'B'){
                    c = 'Z';
                    totalCast += 3;
                }else{
                    c = 'X';
                    totalCast += 1;
                }
            }


            if((a == 'A' && c == 'X') || (a == 'B' && c == 'Y') || (a == 'C' && c == 'Z')){
                totalWinLoss += 3;
            }
            if((a == 'C' && c == 'X') || (a == 'A' && c == 'Y') || (a == 'B' && c == 'Z')){
                totalWinLoss += 6;
            }

        }

        System.out.println(totalCast);
        System.out.println(totalWinLoss);
        System.out.println(totalWinLoss+totalCast);



    }
    
}