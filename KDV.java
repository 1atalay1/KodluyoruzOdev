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
public class KDV {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.println("KDV'siz fiyatı Girin:");
        double kdv;
        double price=0;
        double kdvamount=0;
        double wokdv=input.nextDouble();
        if(wokdv<=1000 && wokdv>=0){
           kdv=0.18;
           price=wokdv+(wokdv*kdv);
           kdvamount=price-wokdv;
           
            
        }
        else if(wokdv>1000){
            kdv=0.08;
            price=wokdv+(wokdv*kdv);
           kdvamount=price-wokdv;
        }
        else {
            System.out.println("Geçersiz para girişi");
        }
        
        System.out.println("KDV'siz Fiyat :"+wokdv);
        System.out.println("KDV'li Fiyat: "+price);
        System.out.println("KDV tutarı: "+kdvamount);
        
        
    }
}
