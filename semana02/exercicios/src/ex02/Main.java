package ex02;

public class Main {

    public static void main(String[] args) {

        Leitora leitora = new Leitora();

        leitora.lerDados();
        System.out.println(leitora);
        leitora.close();
    }
}
