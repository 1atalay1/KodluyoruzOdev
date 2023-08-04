/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sertifika;

import java.util.Scanner;

/**
 *
 * @author Oğuzhan
 */
public class Sertifika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double kilo,boy,Index;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kilo=input.nextDouble();
        Index=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+Index);
        
    }
    
}
