/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw64;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class Hw64 {

    public static void reverse(int number){
        int rem=0;
        int dig=0;
        while(number!=0){
            rem = number%10;
            dig = dig*10 + rem;
            number/=10;
        }
        System.out.println(dig);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }
    
}
