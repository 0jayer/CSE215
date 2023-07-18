/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw418;
import java.util.Scanner;

public class Hw418 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two characters:");
        String s = sc.nextLine();
        char ch = s.charAt(0);
        char ch_2 = s.charAt(1);
        if((s.length()==2)){
            if(ch=='M'){
                if(ch_2 == '1'){
                    System.out.println("Mathematics Freshman");
                }
                else if(ch_2 == '2'){
                    System.out.println("Mathematics Sophmore");
                }
                else if(ch_2 == '3'){
                    System.out.println("Mathematics Junior");
                }
                else if(ch_2 == '4'){
                   System.out.println("Mathematics Senior");
                }
                else{
                    System.out.println("Invalid input");
                    
                }
            }
            else if(ch=='C'){
                if(ch_2 == '1'){
                    System.out.println("Computer Science Freshman");
                }
                else if(ch_2 == '2'){
                    System.out.println("Computer Science Sophmore");
                }
                else if(ch_2 == '3'){
                    System.out.println("Computer Science Junior");
                }
                else if(ch_2 == '4'){
                   System.out.println("Computer Science Senior");
                }
                else{
                    System.out.println("Invalid input");
                    
                }
            }
            else if(ch=='I'){
                if(ch_2 == '1'){
                    System.out.println("Information Technology Freshman");
                }
                else if(ch_2 == '2'){
                    System.out.println("Information Technology Sophmore");
                }
                else if(ch_2 == '3'){
                    System.out.println("Information Technology Junior");
                }
                else if(ch_2 == '4'){
                   System.out.println("Information Technology Senior");
                }
                else{
                    System.out.println("Invalid input");
                    
                }
            }
            else{
                System.out.println("Invalid");
            }
            
        }
        
    }
    
}
