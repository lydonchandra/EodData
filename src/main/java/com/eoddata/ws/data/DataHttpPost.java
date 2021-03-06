package com.eoddata.ws.data;

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
 
@WebService(targetNamespace = "http://ws.eoddata.com/Data", name = "DataHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DataHttpPost {

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "QuoteGet")
    public RESPONSE quoteGet(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SplitListByExchange")
    public RESPONSE splitListByExchange(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "UpdateDataFormat")
    public RESPONSE updateDataFormat(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "DataFormat", name = "DataFormat", targetNamespace = "")
        java.lang.String dataFormat,
        @WebParam(partName = "IncludeHeader", name = "IncludeHeader", targetNamespace = "")
        java.lang.String includeHeader,
        @WebParam(partName = "IncludeSuffix", name = "IncludeSuffix", targetNamespace = "")
        java.lang.String includeSuffix
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "Top10Gains")
    public RESPONSE top10Gains(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SymbolGet")
    public RESPONSE symbolGet(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "ExchangeGet")
    public RESPONSE exchangeGet(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "QuoteListByDate")
    public RESPONSE quoteListByDate(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "QuoteDate", name = "QuoteDate", targetNamespace = "")
        java.lang.String quoteDate
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "ValidateAccess")
    public RESPONSE validateAccess(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "QuoteDate", name = "QuoteDate", targetNamespace = "")
        java.lang.String quoteDate,
        @WebParam(partName = "Period", name = "Period", targetNamespace = "")
        java.lang.String period
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SymbolList")
    public RESPONSE symbolList(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "DataClientLatestVersion")
    public RESPONSE dataClientLatestVersion(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "QuoteList2")
    public RESPONSE quoteList2(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "Symbols", name = "Symbols", targetNamespace = "")
        java.lang.String symbols
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SymbolChart")
    public RESPONSE symbolChart(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "FundamentalList")
    public RESPONSE fundamentalList(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "QuoteList")
    public RESPONSE quoteList(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "ExchangeMonths")
    public RESPONSE exchangeMonths(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "QuoteListByDatePeriod")
    public RESPONSE quoteListByDatePeriod(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "QuoteDate", name = "QuoteDate", targetNamespace = "")
        java.lang.String quoteDate,
        @WebParam(partName = "Period", name = "Period", targetNamespace = "")
        java.lang.String period
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SymbolHistoryPeriod")
    public RESPONSE symbolHistoryPeriod(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "Date", name = "Date", targetNamespace = "")
        java.lang.String date,
        @WebParam(partName = "Period", name = "Period", targetNamespace = "")
        java.lang.String period
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "DataFormats")
    public RESPONSE dataFormats(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "Membership")
    public RESPONSE membership(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "ExchangeList")
    public RESPONSE exchangeList(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SymbolChangesByExchange")
    public RESPONSE symbolChangesByExchange(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "LOGINRESPONSE2", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "Login")
    public LOGINRESPONSE2 login(
        @WebParam(partName = "Username", name = "Username", targetNamespace = "")
        java.lang.String username,
        @WebParam(partName = "Password", name = "Password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "CountryList")
    public RESPONSE countryList(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SymbolHistoryPeriodByDateRange")
    public RESPONSE symbolHistoryPeriodByDateRange(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate,
        @WebParam(partName = "EndDate", name = "EndDate", targetNamespace = "")
        java.lang.String endDate,
        @WebParam(partName = "Period", name = "Period", targetNamespace = "")
        java.lang.String period
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "Top10Losses")
    public RESPONSE top10Losses(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );

    @WebResult(name = "LOGINRESPONSE2", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "Login2")
    public LOGINRESPONSE2 login2(
        @WebParam(partName = "Username", name = "Username", targetNamespace = "")
        java.lang.String username,
        @WebParam(partName = "Password", name = "Password", targetNamespace = "")
        java.lang.String password,
        @WebParam(partName = "Version", name = "Version", targetNamespace = "")
        java.lang.String version
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SplitListBySymbol")
    public RESPONSE splitListBySymbol(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "SymbolHistory")
    public RESPONSE symbolHistory(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange,
        @WebParam(partName = "Symbol", name = "Symbol", targetNamespace = "")
        java.lang.String symbol,
        @WebParam(partName = "StartDate", name = "StartDate", targetNamespace = "")
        java.lang.String startDate
    );

    @WebResult(name = "RESPONSE", targetNamespace = "http://ws.eoddata.com/Data", partName = "Body")
    @WebMethod(operationName = "TechnicalList")
    public RESPONSE technicalList(
        @WebParam(partName = "Token", name = "Token", targetNamespace = "")
        java.lang.String token,
        @WebParam(partName = "Exchange", name = "Exchange", targetNamespace = "")
        java.lang.String exchange
    );
}
