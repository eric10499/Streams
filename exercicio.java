/*
 * FlujosoStreams.java
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
 * Aquest programa realiza la conversió de les dades de l'arxiu tsv a un fitxer sql.
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

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
