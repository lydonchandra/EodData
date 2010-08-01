package com.don.trading.EodQuote;

import java.io.IOException;
import java.util.Properties;

import junit.framework.TestCase;

import org.junit.Test;

import com.eoddata.ws.data.Data;
import com.eoddata.ws.data.DataSoap;
import com.eoddata.ws.data.RESPONSE;

public class QuoteTest extends TestCase {
	
	@Test
	public void testGetToken() throws IOException {
		
		assertTrue(getToken().length() > 1);
		
	}
	
	private String getToken() throws IOException {
		
		Quote quote = new Quote();
		
		Data data = new Data();
		Properties prop = EodConfig.getProperties("credentials.properties");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		String token = quote.getToken(username, password, data);
		return token;
		
	}
	
	@Test
	public void testGetQuotes() throws IOException {
		
		Data data = new Data();
		
		DataSoap dataSoap = data.getDataSoap();
		String exchange = "NASDAQ";
		String quoteDate = "20100726";
		String period = "h";
		RESPONSE quoteResponse = dataSoap.quoteListByDatePeriod( getToken(), exchange, quoteDate, period);
		
		quoteResponse = quoteResponse;
		
	}
}
