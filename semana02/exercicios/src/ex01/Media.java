package ex01;

public class Media {

    public static void main(String[] args) {

        double media = calculaMedia(9,8,4,5,6,2,3);
        System.out.println(media);
        System.out.printf("%.2f", media);
    }

    public static Double calculaMedia(double... numeros) {
        double media = 0;
        if(numeros.length > 0) {
            for(double numero : numeros) {
                media += numero;
            }
            media /= numeros.length;
        }
        return media;
    }
}
