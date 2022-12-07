package com.ydmaia.creational;

public class ChessBoard {
	
	//Aplica��o de primeiro pattern, chamado de Singleton:
	//Aqui aplicamos o lazy instanciation, onde s� criamos a inst�ncia do mesmo, quando precisarmos dele
		//para evitar que assim que o projeto seja carregado a inst�ncia seja criada e carregada na mem�ria
	//por isso inicializamos com null e mudamos a implementa��o do getIntance
	static private ChessBoard instance = null; 
	
	private ChessBoard() {
		//construtor privado para permitir que essa classe tenha uma inst�ncia �nica
		//e com isso, nem as subclasses pdoer�o instanci�-la
	}
	
	//Criamos um m�todo para ser uma forma de acessarmos a inst�ncia �nica em outras classes
	static ChessBoard getInstance() {
		//Aqui iremos verificar se o objeto j� foi instanciado
		if(instance == null) {
			//precisamos criar a inst�ncia
			instance = new ChessBoard();
		}
			//devolve a inst�ncia
			return instance;

	}
	
	public static void main(String args[]) {
		
		ChessBoard tabuleito = ChessBoard.getInstance();
	}
	
	
}
