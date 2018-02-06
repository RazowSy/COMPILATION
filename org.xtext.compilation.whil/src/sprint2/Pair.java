package sprint2;

import java.util.LinkedList;
import java.util.List;

public class Pair {
	private List<ThreeAddr> lTrue;
	private List<ThreeAddr> lFalse;
	
	public Pair() {
		lTrue = new LinkedList<ThreeAddr>();
		lFalse = new LinkedList<ThreeAddr>();
		
	}
	
	public Pair(List<ThreeAddr> lTrue, List<ThreeAddr> lFalse) {
		this.lTrue=lTrue;
		this.lFalse=lFalse;
	}

	public List<ThreeAddr> getlTrue() {
		return lTrue;
	}

	public void setlTrue(List<ThreeAddr> lTrue) {
		this.lTrue = lTrue;
	}

	public List<ThreeAddr> getlFalse() {
		return lFalse;
	}

	public void setlFalse(List<ThreeAddr> lFalse) {
		this.lFalse = lFalse;
	}
	
	
}
