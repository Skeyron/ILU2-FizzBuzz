package fizzBuzz;

public class FizzBuzz {
	
	
	private int[] nbSpeciales = {3, 5};
	private String[] valSpeciales = {"fizz", "buzz"};
	
	public String fizzBuzz(int entree) {
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < nbSpeciales.length; i++) {
			if (entree % nbSpeciales[i] == 0){
				res.append(valSpeciales[i]);
			}
		}
		if (res.length() == 0){
			return Integer.toString(entree);
		}
		return res.toString();
	}
	
}