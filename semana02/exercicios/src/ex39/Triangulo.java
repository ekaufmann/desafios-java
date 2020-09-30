package ex39;

public class Triangulo {

    private double[] lados;
    private double maior = 0, b = 0, c = 0;

    public Triangulo(double[] lados) {
        this.lados = lados;
    }

    public boolean verificarExistencia() {
        definirLados();
        return (b + c) > maior;
    }

    private void definirLados() {
        byte indexMaior = 0;
        for(byte i = 0; i < lados.length; i++) {
            if(lados[i] > maior) {
                maior = lados[i];
                indexMaior = i;
            }
        }

        for(byte j = 0; j < lados.length; j++) {
            if(j == indexMaior) {
                continue;
            }
            if(b == 0) {
                b = lados[j];
            } else if(c == 0) {
                c = lados[j];
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(maior);

        if(verificarExistencia()) {
            output.append(" < ");
        } else {
            output.append(" > ");
        }

        output.append(b);
        output.append(" + ");
        output.append(c);

        return output.toString();
    }
}
