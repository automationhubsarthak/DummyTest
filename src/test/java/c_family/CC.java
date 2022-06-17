package c_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class CC extends TestBase{

	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataCFamily")
	public void testCC(String user, String subject) throws Exception {
		log( "Starting CC");
		Thread.sleep(1000);
		log("Ending CC");
		log(user + " ---- " + subject);
	}
}
