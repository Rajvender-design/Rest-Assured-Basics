package mytest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytests {
	
@Test
//@Test(retryAnalyzer = analyzer.Retryanalyzer.class)
	
	public void Test1() {
	
		
		AssertJUnit.assertEquals(false, false);
		
	}
@Test
	public void Test2() {
		AssertJUnit.assertEquals(true, true);
	}

}
