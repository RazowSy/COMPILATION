package sprint3;

import org.xtext.example.mydsl.MyDslStandaloneSetup;

import sprint2.GeneratorTableSym;

import com.google.inject.Injector;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = new MyDslStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		GeneratorTableSym main = injector.getInstance(GeneratorTableSym.class);
		String fichier=args[0];
		main.createSymTable(fichier);
		fichier=fichier.split("\\.")[0];
		traduction3a.code = main;
		traduction3a.translate(fichier) ;
		System.out.println("Fichier python genere, pour l'executer entrez : python "+fichier+".py" + " vos paramètres");
		
	}

}
