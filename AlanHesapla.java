package day01;
import java.util.Scanner;
public class AlanHesapla{

    public static void main(String[] args) {

        int birinciKenar,ikinciKenar,ucuncuKenar,cevre,temp;
       double alaninKaresi,alan;

        Scanner input= new Scanner(System.in);

        System.out.println("birinci kenar uzunluğunu giriniz: ");
        birinciKenar=input.nextInt();

        System.out.println("ikinci kenar uzunluğunu giriniz: ");
        ikinciKenar=input.nextInt();

        System.out.println("üçüncü kenarın uzunluğunu giriniz: ");
        ucuncuKenar=input.nextInt();

        cevre=(birinciKenar+ikinciKenar+ucuncuKenar);
        temp= cevre/2;

        alaninKaresi=temp*(temp-birinciKenar)*(temp-ikinciKenar)*(temp-ucuncuKenar);
        alan=Math.sqrt(alaninKaresi);
        System.out.println("alan: "+alan);






    }
}
