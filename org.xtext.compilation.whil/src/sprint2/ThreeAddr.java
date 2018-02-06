package sprint2;

import java.util.LinkedList;
import java.util.List;

public class ThreeAddr {
	
	String rWrite;
	String rRead1;
	String rRead2;
	Operator op;
	Pair p;
	List<ThreeAddr> l;

	public ThreeAddr (Operator o, String wr, String rd1, String rd2){
		op=o;
		rWrite=wr;
		rRead1=rd1;
		rRead2=rd2;
	}

	public ThreeAddr (Operator o, String wr, String rd1, Pair paire) {
		op=o;
		rWrite=wr;
		rRead1=rd1;
		p=paire;
	}

	public ThreeAddr (Operator o, String wr, String rd1, List<ThreeAddr> lAddr) {
		op=o;
		rWrite=wr;
		rRead1=rd1;
		l = lAddr;
	}


	public String getrWrite() {
		return rWrite;
	}

	public void setrWrite(String rWrite) {
		this.rWrite = rWrite;
	}

	public String getrRead1() {
		return rRead1;
	}

	public void setrRead1(String rRead1) {
		this.rRead1 = rRead1;
	}

	public String getrRead2() {
		return rRead2;
	}

	public void setrRead2(String rRead2) {
		this.rRead2 = rRead2;
	}

	public Operator getOp() {
		return op;
	}

	public void setOp(Operator op) {
		this.op = op;
	}

	public String toString (){
		if(p!=null) {
			return "<" + op + "," + rWrite + "," + rRead1 + ", [" + p.getlTrue() +" ; " + p.getlFalse()+ "]>";
		}
		else if (l!=null){
			return "<" + op + "," + rWrite + "," + rRead1 + "," + l.toString() + ">" ;
		}
		else {
			return "<" + op + "," + rWrite + "," + rRead1 + "," + rRead2 + ">" ;
		}
	}

	public void setP(Pair paire) {
		p=paire;
	}
	
	public List<ThreeAddr> getIf () {
		return p.getlTrue();
	}
	
	public List<ThreeAddr> getElse () {
		return p.getlFalse();
	}
	
	public List<ThreeAddr> getList () {
		return l;
	}
	
	
}
