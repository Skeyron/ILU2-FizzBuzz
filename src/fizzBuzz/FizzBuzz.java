package fizzBuzz;

public class FizzBuzz {
	
	
	private int[] nbSpeciales = {3, 5};
	private String[] valSpeciales = {"fizz", "buzz"};
	
	public String fizzBuzz(int entree) {
		for (int i = 0; i < nbSpeciales.length; i++) {
			if (entree % nbSpeciales[i] == 0){
				return valSpeciales[i];
			}
		}
		
		return Integer.toString(entree);
	}
	
}
