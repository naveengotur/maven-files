package day18_readingConfigFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

import org.testng.annotations.Test;

public class ReadConfig2 {

	@Test

	public void readconfig() throws Exception, IOException {

		Properties pro = new Properties();
		pro.load(new FileInputStream(new File(System.getProperty("user.dir") + "/Config/Config.properties")));
		System.out.println(pro.getProperty("browser"));

	}
}
