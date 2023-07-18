/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringrev;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class Stringrev {

    
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        char[] ch = str.toCharArray();
        System.out.println("Revered string:");
        int length = ch.length;
        for(int i=length;i>0;i--){
            System.out.print(ch[i-1]);
        }
         System.out.println();
    }  
}
