package b_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class BBB extends TestBase{
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataBFamily")
	public void testBBB(String user, String subject) throws Exception {
		log( "Starting BBB");
		Thread.sleep(1000);
		log("Ending BBB");
		log(user + " ---- " + subject);
	}
}
