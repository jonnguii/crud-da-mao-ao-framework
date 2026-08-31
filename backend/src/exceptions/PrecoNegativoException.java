package exceptions;

import model.Produto;

public class PrecoNegativoException extends RuntimeException {
    public PrecoNegativoException(String message) {
        super(message);
    }
}
