/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sertifika;

import java.util.Scanner;

/**
 *
 * @author Oğuzhan
 */
public class UcgenAlan {
    public static void main (String [] args){    
    Scanner input =new Scanner(System.in);
        int k1,k2,k3; //Kenarlar
        System.out.println("Kenar uzunluğu girin");
        k1=input.nextInt();
          System.out.println("Kenar uzunluğu girin");
          k2=input.nextInt();
            System.out.println("Kenar uzunluğu girin");
            k3=input.nextInt();
            
        int cevre=(k1+k2+k3); //2u
        double u =cevre /2.0;
        double Area=0;
        double temp=u*(u-k1)*(u-k2)*(u-k3);
        Area =Math.sqrt(temp);
        System.out.println("Alan :" +Area);
        
        
        
    }
        
        
}
