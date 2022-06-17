package dataprovider_repository;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class RepoData {
	//is it advisable to create a @DataProvider for each Test Suite
	
	@DataProvider
	public static Object[][] getDataAFamily(Method name){
		System.out.println("Test Case which has this method is: " + name.getName());
		Object[][] data = null;
		if(name.getName().toUpperCase().equals("TESTA")) {
		data = new Object[2][2];
		
		     data[0][0] = "User1";
		     data[0][1] = "Mathematics";
		     data[1][0] = "User2";
		     data[1][1] = "Sceince";
		}else if(name.getName().toUpperCase().equals("TESTAA")) {
			data = new Object[2][2];
			data[0][0] = "User3";
			data[0][1] = "Biology";
			data[1][0] = "User4";
			data[1][1] = "History";
		} else if(name.getName().toUpperCase().equals("TESTAAA")) {
			data = new Object[2][2];
			data[0][0] = "User5";
			data[0][1] = "Civics";
			data[1][0] = "User6";
			data[1][1] = "Economics";
		}
		return data;
	}
	
	

	@DataProvider
	public static Object[][] getDataBFamily(Method name){
		System.out.println("Test Case which has this method is: " + name.getName());
		Object[][] data = null;
		if(name.getName().toUpperCase().equals("TESTB")) {
		data = new Object[2][2];
		
		     data[0][0] = "User7";
		     data[0][1] = "Java";
		     data[1][0] = "User8";
		     data[1][1] = "Python";
		}else if(name.getName().toUpperCase().equals("TESTBB")) {
			data = new Object[2][2];
			data[0][0] = "User9";
			data[0][1] = "Chemistry";
			data[1][0] = "User10";
			data[1][1] = "PHP";
		} else if(name.getName().toUpperCase().equals("TESTBBB")) {
			data = new Object[2][2];
			data[0][0] = "User11";
			data[0][1] = "Civics-1";
			data[1][0] = "User12";
			data[1][1] = "Economics-1";
		}
		return data;
	}
	
	@DataProvider
	public static Object[][] getDataCFamily(Method name){
		System.out.println("Test Case which has this method is: " + name.getName());
		Object[][] data = null;
		if(name.getName().toUpperCase().equals("TESTC")) {
		data = new Object[2][2];
		
		     data[0][0] = "User13";
		     data[0][1] = "Javascript";
		     data[1][0] = "User14";
		     data[1][1] = "Selenium";
		}else if(name.getName().toUpperCase().equals("TESTCC")) {
			data = new Object[2][2];
			data[0][0] = "User15";
			data[0][1] = "Chemistry-2";
			data[1][0] = "User16";
			data[1][1] = "C++";
		} else if(name.getName().toUpperCase().equals("TESTCCC")) {
			data = new Object[2][2];
			data[0][0] = "User17";
			data[0][1] = "Civics-3";
			data[1][0] = "User18";
			data[1][1] = "Economics-3";
		}
		return data;
	}

}
