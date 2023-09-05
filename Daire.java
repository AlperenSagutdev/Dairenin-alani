import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double aci,r,pi = 3.14;

        System.out.println("Yarıçap değere giriniz: ");
        r = input.nextDouble();

        System.out.println("Merkez açısnın ölçüsünü giriniz");
        aci = input.nextDouble();

        double alan = (pi * (r*r) * aci)/360;
        System.out.println(alan);
    }
}
