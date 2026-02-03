package entite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlRootElement 
@AllArgsConstructor @NoArgsConstructor @Data @ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
   private int code;
   private double solde;
   @XmlTransient
   private TypeCompte type;
  
/*
 * public Compte() {
	super();
	// TODO Auto-generated constructor stub
}
public Compte(int code, double solde) {
	super();
	this.code = code;
	this.solde = solde;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
@Override
public String toString() {
	return "Compte [code=" + code + ", solde=" + solde + "]";
}
*/
   
   
}
