package br.com.selecao;

public class ParametroInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ParametroInvalidoException(String message) {
		super(message);
	}
}
