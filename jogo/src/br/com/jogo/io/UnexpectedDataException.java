package br.com.jogo.io;

public class UnexpectedDataException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UnexpectedDataException(Throwable throwable) {
		super(throwable);
	}

}
