package studio7;

public class Rectangle {
	public int width;
	public int length;
	
	// consrctr
	public Rectangle(int width, int length) {
		this.width=width;
		this.length=length;
		
	}
	
	//class mthds
	public int area () {
		return this.width*this.length; 
	}

}
