package unidade02.exe04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cauã
 */

public class Expressao {

    private final String expressao;
    private List<Character> elementosExpressao = new ArrayList<Character>();

    public int getPosicaoOperador() {
        this.elementosExpressao = armazenarElementosEmLista(this.expressao);
        int posicao = 0;

        for (char elemento : elementosExpressao) {
            if (elemento == '+' || elemento == '-' || elemento == '*' || elemento == '/') {
                if (posicao == 0) {
                    posicao = elementosExpressao.indexOf(elemento);
                } else {
                    posicao = posicao;
                }
            }
        }

        return posicao;
    }

    public int getQtdeDivisores() {

        int qntDivisores = 0;

        for (char elemento : elementosExpressao) {
            if (elemento == '/') {
                qntDivisores ++;
            }
        }

        return qntDivisores;
    }

    public boolean estaCorretaSintaticamente() {

        int abreParenteses = 0;
        int fechaParenteses = 0;

        for(char elemento : elementosExpressao) {
            if(elemento == '(') {
                abreParenteses ++;
            }

            if (elemento == ')') {
                fechaParenteses ++;
            }
        }

        if (abreParenteses == fechaParenteses) {
            return true;
        } else {
            return false;
        }
    }

    /** Método usado para armazenar cada elemento da expressão em uma lista.*/
    private List<Character> armazenarElementosEmLista(String expressao) {
        char[] elementos = expressao.toCharArray();
        for (char elemento : elementos) {
            this.elementosExpressao.add(elemento);
        }

        return elementosExpressao;
    }

    /** Construtor da classe */
    public Expressao(String exp) {
        this.expressao = exp;
    }
}
