package ex39;

import util.LeitoraBase;
import static util.PrintUtil.printLN;

public class Leitora extends LeitoraBase {

    private double[] dados;

    public Leitora() {
        super();
        this.dados = new double[3];
    }

    @Override
    public void lerDados() {
        printLN("Digite 3 valores em linhas diferentes para verificar a existência de um triângulo:");
        dados[0] = input.nextDouble();
        dados[1] = input.nextDouble();
        dados[2] = input.nextDouble();
    }

    public double[] getDados() {
        return dados;
    }
}
