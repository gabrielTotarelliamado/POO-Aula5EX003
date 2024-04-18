package view;

import controller.OperacaoController;

public class Principal {
    public static void main(String[] args) {
        OperacaoController op = new OperacaoController();
        System.out.println(op.operacaoValor(2));
        System.out.println(op.operacaoValor(3));
        System.out.println(op.operacaoValor(-2));
    }
}
