package studio7;

public class Die {
public int sideAmt; 

public Die(int sideAmt) { 
	this.sideAmt = sideAmt; 
}

public int dieRoll ()
{ 
	return (int) (Math.random()*sideAmt); 
}
}
