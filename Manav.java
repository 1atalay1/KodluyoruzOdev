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
public class Manav {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        double armut,elma,muz,domates,patlıcan;
        armut=2.14;
        elma=3.67;
        muz=0.95;
        domates=1.11;        
        patlıcan=5.0;
        double fiyat=0;
        System.out.println("Armut kaç kilo:");
        double armutKilo=input.nextDouble();
        fiyat+=armut*armutKilo;
        System.out.println("Elma Kaç Kilo:");
        double elmaKilo=input.nextDouble();
        fiyat+=elmaKilo*elma;
        System.out.println("Muz Kaç Kilo:");
        double muzKilo=input.nextDouble();
        fiyat+=muzKilo*muz;
        System.out.println("Domates Kaç Kilo:");
        double domatesKilo =input .nextDouble();
        fiyat+=domatesKilo*domates;
        System.out.println("Patlıcan Kaç Kilo:");
        double patlıcanKilo=input.nextDouble();
        fiyat+=patlıcan*patlıcanKilo;
        System.out.println("Toplam Fiyat:"+fiyat+"$");
        
        
                }
    
    
}
