package controller;

public class OperacaoController {

    public OperacaoController() {
        super();
    }

    public int operacaoValor(int valor) throws ArithmeticException {
        if (valor > 0) {
            if (valor % 2 == 0) {
                return (int) Math.pow(valor, 2);
            }
            return (int) Math.pow(valor, 3);
        }
        throw new ArithmeticException("Não é possível realizar operações com números negativos aqui.");
    }
}
