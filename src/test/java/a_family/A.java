package a_family;


import org.testng.annotations.Test;

import dataprovider_repository.RepoData;
import testbase.TestBase;

public class A extends TestBase{
	
	
	@Test(dataProviderClass = RepoData.class, dataProvider = "getDataAFamily")
	public void testA(String user, String subject) throws Exception {
		
		log( "Starting A");
		Thread.sleep(1000);
		log("Ending A");
		log(user + " ---- " + subject);
	}
	
	

}
