package m9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Streams3_3 {
	public static void main (String [] args) throws IOException {
		BufferedWriter bw = null;

		try {
			File file = new File("/home/cf17eric.visier/Escriptori/a.txt");

			PrintWriter pw = new PrintWriter ( new FileWriter (file));

			for(int i = 0; i < 10; i++) {
				pw.println("File written Successfully");
			}
			
			pw.close();

		} catch (FileNotFoundException fn) {
			System.out.println ("No se encuentra el fichero"); }
		catch (IOException io) {
			System.out.println ("Error de E/S"); }
	}
}
