package ar.edu.unlp.oo2.p2_ej1;

public class Agua extends Topografia {
	@Override
	public double getProportion() {
		return 1;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (other == null)
        {
            return false;
        }
	  
		if (other == this)
		{
			return true;
		}
	  
	 
 	  if (other instanceof Topografia == false) {
		  return false;
	  }
 	  
 	  Topografia t = (Topografia)other;
 	  if (this.getProportion() != t.getProportion()) {
 		  return false;
 	  }
 	  
 	  return true;
	}
}
