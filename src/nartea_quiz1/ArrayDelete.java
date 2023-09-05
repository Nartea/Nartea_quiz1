/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nartea_quiz1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ArrayDelete {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter the array number: ");
        int size=s.nextInt();
        int[]array=new int[size];
         
        System.out.println("enter 0 to confirm then start typing the elements ");
        System.out.println("enter the elements: ");
        int num=s.nextInt();
         for (int i = 0; i < size; i++) {
            array[i]=s.nextInt();
 
            
        }
          System.out.println("array : "+Arrays.toString(array));
      
        
         
         
    }
}
