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
public class DaireAlan {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Yarı çapı giriniz");
        double r=input.nextDouble();
        System.out.println("Açıyı girin");
        double angel=input.nextDouble();
        double aci=angel/360;
        System.out.println("Dairenin Alanı: "+(Math.PI*r*r)*aci);
        System.out.println("Dairenin Çevresi:"+(Math.PI*2*r)*aci);
    
    }
}
