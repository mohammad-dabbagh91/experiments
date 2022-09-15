
public class code_snippets extends Thread{
	
	public code_snippets() {
		this.adelSong = "Someone Like You";
	}
	
	  String adelSong ;
	
	  public static int amount = 0;
	  
	public static void main(String[] args) {
		
		// Threading ///////
		code_snippets thread = new code_snippets();
		thread.start();
		
		
		// Wait for the thread to finish
	    while(thread.isAlive()) {
	    System.out.println("Waiting...");
	  }
	  // Update amount and print its value
	  System.out.println("Main: " + amount);
	  amount++;
	  System.out.println("Main: " + amount);
	  
	  ////////////////// Threading ends here //////////////////
		
		
		// Polymorphism - Overriding goes here ///////
		
		/*
		genres music = new genres();
		music.play("");
		
		trance m = new trance();
		m.play("");
		
		
		genres p = new trance();
		p.play("");
		
		p = new house();
		p.play("");
		
		p = new trance();
		p.play("");*/
		
		
		
		////////////////// Polymorphism - Overriding ends here //////////////
		
		
		
		
		
		
		
		///////////////////////
		/*
		thirdClass map = new thirdClass();
		map.hash_map();
		
		
		secondClass set = new secondClass();
		set.hash_set();
		
		fourthClass it = new fourthClass();
		it.iterator_mthd();*/
		
		
		
		/////// First method below
		/*
		code_snippets adel_new_song = new code_snippets();
		
		code_snippets adel_old_default_song = new code_snippets();
		
		code_snippets adel_new_song_constructor = new code_snippets();
		
		adel_new_song.adelSong = "easy on me";
		adel_old_default_song.adelSong = "hello";
		
		
		System.out.println(adel_new_song.adel_songs());
		
		System.out.println(adel_old_default_song.adel_songs());

		System.out.println(adel_new_song_constructor.adel_songs());
		*/
		

		/////// Second method below
		/*int result = sum(10 , 7);        // r = 8+7+6+5+4+3+2+1
		
		System.out.println(result);*/
		
	}
	
	// Run thread goes here
	public void run() {
		
		   amount++;
		   System.out.println("Run: " + amount);
	}
	
	
	
	/*
	public  String adel_songs() {
		
		return adelSong;
	}*/
	
	
	/*public static int sum(int k, int end) {   // 4 3 2 1 0
		
		if(k > end) {
			return k + sum(k - 1, end);  // 4 3 2 1 
		} else {
			return 0;
		}
		
	}*/

	
	
}
