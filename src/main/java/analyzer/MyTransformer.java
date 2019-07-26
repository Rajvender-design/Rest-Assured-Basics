package analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer  implements IAnnotationTransformer{
	
	public void transform (ITestAnnotation annotation,  Class testclass , Constructor testConstructor, Method testmethod ) {
		
		annotation.setRetryAnalyzer(Retryanalyzer.class);
	}

}
