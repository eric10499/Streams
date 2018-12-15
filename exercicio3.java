/*
 * projecte2.java
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
 * Modifica el ejemplo anterior para, en vez de escribir los caracteres uno a uno, escribir todo el array usando el método write (char [] buf)
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

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
