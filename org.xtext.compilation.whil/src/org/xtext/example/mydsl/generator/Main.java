package org.xtext.example.mydsl.generator;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {

	public static void main(String[] args)  {
		Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		if (args.length ==7 ) main.runGenerator(args[0],args[1],Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]), Integer.parseInt(args[6]));
		else if (args.length ==6)main.runGenerator(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]), Integer.parseInt(args[5]));
		else System.out.println("Erreur dans le nombre de paramètres");
}
	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private MyDslGenerator generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;
	
	protected void runGenerator(String entree, String sortie, int all, int si, int pour, int pourEach, int tq){
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(entree), true);
		
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.out.println("erreur" + issue);
			}
			return;
}
		fileAccess.setOutputPath("./");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
        generator.doGenerate(resource,fileAccess,context, sortie, all, si, pour, pourEach, tq);
        System.out.println("Pretty printing terminé");
	}
	
	protected void runGenerator(String entree, int all, int si, int pour, int pourEach, int tq){
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(entree), true);
		
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.out.println(issue);
			}
			return;
}
		fileAccess.setOutputPath("./");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
        generator.doGenerate(resource,fileAccess,context, all, si, pour, pourEach, tq);
        System.out.println("Pretty printing terminé");
	}
}
