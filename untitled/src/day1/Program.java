package day1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
          /* Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak...*/
        int mat,fiz,kim,tur,tar,muz;

        Scanner input=new Scanner(System.in);


        System.out.print("Matematik Notu : ");
        mat=input.nextInt();

        System.out.print("Fizik Notu : ");
        fiz=input.nextInt();

        System.out.print("Kimya Notu : ");
        kim=input.nextInt();

        System.out.print("Türkçe Notu : ");
        tur=input.nextInt();

        System.out.print("Tarih Notu : ");
        tar=input.nextInt();

        System.out.print("Müzik Notu : ");
        muz=input.nextInt();
        double ort=(mat+fiz+kim+tur+tar+muz)/6;

        System.out.printf("%5.2f Not Ortalaması --> ",ort);

        String sonuc= ort>=60? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
