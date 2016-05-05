public void printNephew(int number) throws Exception {
		
		int profundidade = depth(number);
		aux = root;
		System.out.println(consultarTio(number, profundidade, aux));
		
		
	}
	
	public String consultarTio(int numero,int profundidade , NodeTree raiz){
		
		if(raiz == null){
			return "";
		} else if(profundidade != 0){
			return consultarTio(numero, profundidade - 1, raiz.getLeft()) + 
					consultarTio(numero, profundidade - 1, raiz.getRight());
		} else if(profundidade == 0 && numero == raiz.getInfo()){
			return "";
		} else {
			String resposta = "";
			if(raiz.getLeft() != null)
				resposta += raiz.getLeft().getInfo() + " ";
			if(raiz.getRight() != null)
				resposta += raiz.getRight().getInfo() + " ";
			return resposta;
		}
	}
