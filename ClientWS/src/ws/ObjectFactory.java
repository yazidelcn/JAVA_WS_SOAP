
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllAccounts_QNAME = new QName("http://ws/", "getAllAccounts");
    private final static QName _ConvertionEuroToMad_QNAME = new QName("http://ws/", "convertionEuroToMad");
    private final static QName _GetAccount_QNAME = new QName("http://ws/", "getAccount");
    private final static QName _ConvertionEuroToMadResponse_QNAME = new QName("http://ws/", "convertionEuroToMadResponse");
    private final static QName _GetAllAccountsResponse_QNAME = new QName("http://ws/", "getAllAccountsResponse");
    private final static QName _GetAccountResponse_QNAME = new QName("http://ws/", "getAccountResponse");
    private final static QName _Compte_QNAME = new QName("http://ws/", "compte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllAccounts }
     * 
     */
    public GetAllAccounts createGetAllAccounts() {
        return new GetAllAccounts();
    }

    /**
     * Create an instance of {@link ConvertionEuroToMad }
     * 
     */
    public ConvertionEuroToMad createConvertionEuroToMad() {
        return new ConvertionEuroToMad();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link ConvertionEuroToMadResponse }
     * 
     */
    public ConvertionEuroToMadResponse createConvertionEuroToMadResponse() {
        return new ConvertionEuroToMadResponse();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllAccounts")
    public JAXBElement<GetAllAccounts> createGetAllAccounts(GetAllAccounts value) {
        return new JAXBElement<GetAllAccounts>(_GetAllAccounts_QNAME, GetAllAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionEuroToMad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertionEuroToMad")
    public JAXBElement<ConvertionEuroToMad> createConvertionEuroToMad(ConvertionEuroToMad value) {
        return new JAXBElement<ConvertionEuroToMad>(_ConvertionEuroToMad_QNAME, ConvertionEuroToMad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<GetAccount>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionEuroToMadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertionEuroToMadResponse")
    public JAXBElement<ConvertionEuroToMadResponse> createConvertionEuroToMadResponse(ConvertionEuroToMadResponse value) {
        return new JAXBElement<ConvertionEuroToMadResponse>(_ConvertionEuroToMadResponse_QNAME, ConvertionEuroToMadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllAccountsResponse")
    public JAXBElement<GetAllAccountsResponse> createGetAllAccountsResponse(GetAllAccountsResponse value) {
        return new JAXBElement<GetAllAccountsResponse>(_GetAllAccountsResponse_QNAME, GetAllAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

}
