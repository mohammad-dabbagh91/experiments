import java.util.HashSet;

public class secondClass extends code_snippets{
	
	public void hash_set() {
		
		System.out.println("Hello, it's hash_set method");
		
		HashSet<String> cars = new HashSet<String>();
		
		
		cars.add("Mazda");
		cars.add("Mitsubishi");
		cars.add("Toyota");
		cars.add("Lexus");
		cars.add("Honda");
		cars.add("Lexus");
		
		System.out.println(cars.size());
		System.out.println(cars);
		
		for(String obj : cars) {
			
			if(obj.equalsIgnoreCase("Mazda") || obj.equalsIgnoreCase("Lexus")) {
				System.out.println(obj.toString().toUpperCase());
				
				
			}
			
			
			
		}
		
		
		
	}

}
