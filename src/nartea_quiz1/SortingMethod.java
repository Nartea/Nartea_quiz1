/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nartea_quiz1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class SortingMethod {
    public static void bubbleSort(int arr[]){
         int n= arr.length;
         
         for (int l = 0; l < n-1 ; l++) {
             for (int q = 0; q < n-l-1; q++) {
                 
                 if(arr[q]>arr[q+1]){
                     int m= arr[q];
                     arr[q]=arr[q+1];
                     arr[q+1]=m;
                 }
                 
             }
         }
     }
    
    public static void printIt(int arr[]){
             for (int num: arr) {
                 System.out.println(num + ",");
             }
    }
    
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         
        System.out.println("enter the array number: ");
        int size=s.nextInt();
        int[]array=new int[size];
        
        System.out.println("enter 0 to confirm then start typing the elements ");
        System.out.print("enter the elements: ");
        int num=s.nextInt();
         for (int i = 0; i < size; i++) {
            array[i]=s.nextInt();
 
        }
         System.out.println("the original Array: ");
        printIt(array);
        bubbleSort(array);
        
        System.out.println("\nsorted: ");
        printIt(array);
        bubbleSort(array);
    }
      
     
}
