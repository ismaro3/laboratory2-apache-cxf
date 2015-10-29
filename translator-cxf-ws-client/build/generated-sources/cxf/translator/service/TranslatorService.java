package translator.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2015-10-28T20:45:09.074+01:00
 * Generated source version: 3.1.3
 * 
 */
@WebService(targetNamespace = "http://service.translator/", name = "TranslatorService")
@XmlSeeAlso({ObjectFactory.class})
public interface TranslatorService {

    @WebMethod
    @RequestWrapper(localName = "translate", targetNamespace = "http://service.translator/", className = "translator.service.Translate")
    @ResponseWrapper(localName = "translateResponse", targetNamespace = "http://service.translator/", className = "translator.service.TranslateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public translator.service.TranslatedText translate(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    );
}
