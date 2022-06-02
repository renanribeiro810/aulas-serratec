package org.serratec.backend.projeto05.exception;

public class ApiException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ApiException(String message) {
		super(message);
	}

}