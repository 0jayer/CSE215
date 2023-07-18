/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw29;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class Hw29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value between 0 and 9999:");
        int num = sc.nextInt();
        int rem = 0;
        int sum = 0;
        while(num!=0){
            rem = num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of digits:" + sum);
        
    
   }
}
