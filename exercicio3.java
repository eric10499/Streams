package m9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroTexto {
	public static void main (String [] args) throws IOException {
		File fichero = new File("/home/cf17eric.visier/Escriptori/a.txt");
		FileWriter fic = new FileWriter (fichero, true);
		String cadena = " Esto es una prueba con FileWriter aaaaaaaaaaaaa";
		char [] buf = cadena.toCharArray () ;
		fic.write (buf); // se va escribiendo carácter a carácter
		fic.append ("*"); // añadimos un asterisco al final
		fic.close ();   // cerramos fichero
	}
}
