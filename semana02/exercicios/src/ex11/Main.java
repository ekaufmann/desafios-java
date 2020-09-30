package ex11;

import java.util.Scanner;
import static util.PrintUtil.printLN;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double[][] pontos = new double[2][2];
        lerPonto(pontos[0]);
        lerPonto(pontos[1]);

        for(byte i = 0; i < pontos.length; i++) {
            printLN("Ponto " + (i+1) + ": " + pontos[i][0] + ", " + pontos[i][1]);
        }

        printLN("Distância entre pontos: " + calcularDistancia(pontos));

        input.close();
    }

    public static void lerPonto(double[] ponto) {
        printLN("Informe em linhas separadas os elementos x e y do ponto:");
        ponto[0] = input.nextDouble();
        ponto[1] = input.nextDouble();
    }

    public static double calcularDistancia(double[][] pontos) {
        double x = Math.pow(pontos[1][0] - pontos[0][0], 2);
        double y = Math.pow(pontos[1][1] - pontos[0][1], 2);
        return Math.sqrt(x + y);
    }
}
