package kdv.hesaplama;
import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double tutar;
        double kdvOran=0.18;
       
        Scanner input=new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz:");
        tutar=input.nextDouble();
        
        double kdvTutar=tutar+kdvOran;
        double kdvliTutar=tutar+kdvTutar;
        
        System.out.println("kdv'siz Tutar:"+tutar);
        System.out.println("kdv Oranı:"+kdvOran);
        System.out.println("kdv Tutarı:"+kdvTutar);
        System.out.println("kdvli Tutar:"+kdvliTutar);
        
        
    }
    
}
