import java.util.Scanner;
import service.BanqueException_Exception;
import service.BanqueServiceMap;
import service.BanqueWS;
import service.Compte;

public class BanqueClient {

	public static void main(String[] args) {
		BanqueServiceMap banque = new BanqueWS().getBanqueServiceMapPort();

		Scanner sc = new Scanner(System.in);
		int choix, code;
		double mnt;

		do {
			System.out.println("\n===== MENU BANQUE RMI =====");
			System.out.println("1- Consulter compte");
			System.out.println("6- Consulter les comptes");
			System.out.println("2- Verser");
			System.out.println("3- Retirer");
			System.out.println("4- Virement");
			System.out.println("5- Conversion Euro → DH");
			System.out.println("0- Quitter");
			System.out.print("Votre choix : ");

			choix = sc.nextInt();

			try {
				switch (choix) {

				case 1:
					System.out.print("Code compte : ");
					code = sc.nextInt();
					Compte c = banque.getCompte(code);
					System.out.println("Compte : " + c.getCode() + " Solde --> " + c.getSolde());
					break;

				case 2:
					System.out.print("Code compte : ");
					code = sc.nextInt();
					System.out.print("Montant : ");
					mnt = sc.nextDouble();
					banque.verser(code, mnt);
					System.out.println("Versement effectué avec succès");
					break;

				case 3:
					System.out.print("Code compte : ");
					code = sc.nextInt();
					System.out.print("Montant : ");
					mnt = sc.nextDouble();
					banque.retirer(code, mnt);
					System.out.println("Retrait effectué avec succès");
					break;

				case 4:
					System.out.print("Code source : ");
					int cs = sc.nextInt();
					System.out.print("Code destination : ");
					int cd = sc.nextInt();
					System.out.print("Montant : ");
					mnt = sc.nextDouble();
					banque.virement(cs, cd, mnt);
					System.out.println("Virement effectué avec succès");
					break;

				case 5:
					System.out.print("Montant en Euro : ");
					double euro = sc.nextDouble();
					double dh = banque.conversionEuroToDH(euro);
					System.out.println("Montant en DH = " + dh);
					break;

				case 6:

					for (Compte c1 : banque.getComptes()) {
						System.out.println("Compte : " + c1.getCode() + " Solde --> " + c1.getSolde());
					}
					break;

				case 0:
					System.out.println("Fin du programme");
					break;

				default:
					System.out.println("Choix invalide");
				}

			} catch (BanqueException_Exception e) {
				// AX-WS génère côté client une SOAP Fault, levée sous forme de :
				// jakarta.xml.ws.soap.SOAPFaultException
				System.out.println(e.getMessage());
			}
			/*
			 * catch (WebServiceException e) { // Sécurité (autres erreurs techniques)
			 * System.out.println("Erreur technique : " + e.getMessage()); }
			 */

		} while (choix != 0);

	}

}
