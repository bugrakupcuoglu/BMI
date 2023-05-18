import java.util.Scanner;
public class javaPatikasi5 {
    public static void main(String[] args) {
        double heigth,weigth,BMI;
        Scanner input = new Scanner(System.in);
        System.out.print("Lüften boyunuzu metre cinsinden giriniz : ");
        heigth = input.nextDouble();
        System.out.print("Lütfen kilonuzu kg giriniz : ");
        weigth = input.nextDouble();
        BMI = weigth/Math.pow(heigth,2);
        System.out.print("Vücut Kitle İndeksiniz : " + BMI);
    }
}
