import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BmiServise calculate = new BmiServise();
        int mKg = 98;
        double hM = 1.87;
        double index = (int) calculate.index(mKg, hM);
        System.out.println(index);
    }
}