package service;


import javax.xml.ws.WebFault;

@WebFault(name = "BanqueFault")
public class BanqueException extends Exception {

    public BanqueException(String message) {
        super(message);
    }
}
