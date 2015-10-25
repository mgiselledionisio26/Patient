public class Test {
	public static void main (String[] args) {
		// Patient p1 = new Patient("Mark", "Razon", 19, "San Simon");
		// Patient p2 = new Patient("Christian", "Contillo", 18, "Cavite");
		// Patient p3 = new Patient("Benjamin", "Longakit", 17, "Bulacan");
		 
		
		BubbleSort bs = new BubbleSort(3); 

		bs.insert(0, "Mark", "Razon", 19, "San Simon");
		bs.insert(1, "Christian", "Contillo", 18, "Cavite");
		bs.insert(2, "Benjamin", "Longakit", 17, "Bulacan");


		bs.display();

		System.out.println("\n\n");

		bs.sort();
		bs.display();
	}

} 