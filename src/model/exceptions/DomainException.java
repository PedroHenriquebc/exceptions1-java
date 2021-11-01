package model.exceptions;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	//instanciar a minha exce��o personalizada, passando uma mensagem
	public DomainException(String msg) {
		super(msg);
	}
}
