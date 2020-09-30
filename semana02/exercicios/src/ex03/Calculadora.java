package ex03;

import static util.PrintUtil.*;

public class Calculadora {

    public void realizarOperacoes(double[] nums) {
        printLN(nums[0] + " + " + nums[1] + " = " + somar(nums));
        printLN(nums[0] + " - " + nums[1] + " = " + subtrair(nums));
        printLN(nums[0] + " * " + nums[1] + " = " + multiplicar(nums));
        printLN(nums[0] + " / " + nums[1] + " = " + dividir(nums));
        printLN(nums[0] + " % " + nums[1] + " = " + acharResto(nums));
        printLN(nums[0] + " ^ " + nums[1] + " = " + potenciar(nums));
    }

    private double somar(double[] nums) { return nums[0] + nums[1]; }

    private double subtrair(double[] nums) { return nums[0] - nums[1]; }

    private double multiplicar(double[] nums) { return nums[0] * nums[1]; }

    private double dividir(double[] nums) { return nums[0] / nums[1]; }

    private double acharResto(double[] nums) { return nums[0] % nums[1]; }

    private double potenciar(double[] nums) { return Math.pow(nums[0], nums[1]); }
}
