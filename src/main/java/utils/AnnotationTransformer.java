package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testconstructor,Method testmethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
