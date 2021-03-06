
package com.eoddata.ws.data;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.9
 * Sat Jul 24 13:12:42 WST 2010
 * Generated source version: 2.2.9
 * 
 */

public final class DataHttpPost_DataHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.eoddata.com/Data", "Data");

    private DataHttpPost_DataHttpPost_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = Data.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Data ss = new Data(wsdlURL, SERVICE_NAME);
        DataHttpPost port = ss.getDataHttpPost();  
        
        {
        System.out.println("Invoking quoteGet...");
        java.lang.String _quoteGet_token = "";
        java.lang.String _quoteGet_exchange = "";
        java.lang.String _quoteGet_symbol = "";
        com.eoddata.ws.data.RESPONSE _quoteGet__return = port.quoteGet(_quoteGet_token, _quoteGet_exchange, _quoteGet_symbol);
        System.out.println("quoteGet.result=" + _quoteGet__return);


        }
        {
        System.out.println("Invoking splitListByExchange...");
        java.lang.String _splitListByExchange_token = "";
        java.lang.String _splitListByExchange_exchange = "";
        com.eoddata.ws.data.RESPONSE _splitListByExchange__return = port.splitListByExchange(_splitListByExchange_token, _splitListByExchange_exchange);
        System.out.println("splitListByExchange.result=" + _splitListByExchange__return);


        }
        {
        System.out.println("Invoking updateDataFormat...");
        java.lang.String _updateDataFormat_token = "";
        java.lang.String _updateDataFormat_dataFormat = "";
        java.lang.String _updateDataFormat_includeHeader = "";
        java.lang.String _updateDataFormat_includeSuffix = "";
        com.eoddata.ws.data.RESPONSE _updateDataFormat__return = port.updateDataFormat(_updateDataFormat_token, _updateDataFormat_dataFormat, _updateDataFormat_includeHeader, _updateDataFormat_includeSuffix);
        System.out.println("updateDataFormat.result=" + _updateDataFormat__return);


        }
        {
        System.out.println("Invoking top10Gains...");
        java.lang.String _top10Gains_token = "";
        java.lang.String _top10Gains_exchange = "";
        com.eoddata.ws.data.RESPONSE _top10Gains__return = port.top10Gains(_top10Gains_token, _top10Gains_exchange);
        System.out.println("top10Gains.result=" + _top10Gains__return);


        }
        {
        System.out.println("Invoking symbolGet...");
        java.lang.String _symbolGet_token = "";
        java.lang.String _symbolGet_exchange = "";
        java.lang.String _symbolGet_symbol = "";
        com.eoddata.ws.data.RESPONSE _symbolGet__return = port.symbolGet(_symbolGet_token, _symbolGet_exchange, _symbolGet_symbol);
        System.out.println("symbolGet.result=" + _symbolGet__return);


        }
        {
        System.out.println("Invoking exchangeGet...");
        java.lang.String _exchangeGet_token = "";
        java.lang.String _exchangeGet_exchange = "";
        com.eoddata.ws.data.RESPONSE _exchangeGet__return = port.exchangeGet(_exchangeGet_token, _exchangeGet_exchange);
        System.out.println("exchangeGet.result=" + _exchangeGet__return);


        }
        {
        System.out.println("Invoking quoteListByDate...");
        java.lang.String _quoteListByDate_token = "";
        java.lang.String _quoteListByDate_exchange = "";
        java.lang.String _quoteListByDate_quoteDate = "";
        com.eoddata.ws.data.RESPONSE _quoteListByDate__return = port.quoteListByDate(_quoteListByDate_token, _quoteListByDate_exchange, _quoteListByDate_quoteDate);
        System.out.println("quoteListByDate.result=" + _quoteListByDate__return);


        }
        {
        System.out.println("Invoking validateAccess...");
        java.lang.String _validateAccess_token = "";
        java.lang.String _validateAccess_exchange = "";
        java.lang.String _validateAccess_quoteDate = "";
        java.lang.String _validateAccess_period = "";
        com.eoddata.ws.data.RESPONSE _validateAccess__return = port.validateAccess(_validateAccess_token, _validateAccess_exchange, _validateAccess_quoteDate, _validateAccess_period);
        System.out.println("validateAccess.result=" + _validateAccess__return);


        }
        {
        System.out.println("Invoking symbolList...");
        java.lang.String _symbolList_token = "";
        java.lang.String _symbolList_exchange = "";
        com.eoddata.ws.data.RESPONSE _symbolList__return = port.symbolList(_symbolList_token, _symbolList_exchange);
        System.out.println("symbolList.result=" + _symbolList__return);


        }
        {
        System.out.println("Invoking dataClientLatestVersion...");
        java.lang.String _dataClientLatestVersion_token = "";
        com.eoddata.ws.data.RESPONSE _dataClientLatestVersion__return = port.dataClientLatestVersion(_dataClientLatestVersion_token);
        System.out.println("dataClientLatestVersion.result=" + _dataClientLatestVersion__return);


        }
        {
        System.out.println("Invoking quoteList2...");
        java.lang.String _quoteList2_token = "";
        java.lang.String _quoteList2_exchange = "";
        java.lang.String _quoteList2_symbols = "";
        com.eoddata.ws.data.RESPONSE _quoteList2__return = port.quoteList2(_quoteList2_token, _quoteList2_exchange, _quoteList2_symbols);
        System.out.println("quoteList2.result=" + _quoteList2__return);


        }
        {
        System.out.println("Invoking symbolChart...");
        java.lang.String _symbolChart_token = "";
        java.lang.String _symbolChart_exchange = "";
        java.lang.String _symbolChart_symbol = "";
        com.eoddata.ws.data.RESPONSE _symbolChart__return = port.symbolChart(_symbolChart_token, _symbolChart_exchange, _symbolChart_symbol);
        System.out.println("symbolChart.result=" + _symbolChart__return);


        }
        {
        System.out.println("Invoking fundamentalList...");
        java.lang.String _fundamentalList_token = "";
        java.lang.String _fundamentalList_exchange = "";
        com.eoddata.ws.data.RESPONSE _fundamentalList__return = port.fundamentalList(_fundamentalList_token, _fundamentalList_exchange);
        System.out.println("fundamentalList.result=" + _fundamentalList__return);


        }
        {
        System.out.println("Invoking quoteList...");
        java.lang.String _quoteList_token = "";
        java.lang.String _quoteList_exchange = "";
        com.eoddata.ws.data.RESPONSE _quoteList__return = port.quoteList(_quoteList_token, _quoteList_exchange);
        System.out.println("quoteList.result=" + _quoteList__return);


        }
        {
        System.out.println("Invoking exchangeMonths...");
        java.lang.String _exchangeMonths_token = "";
        java.lang.String _exchangeMonths_exchange = "";
        com.eoddata.ws.data.RESPONSE _exchangeMonths__return = port.exchangeMonths(_exchangeMonths_token, _exchangeMonths_exchange);
        System.out.println("exchangeMonths.result=" + _exchangeMonths__return);


        }
        {
        System.out.println("Invoking quoteListByDatePeriod...");
        java.lang.String _quoteListByDatePeriod_token = "";
        java.lang.String _quoteListByDatePeriod_exchange = "";
        java.lang.String _quoteListByDatePeriod_quoteDate = "";
        java.lang.String _quoteListByDatePeriod_period = "";
        com.eoddata.ws.data.RESPONSE _quoteListByDatePeriod__return = port.quoteListByDatePeriod(_quoteListByDatePeriod_token, _quoteListByDatePeriod_exchange, _quoteListByDatePeriod_quoteDate, _quoteListByDatePeriod_period);
        System.out.println("quoteListByDatePeriod.result=" + _quoteListByDatePeriod__return);


        }
        {
        System.out.println("Invoking symbolHistoryPeriod...");
        java.lang.String _symbolHistoryPeriod_token = "";
        java.lang.String _symbolHistoryPeriod_exchange = "";
        java.lang.String _symbolHistoryPeriod_symbol = "";
        java.lang.String _symbolHistoryPeriod_date = "";
        java.lang.String _symbolHistoryPeriod_period = "";
        com.eoddata.ws.data.RESPONSE _symbolHistoryPeriod__return = port.symbolHistoryPeriod(_symbolHistoryPeriod_token, _symbolHistoryPeriod_exchange, _symbolHistoryPeriod_symbol, _symbolHistoryPeriod_date, _symbolHistoryPeriod_period);
        System.out.println("symbolHistoryPeriod.result=" + _symbolHistoryPeriod__return);


        }
        {
        System.out.println("Invoking dataFormats...");
        java.lang.String _dataFormats_token = "";
        com.eoddata.ws.data.RESPONSE _dataFormats__return = port.dataFormats(_dataFormats_token);
        System.out.println("dataFormats.result=" + _dataFormats__return);


        }
        {
        System.out.println("Invoking membership...");
        java.lang.String _membership_token = "";
        com.eoddata.ws.data.RESPONSE _membership__return = port.membership(_membership_token);
        System.out.println("membership.result=" + _membership__return);


        }
        {
        System.out.println("Invoking exchangeList...");
        java.lang.String _exchangeList_token = "";
        com.eoddata.ws.data.RESPONSE _exchangeList__return = port.exchangeList(_exchangeList_token);
        System.out.println("exchangeList.result=" + _exchangeList__return);


        }
        {
        System.out.println("Invoking symbolChangesByExchange...");
        java.lang.String _symbolChangesByExchange_token = "";
        java.lang.String _symbolChangesByExchange_exchange = "";
        com.eoddata.ws.data.RESPONSE _symbolChangesByExchange__return = port.symbolChangesByExchange(_symbolChangesByExchange_token, _symbolChangesByExchange_exchange);
        System.out.println("symbolChangesByExchange.result=" + _symbolChangesByExchange__return);


        }
        {
        System.out.println("Invoking login...");
        java.lang.String _login_username = "";
        java.lang.String _login_password = "";
        com.eoddata.ws.data.LOGINRESPONSE2 _login__return = port.login(_login_username, _login_password);
        System.out.println("login.result=" + _login__return);


        }
        {
        System.out.println("Invoking countryList...");
        java.lang.String _countryList_token = "";
        com.eoddata.ws.data.RESPONSE _countryList__return = port.countryList(_countryList_token);
        System.out.println("countryList.result=" + _countryList__return);


        }
        {
        System.out.println("Invoking symbolHistoryPeriodByDateRange...");
        java.lang.String _symbolHistoryPeriodByDateRange_token = "";
        java.lang.String _symbolHistoryPeriodByDateRange_exchange = "";
        java.lang.String _symbolHistoryPeriodByDateRange_symbol = "";
        java.lang.String _symbolHistoryPeriodByDateRange_startDate = "";
        java.lang.String _symbolHistoryPeriodByDateRange_endDate = "";
        java.lang.String _symbolHistoryPeriodByDateRange_period = "";
        com.eoddata.ws.data.RESPONSE _symbolHistoryPeriodByDateRange__return = port.symbolHistoryPeriodByDateRange(_symbolHistoryPeriodByDateRange_token, _symbolHistoryPeriodByDateRange_exchange, _symbolHistoryPeriodByDateRange_symbol, _symbolHistoryPeriodByDateRange_startDate, _symbolHistoryPeriodByDateRange_endDate, _symbolHistoryPeriodByDateRange_period);
        System.out.println("symbolHistoryPeriodByDateRange.result=" + _symbolHistoryPeriodByDateRange__return);


        }
        {
        System.out.println("Invoking top10Losses...");
        java.lang.String _top10Losses_token = "";
        java.lang.String _top10Losses_exchange = "";
        com.eoddata.ws.data.RESPONSE _top10Losses__return = port.top10Losses(_top10Losses_token, _top10Losses_exchange);
        System.out.println("top10Losses.result=" + _top10Losses__return);


        }
        {
        System.out.println("Invoking login2...");
        java.lang.String _login2_username = "";
        java.lang.String _login2_password = "";
        java.lang.String _login2_version = "";
        com.eoddata.ws.data.LOGINRESPONSE2 _login2__return = port.login2(_login2_username, _login2_password, _login2_version);
        System.out.println("login2.result=" + _login2__return);


        }
        {
        System.out.println("Invoking splitListBySymbol...");
        java.lang.String _splitListBySymbol_token = "";
        java.lang.String _splitListBySymbol_exchange = "";
        java.lang.String _splitListBySymbol_symbol = "";
        com.eoddata.ws.data.RESPONSE _splitListBySymbol__return = port.splitListBySymbol(_splitListBySymbol_token, _splitListBySymbol_exchange, _splitListBySymbol_symbol);
        System.out.println("splitListBySymbol.result=" + _splitListBySymbol__return);


        }
        {
        System.out.println("Invoking symbolHistory...");
        java.lang.String _symbolHistory_token = "";
        java.lang.String _symbolHistory_exchange = "";
        java.lang.String _symbolHistory_symbol = "";
        java.lang.String _symbolHistory_startDate = "";
        com.eoddata.ws.data.RESPONSE _symbolHistory__return = port.symbolHistory(_symbolHistory_token, _symbolHistory_exchange, _symbolHistory_symbol, _symbolHistory_startDate);
        System.out.println("symbolHistory.result=" + _symbolHistory__return);


        }
        {
        System.out.println("Invoking technicalList...");
        java.lang.String _technicalList_token = "";
        java.lang.String _technicalList_exchange = "";
        com.eoddata.ws.data.RESPONSE _technicalList__return = port.technicalList(_technicalList_token, _technicalList_exchange);
        System.out.println("technicalList.result=" + _technicalList__return);


        }

        System.exit(0);
    }

}
