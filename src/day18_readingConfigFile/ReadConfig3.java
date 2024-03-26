package day18_readingConfigFile;

import org.testng.annotations.Test;

import Utility.configUtility;

public class ReadConfig3 {
	@Test
	public void readconfig()
	{
		System.out.println(configUtility.getvalue("browser"));
		
		System.out.println(configUtility.getvalue("url"));
	}

}
