import java.util.HashMap;

public class thirdClass extends code_snippets{
	
	public void hash_map() {
		
		System.out.println("Hello, it's hash_map method");
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("Japan", "Tokyo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("Jordan", "Amman");
	    
	    capitalCities.putIfAbsent("Japan", "Tokyo");
	    
	    System.out.println("Size is: "+capitalCities.size());
	    System.out.println(capitalCities.toString());
	    
	   for(String objects : capitalCities.keySet()) {
		   //System.out.println(objects+" --> "+capitalCities.get(objects));
		   if(objects.equalsIgnoreCase("japan")) {
			   System.out.println(capitalCities.get(objects));
			   break;
			   
		   }
		   
	   }
	   
	   
	    
		
	}
	
	

}
