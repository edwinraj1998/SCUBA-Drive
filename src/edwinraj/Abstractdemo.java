package edwinraj;

public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
abstract class Aphone{
	 
	public void call() {
		System.out.println("calling..");
	}
	public abstract void music();
	public abstract void camera();
	public abstract void storage();
}

abstract class Bphone extends Aphone{
	
	public void music() {
		System.out.println("Music..");
	}
	
	class Cphone extends Bphone{
		
			
			public void camera() {
				System.out.println("Camera..");
			}
				// TODO Auto-generated method stub
				
			}
			public void storage() {
				System.out.println("Storage..");
				
				// TODO Auto-generated method stub
				
			}	
			
	}
	}	
