
package armstrong.sayisi.bulma;

import java.util.Scanner;


public class ArmstrongSayisiBulma {

 
    public static void main(String[] args) {
        
        // Girilen sayının armstrong olup, olmadığını bulan program..
        /* Armstrong = Girilen sayının basamak değerlerinin üssü basamak sayısı alınarak toplanır.
        Örneğin sayı 1634 = 1^4 + 6^4 + 3^4 + 4^4 */
        
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int sayi = klavye.nextInt();
        
        System.out.println("Girdiğiniz sayının basamak sayısını giriniz: ");
        int basamak_sayisi = klavye.nextInt();
        int gecici_sayi;
        gecici_sayi = sayi;
        int toplam = 0;
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi / 10;
            toplam += Math.pow(basamak_degeri, basamak_sayisi);
          
            
        }
        
        while(gecici_sayi > 0); {
        
        if(sayi == toplam) {
        System.out.println("Girdiğiniz sayı bir amstrong sayısıdır.."); }
        
        else {
            System.out.println("Girdiğiniz sayı bir amstrong sayısı değildir..");
        }
        
        
    }
        
        
    }
    
}
