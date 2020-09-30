package ex03;

public class Main {

    public static void main(String[] args) {

        Leitora leitora = new Leitora();
        Calculadora calculadora = new Calculadora();
        leitora.lerDados();

        calculadora.realizarOperacoes(leitora.getNums());

        leitora.close();
    }
}
