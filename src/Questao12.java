import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        System.out.println("Informe a sua altura: ");
        float h;
        Scanner leia = new Scanner(System.in);
        h = leia.nextFloat();
        double pesoideal;
        pesoideal = (72.7 * h) - 58;
        leia.close();

        System.out.println(pesoideal);
    }
}
