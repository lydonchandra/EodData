package com.don.trading.EodQuote;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eoddata.ws.data.ArrayOfEXCHANGE;
import com.eoddata.ws.data.ArrayOfQUOTE;
import com.eoddata.ws.data.Data;
import com.eoddata.ws.data.DataSoap;
import com.eoddata.ws.data.EXCHANGE;
import com.eoddata.ws.data.QUOTE;
import com.eoddata.ws.data.RESPONSE;

public class Quote {
	private static final Logger LOGGER = LoggerFactory.getLogger(Quote.class);
	
	public List<QUOTE> getQuotes(String exchange, String symbol, String quoteDate) throws IOException {
		Properties prop = EodConfig.getProperties("credentials.properties");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		Data data = new Data();
		DataSoap dataSoap = data.getDataSoap();
		String token = getToken(username, password, data);
		
		if( token.length() > 0 ) {
			
//			RESPONSE quoteResponse = dataSoap.quoteListByDate(token, exchange, quoteDate);
//			ArrayOfQUOTE aQuotes = quoteResponse.getQUOTES();
//			List<QUOTE> quotes = aQuotes.getQUOTE();
//			for( QUOTE quote: quotes ) {
//				LOGGER.debug("{}, {}, {}, {}, {}, {}, {}", new Object[] {  quote.getName(), quote.getSymbol(), quote.getOpen(), quote.getHigh(), quote.getLow(), quote.getClose(), quote.getVolume() } );
//			}
			
			RESPONSE quoteResponse = dataSoap.quoteListByDatePeriod(token, exchange, quoteDate, "");
//			response = response;

			
		}
		
		return null;
	}
	
	public String getToken(String username, String password, Data data) {
		
		String token = "";
		
		Token tokenObj = new Token();
		token = tokenObj.getToken(data, username, password);
		
		return token;
	}
	
	public static void main(String [] args) throws FileNotFoundException, IOException {
		
		BasicConfigurator.configure();
		
		Properties props = new Properties();
		
		InputStream in = Quote.class.getClassLoader().getResourceAsStream("credentials.properties");
		if(in == null) {
			LOGGER.error("Cannot find file");
			return;
		}
		props.load(in);
		
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		
		LOGGER.debug("username={}", username);
		
		Data data = new Data();
				
		String token = null;
		
		DataSoap dataSoap = data.getDataSoap();
		
//		if( loginResponse != null ) {
//			
//			LOGGER.debug("Got response");
//			
//			if( loginResponse.getMessage().toLowerCase().indexOf("success") > -1 ) {
//				token = loginResponse.getToken();
//				LOGGER.debug("Got token={}", token);
//			}
//		}
		
		Token tokenObj = new Token();
		token = tokenObj.getToken(data, username, password);
		
		String exchange = "NASDAQ";
		String symbol = "QQQQ";
		String quoteDate = "20100723";
		if( token != null && token.length() > 0) {

			RESPONSE response = dataSoap.exchangeList(token);
			ArrayOfEXCHANGE aExchanges = response.getEXCHANGES();
			List<EXCHANGE> exchanges = aExchanges.getEXCHANGE();
			
			for( EXCHANGE exch: exchanges ) {
				LOGGER.debug( "{}, {}", exch.getCode(), exch.getName());
			}
			
//			RESPONSE quoteResponse = dataSoap.quoteListByDate(token, exchange, quoteDate);
//			ArrayOfQUOTE aQuotes = quoteResponse.getQUOTES();
//			List<QUOTE> quotes = aQuotes.getQUOTE();
//			for( QUOTE quote: quotes ) {
//				LOGGER.debug("{}, {}, {}, {}, {}, {}, {}", new Object[] {  quote.getName(), quote.getSymbol(), quote.getOpen(), quote.getHigh(), quote.getLow(), quote.getClose(), quote.getVolume() } );
//			}
			
//			RESPONSE quoteResponse = dataSoap.quoteListByDatePeriod(token, exchange, quoteDate, "30");
//			response = response;
			
		}
		
	}

}