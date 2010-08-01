package com.don.trading.EodQuote;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eoddata.ws.data.Data;
import com.eoddata.ws.data.DataSoap;

public class EodConfig {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EodConfig.class);
	
	
	public static Properties getProperties(String filename) throws IOException {
		
						BasicConfigurator.configure();
		
		Properties props = new Properties();
		
		InputStream in = Quote.class.getClassLoader().getResourceAsStream(filename);
		if(in == null) {
			
			LOGGER.error("Cannot find file");
			return null;
		}
		props.load(in);
		return props;
		
//		return 
//		String username = props.getProperty("username");
//		String password = props.getProperty("password");
//		
//		LOGGER.debug("username={}", username);
//		
//		Data data = new Data();
//				
//		String token = null;
//		
//		DataSoap dataSoap = data.getDataSoap();
//		
//		Token tokenObj = new Token();
//		token = tokenObj.getToken(data, username, password);
	}
}
