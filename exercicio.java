package m9;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FlujosoStreams {
	public static void main ( String [] args) throws IOException {
		
		File fichero = new File ("/home/cf17eric.visier/Escriptori/a.txt");  // declaración fichero
		FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
		int i;
		char [] buf = new char[20];
		while ((i=flu.read(buf))!=-1)     //Vamos leyendo carácter a carácter
		System.out.println (buf); //hacemos 
		flu.close();

	}
}
