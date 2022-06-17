package b_family;

import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class BB extends TestBase{

	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataBFamily")
	public void testBB(String user, String subject) throws Exception {
		log( "Starting BB");
		Thread.sleep(1000);
		log("Ending BB");
		log(user + " ---- " + subject);
	}
}
