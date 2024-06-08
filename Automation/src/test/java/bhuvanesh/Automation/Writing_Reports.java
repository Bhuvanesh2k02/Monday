package bhuvanesh.Automation;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
/*
 * Extent AventReport Classes:
 * ExtentHtmlReporter --> report location
 * ExtentReports --> it use to create a Test in each & every Method
 *ExtentTest */


public class Writing_Reports {

	public static ExtentHtmlReporter reporter;
	public static ExtentReports report;
	public static ExtentTest test;
	
	String ReportFile =System.getProperty("user.dir")+"\\Report\\TestCase.html"; 
	
	public void CreationOf_ExtentReport_FrameWork() {
		
		reporter = new ExtentHtmlReporter(ReportFile);
		report=new ExtentReports();
		report.attachReporter(reporter);
		
		reporter.config().setChartVisibilityOnOpen(true);
		reporter.config().setDocumentTitle("My Frist Report");
		reporter.config().setReportName("Fita Project");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setTestViewChartLocation(ChartLocation.TOP);
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm:ss a '('zzz')'");
		
	}

}
	

