package org.xtext.compilation.whil;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.xtext.example.mydsl.generator.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result; 
public class PrettyPrinterTest {
	
	
	public static void main(String args[]) {
		  JUnitCore junit = new JUnitCore();
		  junit.addListener(new TextListener(System.out));
		  Result result = junit.run(PrettyPrinterTest.class);
		  if (result.getFailureCount() > 0) {
		    System.out.println("Test failed.");
		    System.exit(1);
		  } else {
		    System.out.println("Test finished successfully.");
		    System.exit(0);
		  }
		} 
	

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private static final String nonPP =  "testPP/nonPP/";
	private static final String attendu =   "testPP/attendu/";
    private static final String resultPP = "testPP/resultPP/";
    
    public void testPP (String nameFile, boolean vrai) throws IOException {
    	String pathFileNonPP = nonPP +nameFile +".wh";
    	String pathFileAttendu = attendu +nameFile +".whpp";
    	String pathFileResultPP = resultPP +nameFile +".whpp";
    	
    	String [] argv = {pathFileNonPP,pathFileResultPP};
    	Main.main(argv);
    	File fileResult = new File(pathFileResultPP);
    	File fileAttendu = new File(pathFileAttendu);
    	boolean result;
    	if( vrai) result=sameFile(fileResult.toPath(), fileAttendu.toPath());
    	else result = !sameFile(fileResult.toPath(), fileAttendu.toPath());
    	assertTrue("Les fichiers "+ pathFileNonPP +"et"+ fileResult.getPath() +" sont differents !", 
    			result);
    	
    }
    boolean sameFile(Path file1, Path file2) throws IOException {
        long size = Files.size(file1);
        if (size != Files.size(file2))
            return false;

        if (size < 4096)
            return Arrays.equals(Files.readAllBytes(file1), Files.readAllBytes(file2));

        try (InputStream is1 = Files.newInputStream(file1);
             InputStream is2 = Files.newInputStream(file2)) {      
            int data;
            while ((data = is1.read()) != -1)
                if (data != is2.read())
                    return false;
        }

        return true;
    }
    @Test
   	public void testAffect1() throws IOException {
   		testPP("if", true);
   }
       @Test
   	public void testAffect2() throws IOException {
   		testPP("whileif",true);
   }    @Test
   	public void testAffect3() throws IOException {
   	testPP("foreach",true);
   }    @Test
   	public void testAffect4() throws IOException {
   	testPP("for",true);
   }    @Test
   	public void testAffect5() throws IOException {
   	testPP("wrongfor",false);
   }   @Test
   	public void testAffect6() throws IOException {
   	testPP("wrongwhileif",false);
   }
   	@Test
   	public void testAffect7() throws IOException {
   	testPP("wrongforeach",false);  
   	}
}
