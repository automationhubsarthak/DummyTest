package a_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class AA extends TestBase{
	

	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataAFamily")
	public void testAA(String user, String subject) throws Exception {
		log( "Starting AA");
		Thread.sleep(1000);
		log("Ending AA");
		log(user + " ---- " + subject);
	}

}
