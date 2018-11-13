package m9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroTexto2 {
	public static void main (String [] args) throws IOException {
		File fichero = new File("/home/cf17eric.visier/Escriptori/a.txt");
		FileWriter fic = new FileWriter (fichero, true);
		String prov[] = {"Albacete", "Avila", "Badajoz", "Caceres", "Huelva", "Jaen", "Madrid", "Segovia", "Soria", "Toledo", "Valladolid", "Zamora"};
		for ( int i=0; i < prov.length ; i++)
			fic.write(prov[i]); // se va escribiendo carácter a carácter
		fic.append ("*"); // añadimos un asterisco al final
		fic.close ();   // cerramos fichero
	}
}
