package unidade02.exe04;

public class Main {
    public static void main(String[] args) {
        Expressao exp = new Expressao("(1  1 /)");

        System.out.println(exp.estaCorretaSintaticamente());
        System.out.println(exp.getQtdeDivisores());
        System.out.println(exp.getPosicaoOperador());
    }
}
