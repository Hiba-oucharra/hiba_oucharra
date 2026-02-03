package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


import entite.Compte;
import entite.TypeCompte;

@WebService(serviceName="BanqueWS")
public class BanqueService implements IBanque  {
	
	private List<Compte> comptes;
    
    public BanqueService()  {
        super();
       comptes = new ArrayList<>();
      
        comptes.add(new Compte(10, 5000,TypeCompte.Courant));
        comptes.add(new Compte(20, 8000, TypeCompte.Epargne));
        comptes.add(new Compte(30, 6000, TypeCompte.Courant));
    }

    @WebMethod(operationName = "conversionEuroToDH")
    public double conversionEuroToDH( @WebParam(name = "mountant")  double mnt) 
    		    throws BanqueException  {
        if (mnt < 0)
            throw new BanqueException("Montant négatif interdit");
        return mnt * 11;
    }

    @WebMethod
    public synchronized Compte getCompte(@WebParam(name = "code") int code) 
    		throws BanqueException {
        for (Compte compte : comptes) {
            if (compte.getCode() == code)
                return compte;
        }
        throw new BanqueException("Compte introuvable : " + code);
    }
    
    @WebMethod
    public synchronized List<Compte> getComptes() {
                return  comptes;
    }

    @WebMethod
    public synchronized void verser(@WebParam(name = "code") int code, 
    		         @WebParam(name = "mountant") double mnt ) throws BanqueException {
        if (mnt <= 0)
            throw new BanqueException("Montant invalide");

        Compte compte = getCompte(code);
        compte.setSolde(compte.getSolde() + mnt);
    }

    @WebMethod
    public synchronized void retirer(@WebParam(name = "code") int code, 
	         @WebParam(name = "mountant") double mnt) throws BanqueException {
        if (mnt <= 0)
            throw new BanqueException("Montant invalide");
        

        Compte compte = getCompte(code);

        if (compte.getSolde() < mnt)
            throw new BanqueException("Solde insuffisant");

        compte.setSolde(compte.getSolde() - mnt);
    }

    @WebMethod
    public synchronized void virement(@WebParam(name = "codeSource") int codeSource, 
    		                               @WebParam(name = "codeDestination") int codeDestination, 
	                                        @WebParam(name = "mountant") double mnt)
	                                        		throws BanqueException {

        if (mnt <= 0)
            throw new BanqueException("Montant invalide");

        if (codeSource == codeDestination)
            throw new BanqueException("Virement sur le même compte interdit");

        retirer(codeSource,mnt);
        verser(codeDestination,mnt);
    }
		
}
