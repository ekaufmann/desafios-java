import list.FiniteList;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args) {

        FiniteList lista = new FiniteList();

        for(int i = 0; i < lista.size(); i++) {
            lista.add(i);
        }
        System.out.println(lista);
        System.out.println();

        System.out.println(lista.contains(20));
        System.out.println(lista.contains(40));

        lista.remove(20);
        lista.remove(10);

        System.out.println(lista);
        System.out.println(lista.size());
    }
}
