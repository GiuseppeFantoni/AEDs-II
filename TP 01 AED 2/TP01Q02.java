public class TP01Q02{
	
	public static String criptografia(String entrada){

		String saida = "";
		char tmp;

		for(int i = 0; i < entrada.length(); i++){

			tmp = entrada.charAt(i);
			(int) tmp += 3;
			saida += tmp;
			

		}

		return saida;

	}

	public static void main(String[] args){

		String[] entrada = new String[1000];
		int numEntrada = 0;

		do{

			entrada[numEntrada] = MyIO.readLine();

		}while(!entrada[numEntrada++].equals("FIM"));

		numEntrada--;

		for(int i = 0; i < numEntrada; i++){

			MyIO.println(criptografia(entrada[numEntrada]));

		}

	}
	
}
