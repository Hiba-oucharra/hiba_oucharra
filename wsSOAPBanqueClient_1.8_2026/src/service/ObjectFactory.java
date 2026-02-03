
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _Virement_QNAME = new QName("http://service/", "virement");
    private final static QName _Retirer_QNAME = new QName("http://service/", "retirer");
    private final static QName _AjouterCompte_QNAME = new QName("http://service/", "ajouterCompte");
    private final static QName _BanqueFault_QNAME = new QName("http://service/", "BanqueFault");
    private final static QName _GetCompteResponse_QNAME = new QName("http://service/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://service/", "getCompte");
    private final static QName _ConversionEuroToDH_QNAME = new QName("http://service/", "conversionEuroToDH");
    private final static QName _SupprimerCompteResponse_QNAME = new QName("http://service/", "supprimerCompteResponse");
    private final static QName _GetComptesResponse_QNAME = new QName("http://service/", "getComptesResponse");
    private final static QName _ConversionEuroToDHResponse_QNAME = new QName("http://service/", "conversionEuroToDHResponse");
    private final static QName _GetComptes_QNAME = new QName("http://service/", "getComptes");
    private final static QName _ModifierCompteResponse_QNAME = new QName("http://service/", "modifierCompteResponse");
    private final static QName _AjouterCompteResponse_QNAME = new QName("http://service/", "ajouterCompteResponse");
    private final static QName _VerserResponse_QNAME = new QName("http://service/", "verserResponse");
    private final static QName _RetirerResponse_QNAME = new QName("http://service/", "retirerResponse");
    private final static QName _SupprimerCompte_QNAME = new QName("http://service/", "supprimerCompte");
    private final static QName _VirementResponse_QNAME = new QName("http://service/", "virementResponse");
    private final static QName _ModifierCompte_QNAME = new QName("http://service/", "modifierCompte");
    private final static QName _Compte_QNAME = new QName("http://service/", "compte");
    private final static QName _Verser_QNAME = new QName("http://service/", "verser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link BanqueException }
     * 
     */
    public BanqueException createBanqueException() {
        return new BanqueException();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link AjouterCompte }
     * 
     */
    public AjouterCompte createAjouterCompte() {
        return new AjouterCompte();
    }

    /**
     * Create an instance of {@link Retirer }
     * 
     */
    public Retirer createRetirer() {
        return new Retirer();
    }

    /**
     * Create an instance of {@link Virement }
     * 
     */
    public Virement createVirement() {
        return new Virement();
    }

    /**
     * Create an instance of {@link ModifierCompteResponse }
     * 
     */
    public ModifierCompteResponse createModifierCompteResponse() {
        return new ModifierCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDHResponse }
     * 
     */
    public ConversionEuroToDHResponse createConversionEuroToDHResponse() {
        return new ConversionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link SupprimerCompteResponse }
     * 
     */
    public SupprimerCompteResponse createSupprimerCompteResponse() {
        return new SupprimerCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDH }
     * 
     */
    public ConversionEuroToDH createConversionEuroToDH() {
        return new ConversionEuroToDH();
    }

    /**
     * Create an instance of {@link ModifierCompte }
     * 
     */
    public ModifierCompte createModifierCompte() {
        return new ModifierCompte();
    }

    /**
     * Create an instance of {@link RetirerResponse }
     * 
     */
    public RetirerResponse createRetirerResponse() {
        return new RetirerResponse();
    }

    /**
     * Create an instance of {@link SupprimerCompte }
     * 
     */
    public SupprimerCompte createSupprimerCompte() {
        return new SupprimerCompte();
    }

    /**
     * Create an instance of {@link VirementResponse }
     * 
     */
    public VirementResponse createVirementResponse() {
        return new VirementResponse();
    }

    /**
     * Create an instance of {@link VerserResponse }
     * 
     */
    public VerserResponse createVerserResponse() {
        return new VerserResponse();
    }

    /**
     * Create an instance of {@link AjouterCompteResponse }
     * 
     */
    public AjouterCompteResponse createAjouterCompteResponse() {
        return new AjouterCompteResponse();
    }

    /**
     * Create an instance of {@link Verser }
     * 
     */
    public Verser createVerser() {
        return new Verser();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Virement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "virement")
    public JAXBElement<Virement> createVirement(Virement value) {
        return new JAXBElement<Virement>(_Virement_QNAME, Virement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "retirer")
    public JAXBElement<Retirer> createRetirer(Retirer value) {
        return new JAXBElement<Retirer>(_Retirer_QNAME, Retirer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ajouterCompte")
    public JAXBElement<AjouterCompte> createAjouterCompte(AjouterCompte value) {
        return new JAXBElement<AjouterCompte>(_AjouterCompte_QNAME, AjouterCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BanqueException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "BanqueFault")
    public JAXBElement<BanqueException> createBanqueFault(BanqueException value) {
        return new JAXBElement<BanqueException>(_BanqueFault_QNAME, BanqueException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conversionEuroToDH")
    public JAXBElement<ConversionEuroToDH> createConversionEuroToDH(ConversionEuroToDH value) {
        return new JAXBElement<ConversionEuroToDH>(_ConversionEuroToDH_QNAME, ConversionEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "supprimerCompteResponse")
    public JAXBElement<SupprimerCompteResponse> createSupprimerCompteResponse(SupprimerCompteResponse value) {
        return new JAXBElement<SupprimerCompteResponse>(_SupprimerCompteResponse_QNAME, SupprimerCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conversionEuroToDHResponse")
    public JAXBElement<ConversionEuroToDHResponse> createConversionEuroToDHResponse(ConversionEuroToDHResponse value) {
        return new JAXBElement<ConversionEuroToDHResponse>(_ConversionEuroToDHResponse_QNAME, ConversionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "modifierCompteResponse")
    public JAXBElement<ModifierCompteResponse> createModifierCompteResponse(ModifierCompteResponse value) {
        return new JAXBElement<ModifierCompteResponse>(_ModifierCompteResponse_QNAME, ModifierCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ajouterCompteResponse")
    public JAXBElement<AjouterCompteResponse> createAjouterCompteResponse(AjouterCompteResponse value) {
        return new JAXBElement<AjouterCompteResponse>(_AjouterCompteResponse_QNAME, AjouterCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verserResponse")
    public JAXBElement<VerserResponse> createVerserResponse(VerserResponse value) {
        return new JAXBElement<VerserResponse>(_VerserResponse_QNAME, VerserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "retirerResponse")
    public JAXBElement<RetirerResponse> createRetirerResponse(RetirerResponse value) {
        return new JAXBElement<RetirerResponse>(_RetirerResponse_QNAME, RetirerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "supprimerCompte")
    public JAXBElement<SupprimerCompte> createSupprimerCompte(SupprimerCompte value) {
        return new JAXBElement<SupprimerCompte>(_SupprimerCompte_QNAME, SupprimerCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "virementResponse")
    public JAXBElement<VirementResponse> createVirementResponse(VirementResponse value) {
        return new JAXBElement<VirementResponse>(_VirementResponse_QNAME, VirementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "modifierCompte")
    public JAXBElement<ModifierCompte> createModifierCompte(ModifierCompte value) {
        return new JAXBElement<ModifierCompte>(_ModifierCompte_QNAME, ModifierCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verser")
    public JAXBElement<Verser> createVerser(Verser value) {
        return new JAXBElement<Verser>(_Verser_QNAME, Verser.class, null, value);
    }

}
