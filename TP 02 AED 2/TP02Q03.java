import java.util.Random;

public class TP02Q03{

	public static boolean findEnd(String entrada){
	
		return findEnd(entrada, 0);

	}

	public static boolean findEnd(String entrada, int posicao){

		boolean resp = false;
		String end = "FIM";

		if(posicao == entrada.length()){
	
			resp = true;

		}
		else if(entrada.charAt(posicao) == end.charAt(posicao)){

				resp = findEnd(entrada, posicao + 1);

			}

		return resp;

	}	

/**
*Metodo que verifica se a palavra recebida eh a palavra FIM e retorna verdadeiro ou falso
*/

	public static void alteracao(String entrada, Random gerador){
		
		char c1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
		char c2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
		MyIO.println(alteracao(entrada, 0, c1, c2));

	}

	public static String alteracao(String entrada, int posicao, char c1, char c2){

		String tmp = "";
	
		if(posicao == entrada.length()){

			tmp += "";

		}
		else if(entrada.charAt(posicao) == c1){

				tmp += c2 + alteracao(entrada, posicao+1, c1, c2);

			}
			else{

				tmp += entrada.charAt(posicao) + alteracao(entrada, posicao+1, c1, c2);

			}

		return tmp;

	}

/**
*Metodo que recebe o objeto gerador e a entrada, sorteia um caracter e substitui as ocorrencias do mesmo por outro sorteado
*/

	public static void main(String[] args){

		
		Random gerador = new Random();
		gerador.setSeed(4);

		String[] entrada = new String[1000];
		int numEntrada = 0;
		boolean end;

		entrada[numEntrada] = MyIO.readLine();
		
		while(!findEnd(entrada[numEntrada])){

			alteracao(entrada[numEntrada], gerador);
			numEntrada++;
			entrada[numEntrada] = MyIO.readLine();

		}

	}

}
