package com.ydmaia.creational;

public class ChessBoard {
	
	//Aplicação de primeiro pattern, chamado de Singleton:
	//Aqui aplicamos o lazy instanciation, onde só criamos a instância do mesmo, quando precisarmos dele
		//para evitar que assim que o projeto seja carregado a instância seja criada e carregada na memória
	//por isso inicializamos com null e mudamos a implementação do getIntance
	static private ChessBoard instance = null; 
	
	private ChessBoard() {
		//construtor privado para permitir que essa classe tenha uma instância única
		//e com isso, nem as subclasses pdoerão instanciá-la
	}
	
	//Criamos um método para ser uma forma de acessarmos a instância única em outras classes
	static ChessBoard getInstance() {
		//Aqui iremos verificar se o objeto já foi instanciado
		if(instance == null) {
			//precisamos criar a instância
			instance = new ChessBoard();
		}
			//devolve a instância
			return instance;

	}
	
	public static void main(String args[]) {
		
		ChessBoard tabuleito = ChessBoard.getInstance();
	}
	
	
}
