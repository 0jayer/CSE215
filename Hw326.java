/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw326;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class Hw326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value:");
        int num = sc.nextInt();
        boolean case_1 = false;
        boolean case_2 = false;
        boolean case_3 = false;
        System.out.print("Is " + num + "divisible by 5 and 6?");
        if((num%5==0) && (num%6==0)){
            case_1 = true;
            System.out.println(case_1);
        }
        else{
            System.out.println(case_1);
        }
        System.out.print("Is " + num + "divisible by 5 or 6?");
        if((num%5==0) || (num%6==0)){
            case_2 = true;
            System.out.println(case_2);
        }
        else{
            System.out.println(case_2);
        }
        System.out.print("Is " + num + "divisible by 5 or 6, but not both?");
        if((num%5==0) ^ (num%6==0)){
            case_3 = true;
            System.out.println(case_3);
        }
        else{
            System.out.println(case_3);
        }
            
    }
    
}
