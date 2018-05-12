/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekbaru;
import java.util.Scanner;

public class array {
    

public static void main (String args[]){
Scanner masuk = new Scanner(System.in);
float nilai[]=new float[5];
System.out.println("masukkan 5 buah data nilai");
for(int i=0; i<5; i++)
{
System.out.print("kuadrat "+ (i+1)+":");

nilai[i]=(i+1)*(i+1);
nilai[i]= masuk.nextFloat();

}
System.out.println("data nilai yang di masukkan ");
for (int i=0; i<5; i++)

    System.out.println(nilai[i]);
}
}
