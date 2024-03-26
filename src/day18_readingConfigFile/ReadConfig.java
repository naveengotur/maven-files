package day18_readingConfigFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig
{

	@Test
	public void readConfig() throws IOException
	{
		File src = new File(System.getProperty("user.dir)"+"/Config/Config.properties"));
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("host"));
	
	}
}
