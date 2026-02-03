package service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

import entite.Compte;

@WebService(serviceName="BanqueWS")
public class BanqueService0  {
	
	private List<Compte> comptes;

    public BanqueService0()  {
        super();
        comptes = new ArrayList<>();
        comptes.add(new Compte(10, 5000, null));
        comptes.add(new Compte(20, 8000, null));
        comptes.add(new Compte(30, 6000,null));
    }

    @WebMethod(operationName = "conversionEuroToDH")
    public double conversionEuroToDH( @WebParam(name = "mountant")  double mnt) 
    		    throws WebServiceException  {
        if (mnt < 0)
            throw new WebServiceException("Montant négatif interdit");
        return mnt * 11;
    }

    @WebMethod
    public synchronized Compte getCompte(@WebParam(name = "code") int code) 
    		throws WebServiceException {
        for (Compte compte : comptes) {
            if (compte.getCode() == code)
                return compte;
        }
        throw new WebServiceException("Compte introuvable : " + code);
    }
    
    @WebMethod
    public synchronized List<Compte> getComptes() {
                return comptes;
    }

    @WebMethod
    public synchronized void verser(@WebParam(name = "code") int code, 
    		         @WebParam(name = "mountant") double mnt )throws WebServiceException {
        if (mnt <= 0)
            throw new WebServiceException("Montant invalide");

        Compte compte = getCompte(code);
        compte.setSolde(compte.getSolde() + mnt);
    }

    @WebMethod
    public synchronized void retirer(@WebParam(name = "code") int code, 
	         @WebParam(name = "mountant") double mnt) throws WebServiceException {
        if (mnt <= 0)
            throw new WebServiceException("Montant invalide");
        

        Compte compte = getCompte(code);

        if (compte.getSolde() < mnt)
            throw new WebServiceException("Solde insuffisant");

        compte.setSolde(compte.getSolde() - mnt);
    }

    @WebMethod
    public synchronized void virement(@WebParam(name = "codeSource") int codeSource, 
    		                               @WebParam(name = "codeDestination") int codeDestination, 
	                                        @WebParam(name = "mountant") double mnt)
	                                        		throws WebServiceException {

        if (mnt <= 0)
            throw new WebServiceException("Montant invalide");

        if (codeSource == codeDestination)
            throw new WebServiceException("Virement sur le même compte interdit");

        retirer(codeSource,mnt);
        verser(codeDestination,mnt);
    }
		
}
