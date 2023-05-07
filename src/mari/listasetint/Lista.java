
package mari.listasetint;
public class Lista {
	No primeiro;
	
	public Lista() {
		primeiro =null;
	}
	public boolean isEmpty() {
		if (primeiro ==null) {
			return true;
		}else {
			return false;
		}
	}
	public int size() {
		int cont=0;
		if(!isEmpty()) {
			No auxiliar =primeiro;
			while(auxiliar!=null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	private No getNo(int pos) throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		int tamanho = size();
		if(pos<0||pos>tamanho-1) {
			throw new Exception("Posição Invalida");
		}
		No auxiliar = primeiro;
		int cont =0;
		while(cont<pos) {
			auxiliar= auxiliar.proximo;
			cont++;
		}
		return auxiliar;
	}
	public boolean addFirst(int valor) {
		 No elemento = new No();
		 elemento.dado=valor;
		if(isEmpty()||!contains(valor)){
			 elemento.proximo = primeiro;
			 primeiro = elemento;
			 return true;
			 
			}else {
				return false;
			}
		    }

	 private boolean contains(int valor) {
		No auxiliar = primeiro;
			while(auxiliar!=null) {
				if(auxiliar.dado==valor) {
					 return true;
					 auxiliar=auxiliar.proximo;
				}
			
		     public boolean addLast(int valor) throws Exception {

		if (isEmpty()||!contains(valor)) {
		 throw new Exception("Lista Vazia");
		 No elemento = new No();

		 elemento.dado = valor;
		 elemento.proximo = null;

		int tamanho = size();
		No ultimo = getNo(tamanho - 1);
		 ultimo.proximo = elemento;
		 return true;
		}else {
			return false;
		}
		    }

		public boolean add(int valor, int pos) throws Exception {
		 if (isEmpty()||!contains(valor)) {
		 throw new Exception("Lista Vazia");
		 int tamanho = size();
		 	if (pos < 0 || pos > tamanho) {
		 		throw new Exception("Posição inválida");
		 	}
		 	if (pos == 0) {
		 		 addFirst(valor);
		 	} else if (pos == tamanho) {
		 		addLast(valor);
		 	} else {
		 		No elemento = new No();
		 		elemento.dado = valor;
		 		No anterior = getNo(pos - 1);
		 		elemento.proximo = anterior.proximo;
		 		anterior.proximo = elemento;
		 		return true;
		 		
		      }else {
			return false;
		}
		        
		    }
	}
		public void removaFirst() throws Exception {
			if (isEmpty()) {
				throw new Exception("lista Vazia");
			}
			primeiro =primeiro.proximo;
		}
		public void removaLast() throws Exception {
			if(isEmpty()) {
				throw new Exception("Lista Vazia");
			}
			int tamanho = size();
			if(tamanho ==1) {
				removaFirst();
			}else {
				No penultimo = getNo (tamanho -2);
				penultimo.proximo=null;
			}
		}
		public void remova (int pos) throws Exception {
			if(isEmpty()) {
				throw new Exception("Lista Vazia");
			}
			int tamanho = size();
			if(pos<0||pos>tamanho-1) {
				throw new Exception("Posição Invalida");
			}
			if(pos==0) {
				removaFirst();
			}else if(pos==tamanho-1) {
				removaLast();
			}else {
				No atual =getNo(pos);
				No anterior = getNo(pos-1);
				anterior.proximo=atual.proximo;
			}
		}
		public int get(int pos) throws Exception {
			No atual = getNo(pos);
			return atual.dado;
		}
}