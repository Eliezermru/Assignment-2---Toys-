package mru.tsc.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

import mru.tsc.model.Toy;

/**
 * This class parses the file into a single ArrayList that contains all types of Toys (puzzle,figure,animals, and board games. 
 */
public class FileManager {

	
	ArrayList<Toy> toys = new ArrayList<>();
	final String FILE_PATH = "res/toys.txt";
	
	
	
	public ArrayList<Toy> readToyList() throws IOException{ // Temporary throws.
		
		FileReader file = new FileReader(FILE_PATH);
		BufferedReader input = new BufferedReader(file);

		String line;
		String[] currentToy;
		
		while( (line = input.readLine()) != null) {
			currentToy = line.trim().split(";");
			
			
		}
		
		return toys;

		
		
	}
	
	
	
}
