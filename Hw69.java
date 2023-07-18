/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw69;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class Hw69 {
    
    public static double footToMeter(double foot){
        double meter;
        meter = 0.305 * foot;
        
        return meter;
    }
    
    public static double meterToFoot(double meter){
        double foot;
        foot = 3.279 * meter;
        
        return foot;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = 0;
        double f = 0;
        double n_1 = 0;
        double n_2 = 0;
        double [] met_in = new double[3];
        double [] feet_in = new double[3];
        double [] met = new double[3];
        double [] feet = new double[3];
        int index_1=0;
        int index_2=0;
        System.out.println("Enter 6 value");
        for(int i=0;i<6;i++){
            
            if(i < 3){
                System.out.println("Enter value in foot: ");
                n_1 = sc.nextDouble();
                met_in[index_1] = n_1;
                m = footToMeter(n_1);
                met[index_1] = m;
                index_1++;
                
            }
            else{
                System.out.println("Enter value in meters: ");
                n_2 = sc.nextDouble();
                feet_in[index_2] = n_2;
                f = meterToFoot(n_2);
                feet[index_2] = f;
                index_2++;
                 
            }
           
            
           }
            System.out.print("Feet\t Meter \t|\tMeter\tFeet");
           System.out.println();
           System.out.print("________________________________________");
           System.out.println();
           for(int j=0;j<3;j++){
               System.out.printf("%.3f \t %.3f \t |\t %.3f \t %.3f",met_in[j], met[j],feet_in[j],feet[j]);
               System.out.println();
           }
           
        }
        
        
    

    
}
