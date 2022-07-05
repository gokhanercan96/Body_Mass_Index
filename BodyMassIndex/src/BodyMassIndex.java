import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        double height, weight, index;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz (m):");
        height = inp.nextDouble();

        System.out.print("Kilonuzu Giriniz (kg):");
        weight = inp.nextDouble();

        index = (weight)/(height*height);
        System.out.print("Vücut Kitle İndeksiniz: " +index);
    }

}
