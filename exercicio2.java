package m9;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FlujosoStreams2 {
	public static void main ( String [] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);

		//Pedimos los datos del estudiante
		System.out.print("Introduzca la ruta donde se encuentra el fichero a leer");
		String path = scanner.nextLine();
		
		File fichero = new File (path);  // declaración fichero
		FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
		int i;
		char [] buf = new char[20];
		while ((i=flu.read(buf))!=-1)     //Vamos leyendo carácter a carácter
		System.out.println (buf); //hacemos 
		flu.close();

	}
}
