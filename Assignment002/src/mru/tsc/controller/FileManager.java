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

	
	
	final String TOY_FILE_PATH = "res/toys.txt";
	
	
	
	public ArrayList<Toy> readToyList() throws IOException{ // Temporary throws.
		
		ArrayList<Toy> toys = new ArrayList<>();
		
		FileReader file = new FileReader(TOY_FILE_PATH);
		BufferedReader input = new BufferedReader(file);

		String line;
		String[] currentToy;
		
		while( (line = input.readLine()) != null) {
			
			currentToy = line.trim().split(";");
			
			
			String serialNumber = currentToy[0];
			
			switch(serialNumber.charAt(0)) { // Checks First digit
			
			
			case '0','1':
				//SN, name, brand, price, available-count, age-appropriate,
				//classification
				Figure figure = new Figure(
						Integer.parseInt(currentToy[0]),
						currentToy[1],
						currentToy[2], 
						Double.parseDouble(currentToy[3]),
						Integer.parseInt(currentToy[4]), 
						currentToy[5], 
						currentToy[6]); 
				toys.add(figure);
				break;
			case '2','3':
				// SN, name, brand, price, available-count, age-appropriate,
				//material, size
				Animal animal = new Animal(
						Integer.parseInt(currentToy[0]), 
						currentToy[1],currentToy[2], 
						Double.parseDouble(currentToy[3]),
						Integer.parseInt(currentToy[4]), 
						currentToy[5], 
						currentToy[6], 
						currentToy[7]);
				toys.add(animal);
				break;
			case '4','5','6':
				// SN, name, brand, price, available-count, age-appropriate,
				//puzzle-type.
				Puzzle puzzle = new Puzzle(
						Integer.parseInt(currentToy[0]),
						currentToy[1],currentToy[2], 
						Double.parseDouble(currentToy[3]),
						Integer.parseInt(currentToy[4]), 
						currentToy[5], 
						currentToy[6]);
				toys.add(puzzle);
				break;
			case '7','8','9':
				//SN, name, brand, price, available-count, ageappropriate, # of players, designer(s).
				BoardGame boardGames = new BoardGame(
						Integer.parseInt(currentToy[0]),
						currentToy[1],
						currentToy[2], 
						Double.parseDouble(currentToy[3]),
						Integer.parseInt(currentToy[4]), 
						currentToy[5],
						Integer.parseInt(currentToy[6]), 
						currentToy[7]);
				toys.add(boardGames);
				break;
			
			
				
				
			}
			

			
		}
		
		
		input.close();
		
		
		return toys;

		
		
		
		
	}
	
	
	
}
