package service;

import java.util.List;

import entite.Compte;

public interface IBanque {

	public double conversionEuroToDH(double mnt) throws BanqueException;
	public Compte getCompte(int code) throws BanqueException;
	public List<Compte> getComptes() throws BanqueException;;
	public void retirer(int code,double mnt) throws BanqueException;
	public void verser(int code, double mnt) throws BanqueException;
	public void virement(int codeSource, int codeDestination, double mnt) throws BanqueException;
}
