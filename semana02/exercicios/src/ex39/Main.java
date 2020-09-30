package ex39;

import static util.PrintUtil.printLN;

public class Main {

    public static void main(String[] args) {

        Leitora leitora = new Leitora();
        Triangulo triangulo = new Triangulo(leitora.getDados());

        leitora.lerDados();
        if(triangulo.verificarExistencia()) {
            printLN("Triângulo existe!");
        } else {
            printLN("Triângulo não existe!");
        }
        printLN(triangulo.toString());
        leitora.close();
    }
}
