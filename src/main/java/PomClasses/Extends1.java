package PomClasses;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Extends1 
{

	public static void main(String[] args) 
	{
	
		ExtentHtmlReporter htmlreport= new ExtentHtmlReporter("E:\\SELENIUM FRAMEWORK\\Extent Report\\ScreenShot\\first.html");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(htmlreport);
		
		ExtentTest test = extent.createTest("Chrome test","Web base application testing");
		
		
		test.log(Status.INFO,"opening chrome " );
		test.log(Status.INFO, "test case execution is started");
		test.log(Status.INFO, "Test case is pass");
		
		//Assert
		test.log(Status.PASS, "Test case 001 is pass");   

		test.log(Status.FAIL, "Test case 002 is fail");
		
		test.log(Status.SKIP, "Test case 003 is skip");
		
		test.log(Status.WARNING, "Test case 004 is running too slow");
		
		
		
		ExtentTest test1 = extent.createTest("Fire fox test");
		
		test1.log(Status.INFO,"opening chrome " );
		test1.log(Status.INFO, "test case execution is started");
		test1.log(Status.INFO, "Test case is pass");
		
		//Assert
		test1.log(Status.PASS, "Test case 001 is pass");

		test1.log(Status.FAIL, "Test case 002 is fail");
		
		test1.log(Status.SKIP, "Test case 003 is skip");
		
		test1.log(Status.WARNING, "Test case 004 is running too slow");
		
		
		extent.flush();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
