import java.util.Iterator;




import java.util.ArrayList;

public class fourthClass {
	
	public void iterator_mthd() {
		
		System.out.println("Hello, it's iterator method");
		
		// Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Mazda");
	    cars.add("Mitsubishi");
	    cars.add("Toyota");
	    cars.add("Lexus");
	    cars.add("Honda");
	    cars.add("Lexus");
	    
	    System.out.println(cars);
	    
	    Iterator<String> it = cars.iterator();
	    //System.out.println(it.next());
	    //System.out.println(it.hasNext());
	    
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    	}
	}

}
