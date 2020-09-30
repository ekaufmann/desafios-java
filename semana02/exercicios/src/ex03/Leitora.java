package ex03;

import util.LeitoraBase;
import static util.PrintUtil.*;

public class Leitora extends LeitoraBase {

    private double[] nums;

    public Leitora() {
        super();
        this.nums = new double[2];
    }

    public double[] getNums() {
        return nums;
    }

    @Override
    public void lerDados() {
        printLN("Digite o primeiro número:");
        nums[0] = input.nextDouble();
        printLN("Digite o segundo número:");
        nums[1] = input.nextDouble();
    }
}
