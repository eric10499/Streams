package m9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Streams3_2 {
	public static void main (String [] args) throws IOException {
		BufferedWriter bw = null;

		try {
			File file = new File("/home/cf17eric.visier/Escriptori/a.txt");

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for(int i = 0; i < 10; i++) {
				bw.write("File written Successfully");
				bw.newLine();
			}

		} catch (FileNotFoundException fn) {
			System.out.println ("No se encuentra el fichero"); }
		catch (IOException io) {
			System.out.println ("Error de E/S"); }


		finally { 
			bw.close();
		}
	}
}
