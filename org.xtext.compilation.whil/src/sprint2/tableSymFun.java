

package sprint2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
	

public class tableSymFun {
	static  int incr_id=0;

	private int nb_entrees, nb_sorties;
	HashMap<String, String> valeurs;
	String name_function;
	String id_function;
	List<ThreeAddr> code;
	
	
	
	
	public tableSymFun(String name) {
		valeurs = new HashMap<String,String>();
		nb_entrees=0;
		nb_sorties=0;
		code=new LinkedList<ThreeAddr>();
		name_function=name;
		id_function=Integer.toString(incr_id);
		incr_id++;
	
	}

	public void putVar(String var, String val) {
		
			valeurs.put(var, val);
		
	}

	public HashMap<String, String> getValeurs() {
		return valeurs;
	}
	public void addThreeAddr (ThreeAddr ta){
		code.add(ta);
	}
	public List<ThreeAddr> getCode(){
		return code;
	}
	
	public int getIn() {
		return nb_entrees;
	}
	
	public String getnamefunction() {
		return name_function;
	}


	public void setIn(int in) {
		this.nb_entrees = in;
	}


	public int getOut() {
		return nb_sorties;
	}


	public void setOut(int out) {
		this.nb_sorties = out;
	}
	
	public void setCode(List<ThreeAddr> lt) {
		code=lt;
	}

	public String toString() {
			return  id_function +"| NbInput = "+nb_entrees+"| NbOutput = "+nb_sorties+" | Vars : "+valeurs.toString() +"\n"+ code+ "\n\n";
			
		 	}

	public String getId(){
		return id_function;
	}
	public String getValeur (String variable) {
		return valeurs.get(variable);
	}

	public String getVariable (String valeur) {
		for (String o : valeurs.keySet()) {
		      if (valeurs.get(o).equals(valeur)) {
		        return o;
		      }
		    }
		    return null;
		  }





	
}