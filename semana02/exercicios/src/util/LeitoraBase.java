package util;

import java.util.Scanner;

public abstract class LeitoraBase {

    protected Scanner input;

    public LeitoraBase() {
        this.input = new Scanner(System.in);
    }

    public abstract void lerDados();

    public void close() {
        input.close();
    }
}
