package ex02;

import util.LeitoraBase;

import java.util.Scanner;

public class Leitora extends LeitoraBase {

    private String nome;
    private int idade;
    private double salario;

    public Leitora() {
        super();
    }

    @Override
    public void lerDados() {
        System.out.println("Digite o seu nome:");
        nome = input.nextLine();
        System.out.println("Digite a sua idade:");
        idade = input.nextInt();
        System.out.println("Digite o seu salário:");
        salario = input.nextDouble();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Nome: ");
        output.append(nome);
        output.append("\nIdade: ");
        output.append(idade);
        output.append("\nSalário: ");
        output.append(salario);

        return output.toString();
    }
}
