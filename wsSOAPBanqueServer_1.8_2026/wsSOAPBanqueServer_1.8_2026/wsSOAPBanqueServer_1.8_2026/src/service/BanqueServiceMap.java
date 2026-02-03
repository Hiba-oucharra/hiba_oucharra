package service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

import entite.Compte;
import entite.TypeCompte;

@WebService(serviceName = "BanqueWS")
public class BanqueServiceMap implements IBanque {

    private Map<Integer, Compte> comptes;

    public BanqueServiceMap    () {
        comptes = new HashMap<>();

        comptes.put(10, new Compte(10, 5000, TypeCompte.Courant));
        comptes.put(20, new Compte(20, 8000, TypeCompte.Epargne));
        comptes.put(30, new Compte(30, 6000, TypeCompte.Courant));
    }

    // ================= Conversion =================
    @WebMethod(operationName = "conversionEuroToDH")
    public double conversionEuroToDH(
            @WebParam(name = "montant") double mnt)
            throws BanqueException {

        if (mnt < 0)
            throw new BanqueException("Montant négatif interdit");

        return mnt * 11;
    }

    // ================= Consultation =================
    @WebMethod
    public synchronized Compte getCompte(
            @WebParam(name = "code") int code)
            throws BanqueException {

        Compte compte = comptes.get(code);
        if (compte == null)
            throw new BanqueException("Compte introuvable : " + code);

        return compte;
    }

    @WebMethod
    public synchronized List<Compte> getComptes() {
        return new ArrayList<>(comptes.values());
    }

    // ================= Gestion des comptes =================
    @WebMethod
    public synchronized void ajouterCompte(
            @WebParam(name = "compte") Compte compte)
            throws BanqueException {

        if (comptes.containsKey(compte.getCode()))
            throw new BanqueException("Compte déjà existant : " + compte.getCode());

        comptes.put(compte.getCode(), compte);
    }

    @WebMethod
    public synchronized void modifierCompte(
            @WebParam(name = "compte") Compte compte)
            throws BanqueException {

        if (!comptes.containsKey(compte.getCode()))
            throw new BanqueException("Compte introuvable : " + compte.getCode());

        comptes.put(compte.getCode(), compte);
    }

    @WebMethod
    public synchronized void supprimerCompte(
            @WebParam(name = "code") int code)
            throws BanqueException {

        if (!comptes.containsKey(code))
            throw new BanqueException("Compte introuvable : " + code);

        comptes.remove(code);
    }

    // ================= Opérations bancaires =================
    @WebMethod
    public synchronized void verser(
            @WebParam(name = "code") int code,
            @WebParam(name = "mountant") double mnt)
            throws BanqueException {

        if (mnt <= 0)
            throw new BanqueException("Montant invalide");

        Compte compte = getCompte(code);
        compte.setSolde(compte.getSolde() + mnt);
    }

    @WebMethod
    public synchronized void retirer(
            @WebParam(name = "code") int code,
            @WebParam(name = "mountant") double mnt)
            throws BanqueException {

        if (mnt <= 0)
            throw new BanqueException("Montant invalide");

        Compte compte = getCompte(code);

        if (compte.getSolde() < mnt)
            throw new BanqueException("Solde insuffisant");

        compte.setSolde(compte.getSolde() - mnt);
    }

    @WebMethod
    public synchronized void virement(
            @WebParam(name = "codeSource") int codeSource,
            @WebParam(name = "codeDestination") int codeDestination,
            @WebParam(name = "mountant") double mnt)
            throws BanqueException {

        if (mnt <= 0)
            throw new BanqueException("Montant invalide");

        if (codeSource == codeDestination)
            throw new BanqueException("Virement sur le même compte interdit");

        retirer(codeSource, mnt);
        verser(codeDestination, mnt);
    }
}

