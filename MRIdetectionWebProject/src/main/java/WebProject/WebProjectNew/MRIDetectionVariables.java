package WebProject.WebProjectNew;

public class MRIDetectionVariables {
	public int counter = 0;
	public static final String URL = "https://mridetection.netlify.app/?lang=en#Introduction";
	public static final String Navigation = "//a[@id = 'menunavi']";
	public static final String HowToDemo = "//a[@id = 'menu-demo']";
	public static final String GliomaList = "//div[@class='folder']/h3[@id='folder-Glioma']";
	public static final String GliomaImageOne = "//h3[@id='folder-Glioma']/following-sibling::div[@class='images']/img[@alt='Image 1']";
	public static final String GliomaImageTwo = "//h3[@id='folder-Glioma']/following-sibling::div[@class='images']/img[@alt='Image 2']";
	public static final String GliomaImageThree = "//h3[@id='folder-Glioma']/following-sibling::div[@class='images']/img[@alt='Image 3']";
	public static final String ClearButton = "//button[@id ='clear-button']";
	public static final String NoTumorList = "//h3[@id = 'folder-NoTumor']";
	
	public static final String NoTumorImageOne = "//h3[@id='folder-NoTumor']/following-sibling::div[@class='images']/img[@alt='Image 1']";
	public static final String NoTumorImageTwo= "//h3[@id='folder-NoTumor']/following-sibling::div[@class='images']/img[@alt='Image 2']";
	public static final String NoTumorImageThree = "//h3[@id='folder-NoTumor']/following-sibling::div[@class='images']/img[@alt='Image 3']";
	
	public static final String AboutUs = "//a[@id = 'menu-about']";
	public static final String Introduction ="//a[@id = 'menu-intro']";
	

}
