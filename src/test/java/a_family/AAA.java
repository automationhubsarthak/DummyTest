package a_family;

import org.testng.Assert;
import org.testng.annotations.Test;
import dataprovider_repository.RepoData;
import testbase.TestBase;

public class AAA extends TestBase{
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataAFamily")
	public void testAAA(String user, String subject) throws Exception {
		log( "Starting AAA");
		SoftAssert.assertEquals("Title1", "Title");
		SoftAssert.assertEquals("Text", "Text1");
		Thread.sleep(1000);
		log("Ending AAA");
		log(user + " ---- " + subject);
		//Assert.fail("Showing listener example"); //this is hard assertion
		SoftAssert.assertAll();
		
	}

}
