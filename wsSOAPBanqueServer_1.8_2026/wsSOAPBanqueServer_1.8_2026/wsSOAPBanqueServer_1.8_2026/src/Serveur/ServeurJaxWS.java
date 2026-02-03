package Serveur;




import javax.xml.ws.Endpoint;

import service.BanqueService;
import service.BanqueServiceMap;



public class ServeurJaxWS {

	public static void main(String[] args) {
		String url="http://0.0.0.0:8585/";// specifier l'adresse d'acces ou le port d'acces
		Endpoint.publish(url, new BanqueServiceMap());// la classe Endpoint permet de publie le web service
		System.out.println("serveur démaré........");
		System.out.println(url);
		
	}

}
