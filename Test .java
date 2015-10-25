public class Test {
	public static void main (String[] args) {
		Patient p1 = new Patient("Mark", "Razon", 19, "San Simon");
		Patient p2 = new Patient("Christian", "Contillo", 18, "Cavite");
		Patient p3 = new Patient("Benjamin", "Longakit", 17, "Bulacan");
		 
		System.out.println("Fullname:" + p1.getFullname());
		System.out.println("Age: " + p1.getAge());
		System.out.println("Address:" +  p1.getAddress());
		
		System.out.println("Fullname:" + p2.getFullname());
		System.out.println("Age: " + p2.getAge());
		System.out.println("Address:" + p2.getAddress());
		
		System.out.println("Fullname:" + p3.getFullname());
		System.out.println("Age: " + p3.getAge());
		System.out.println("Address:" + p3.getAddress());	 
	}

}