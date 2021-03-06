import java.io.*;

/**
 * Trabalho Pratico 04 - AEDs II 
 * @author Matheus Kraisfeld
 * @version 2017/04
 */

class TP04Q01{

	public static void main(String[] args){

		try{
			RandomAccessFile arq = new RandomAccessFile("tp04q01.txt", "rw");
	
			int entradas = MyIO.readInt();
	
			for(int i = 0; i < entradas; i++){
	
				arq.writeDouble(MyIO.readDouble());
	
			}
	
			long pt = arq.getFilePointer() - 8;

			//Recebi a ajuda do aluno Giuseppe com parte do bloco a seguir
	
			for(long i = pt; i >= 0; i -= 8){
	
				arq.seek(i);
	
				double tmp = arq.readDouble();
	
				if(tmp == (int) tmp){
	
					MyIO.println((int) tmp);
	
				}
				else{
	
					MyIO.println(tmp);
	
				}
	
			}
		}catch(Exception e){

			MyIO.println("Erro");

		}

	}


}
