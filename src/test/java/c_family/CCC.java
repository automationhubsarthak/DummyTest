package c_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class CCC extends TestBase {
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataCFamily")
	public void testCCC(String user, String subject) throws Exception {
		log( "Starting CCC");
		Thread.sleep(1000);
		log("Ending CCC");
		log(user + " ---- " + subject);
	}
}
