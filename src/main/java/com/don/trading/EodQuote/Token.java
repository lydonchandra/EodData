package com.don.trading.EodQuote;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eoddata.ws.data.Data;
import com.eoddata.ws.data.DataSoap;
import com.eoddata.ws.data.LOGINRESPONSE2;

public class Token {
	private static final Logger LOGGER = LoggerFactory.getLogger(Token.class);
	
	public Token() {
		BasicConfigurator.configure();
	}
	
	public String getToken(Data data, String username, String password ) {
		
		String token = "";
		
		DataSoap dataSoap = data.getDataSoap();
		
		LOGINRESPONSE2 loginResponse = dataSoap.login(username, password);
		
		if( loginResponse != null ) {
			
			LOGGER.debug("Got response");
			
			if( loginResponse.getMessage().toLowerCase().indexOf("success") > -1 ) {
				token = loginResponse.getToken();
				LOGGER.debug("Got token={}", token);
			}
		}
		
		return token;

	}
}
