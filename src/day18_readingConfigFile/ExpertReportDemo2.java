package day18_readingConfigFile;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExpertReportDemo2 
{

@Test
	
	public void test1() {
		ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/AutomationReport.html");
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Sprint2 Report");
		reporter.config().setTheme(Theme.DARK);
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		
		ExtentTest test1 = report.createTest("login");
		test1.pass("User Logged in");
		
		ExtentTest test2 = report.createTest("CreateAccount");
		test2.info("User is on account page");
		test2.fail("User is not able to Create account",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\ADMIN\\Downloads\\sampleFile (1).jpeg").build());
		
		ExtentTest test3 = report.createTest("logout");
		test3.pass("User is able to Log-off ");
		report.flush();
		
}

}
