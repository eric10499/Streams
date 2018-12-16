/*
 * Streams3_3.java
 * 
 * Copyright 2018 ERIC <ERIC@DESKTOP-5T1N085>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * Repite el ejercicio anterior pero ahora utilizando la clase PrintWriter
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

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
