/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekbaru;

import java.util.Scanner;

/**
 *
 * @author jono
 */
public class Projekbaru {

public static String toOctal(int decimal){    
    
   //octal pertama
    int rem;  
    String octal="";   
    char octalchars[]={'0','1','2','3','4','5','6','7'};  
   
    while(decimal>0)  
    {  
       rem=decimal%8;   
       octal=octalchars[rem]+octal;   
       decimal=decimal/8;  
    }  
    return octal;  

//octal ke dua 
//    System.out.println("masukan nilai desimal : 8 ");
////     =input.nextInt();
//    String octalString = Integer.toOctalString(num);
//    System.out.println("hasil nilai ke octal: " + octalString);
//    int rem;
//    String str=""; 
//    char dig[]={'0','1','2','3','4','5','6','7'};
// 
//    while(num>0)
//    {
//       rem=num%8; 
//       str=dig[rem]+str; 
//       num=num/8;
//    }
//    System.out.println("Method 2: Decimal to octal: "+str);

//int decimal = 0;
//        int biner = 0;
//        
//        Scanner DataIn = new Scanner(System.in);
//     System.out.println("Masukan Bilangan Desimal : ");
//        decimal = DataIn.nextInt();
//     
//        System.out.println("Biner dari "+decimal+" adalah : ");
//        System.out.println(Integer.toBinaryString(decimal));
//    
//        
    }
   
    public static void main(String[] args) {
//        octal(8);

        //Bilangan decimal ke octal
        
        // baru poeratama
       System.out.println("Decimal of octal 8 is: "+toOctal(8));  
System.out.println("Decimal of octal 19 is: "+toOctal(19));  
System.out.println("Decimal of octal 81 is: "+toOctal(81));
        
    }
    
}
