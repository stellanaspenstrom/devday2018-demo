package saspenst;

public class Main {

	public static void main(String[] args) {
		
		Concatenator concatenator = new Concatenator();
		
		String firstString = "First";
		String secondString = "Second";
		
		String output = concatenator.concatenateStrings(firstString, secondString);
		
		System.out.println(output);

	}

}
