/*
 * Streams3_1.java
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
 * Escribe un programa en java que muestre por pantalla un fichero de texto que le pasamos como argumento (o utilizando scanner) utilizando la clase BufferedReader
 * 
 * Fet per Eric Visier Sánchez
 * 
 */

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
