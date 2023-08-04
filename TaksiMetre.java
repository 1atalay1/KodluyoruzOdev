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
public class TaksiMetre {
    public static void main(String [] args){
        Scanner input =new Scanner (System.in);
        System.out.println("Gidilicek yolu km cinsinden giriniz");
        double yol=input.nextDouble();
        int acilis=10;
        double km=2.20;
        
        double fiyat=(yol*km)+acilis;
        if(fiyat<=20){
            System.out.println("Ödenilicek tutar 20");
        }
        else {
            System.out.println("Ödenilecek tutar:"+fiyat );
        }
        
        
    }
}
