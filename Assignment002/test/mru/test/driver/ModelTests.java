package mru.test.driver;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import mru.tsc.controller.FileManager;
import mru.tsc.model.Animal;
import mru.tsc.model.BoardGame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.model.Toy;

class ModelTests {


	
	@Test
	void testToyArrayList() {

		
		ArrayList<Toy> toys = new ArrayList<>();
		
		Animal a = new Animal(2111111111, "Dog", "BrandPet", 55.9, 12, "+7", "Plastic", "L");
		
		//Java checks if serialNum fits an int. Max is 2147483647. It fails before assigning it as a long. It needs L
		BoardGame b = new BoardGame(7234567890L, "Checkers", "Hasbro" , 69.69, 123, "+14", 2, 4, new String[] {"John, Salmon, Nike"});
		Figure f = new Figure(5712345723L, "Batman", "DC Toys", 67.67, 76, "+15", "Action");
		Puzzle p = new Puzzle(5567851239L, "Chess", "Hello", 15.99, 122, "+1", "Large");
	
		
		toys.add(a);
		toys.add(b);
		toys.add(f);
		toys.add(p);
		
		
		
		for (Toy toy : toys) {
            assertNotNull(toy.getName());
            assertTrue(toy.getPrice() > 0);
            System.out.println(toy.toString());
        }
		
		

		
	}
	
	@Test
	void testToyTypeAssignment() throws IOException {
		
		FileManager fm = new FileManager();
		ArrayList<Toy> toys = fm.readToyList();
		
		//Expected value, actual
		assertEquals(225, toys.size());
		
		assertTrue(toys.get(2) instanceof Animal);
		assertTrue(toys.get(3) instanceof Puzzle);
		assertTrue(toys.get(24) instanceof Figure);
		assertTrue(toys.get(9) instanceof BoardGame);
		
		
		
		
		
	}

}
