package test.java.automationframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GenericProps {
	static Properties prop;
	public static void init(){
		if (prop != null) return;
		prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("build.properties");
			prop.load(input);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String getProperty(String key){
		init();
		return prop.getProperty(key);
	}
}
