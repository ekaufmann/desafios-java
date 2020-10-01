import list.DoubleList;
import list.FiniteList;
import list.HalfList;

public class Main {

    public static void main(String[] args) {

        FiniteList lista = new FiniteList();
        DoubleList lista2 = new DoubleList();
        HalfList lista3 = new HalfList();

        for(int i = 0; i < lista.size(); i++) {
            lista.add(i);
            lista2.add(i);
            lista3.add(i);
        }

        System.out.println("Tamanho lista 1: " + lista.size());
        System.out.println("Lista 1: " + lista.toString());
        System.out.println("Tamanho lista 2: " + lista2.size());
        System.out.println("Lista 2: " + lista2.toString());
        System.out.println("Tamanho lista 3: " + lista3.size());
        System.out.println("Lista 3: " + lista3.toString());

        System.out.println();
        for(int i = 0; i < lista.size(); i++) {
            lista.add(i);
            lista2.add(i);
            lista3.add(i);
        }

        System.out.println("Tamanho lista 1: " + lista.size());
        System.out.println("Lista 1: " + lista.toString());
        System.out.println("Tamanho lista 2: " + lista2.size());
        System.out.println("Lista 2: " + lista2.toString());
        System.out.println("Tamanho lista 3: " + lista3.size());
        System.out.println("Lista 3: " + lista3.toString());
    }
}
