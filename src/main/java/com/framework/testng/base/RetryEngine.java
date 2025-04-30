package com.framework.testng.base;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryEngine implements IRetryAnalyzer ,IAnnotationTransformer {
	 
    private int count = 0;
    private static int maxTry = 3;
 
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                     
            if (count < maxTry) {                            
                count++;                                     
                iTestResult.setStatus(ITestResult.FAILURE);  
                return true;                                
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);  
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);      
        }
        return false;
    }
 
	public void transform(ITestNGMethod method, Class testClass, ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(RetryEngine.class);
	
	}
    
}
