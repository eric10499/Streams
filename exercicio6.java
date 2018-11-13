package m9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Streams3_1 {
	public static void main (String [] args) {
			try {
				BufferedReader fichero = new BufferedReader(new FileReader("/home/cf17eric.visier/Escriptori"));
			} catch (FileNotFoundException fn) {
				System.out.println ("No se encuentra el fichero"); }
			catch (IOException io) {
			System.out.println ("Error de E/S"); }
	}
}
