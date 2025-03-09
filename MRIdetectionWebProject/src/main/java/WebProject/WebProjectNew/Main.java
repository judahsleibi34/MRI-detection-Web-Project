package WebProject.WebProjectNew;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Main {

	private BeforeClassMRIDetection beforeclassmridetection;
	private MRIdetectionWeb mridetectionweb;
	private MRIDetectionVariables mridetectionvariables;


	@BeforeTest
	public void setUpTest() throws Exception {
 
		beforeclassmridetection = new BeforeClassMRIDetection(); 
		mridetectionweb = new MRIdetectionWeb();
		mridetectionvariables = new MRIDetectionVariables();
		beforeclassmridetection.Setup();

		if (mridetectionweb == null) {
			System.out.println("ERROR: frameone is NULL after initialization!");
		} else {
			System.out.println("DEBUG: frameone successfully initialized.");
		}
	}

	@Test(priority = 1)
	public void WebProject() throws Exception {
		if (mridetectionvariables.counter == 0) { 
			mridetectionweb = new MRIdetectionWeb(); 
			mridetectionweb.URLOpenning();
			mridetectionweb.FrameOneIntrodction();
			mridetectionweb.MenuClick();
			mridetectionweb.HowToDemo();
			mridetectionweb.AbutUs();
			mridetectionweb.Introduction();

		}

	}
}


