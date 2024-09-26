package com.example.project;
import java.util.Scanner;

public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                    //calculations
        double total = (cost * (1+(percent/100.0)));  
        double tip = ((total - cost)*100) / 100.0;
        double tpp = ((tip / people)*100)/100.0;
        double cppbt = ((cost / people)*100)/100.0;
        double cpp = ((total / people)*100)/100.0;

        //rounding
        total = Math.round(total*100)/100.0; 
        tip = Math.round(tip*100)/100.0;            //learned how to use math.round from Casey
        tpp = Math.round(tpp*100)/100.0;
        cppbt = Math.round(cppbt*100)/100.0;
        cpp = Math.round(cpp*100)/100.0;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + total + "\n");
        result.append("Per person cost before tip: " + "$" + cppbt + "\n");
        result.append("Tip per person: " + "$" + tpp + "\n");
        result.append("Total cost per person: " + "$" + cpp + "\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              

        //Your scanner object and while loop should go here

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an item name or type '-1' to finish:");
        String item = "a";
        String items = "";

 

        while (!item.equals("-1")) {
            System.out.println("Enter an item name or type '-1' to finish:");
            item = scan.nextLine();
            if (item.equals("-1")) {
                break;
            }
            else {
                items = items + item + "\n";
            }
        }    

        System.out.println(calculateTip(people,percent,cost,items));
        scan.close();
    }
}
