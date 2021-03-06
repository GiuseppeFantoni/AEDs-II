class TP02Q01{

	public static boolean ehPalindromo(String entrada){

		return ehPalindromo(entrada, 0, entrada.length()-1);

	}

/*
sobrecarga de metodo
*/

	public static boolean ehPalindromo(String entrada, int inicio, int fim){

		boolean resp = false;

		if(inicio > fim){

			resp = true;

		}
		else if(entrada.charAt(inicio) == entrada.charAt(fim)){

				resp = ehPalindromo(entrada, inicio + 1, fim - 1);

			}
			else if(entrada.charAt(inicio) != entrada.charAt(fim)){

					resp = false;

				}

		return resp;

	}

/*
primeiro if --- caso base
segundo if --- se o caracter for igual, resp recebe o valor da chamada do metodo com a proxima comparacao
terceiro if --- se o caracter for diferente, resp recebe false e retorna
*/

	public static void main(String[] args){

		String[] entrada = new String[1000];
		int numEntrada = 0;

		do{

			entrada[numEntrada] = MyIO.readLine();

		}while(!entrada[numEntrada++].equals("FIM") && numEntrada < entrada.length);

		numEntrada--;

/*
loop que alimenta o array com entradas ate encontrar a palavra FIM
*/

		for(int i = 0; i < numEntrada; i++){

			if(ehPalindromo(entrada[i])){

				MyIO.println("SIM");

			}
			else{

				MyIO.println("NAO");

			} // fim if else

/*
loop que retorna a saida de cada posicao do array
*/

		} // fim for

	} // fim main

} // fim class
