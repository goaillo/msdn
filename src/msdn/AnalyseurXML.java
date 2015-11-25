/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdn;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 *
 * @author C103-image
 */
public class AnalyseurXML extends DefaultHandler{
    String donnees;
    Logiciel log;
    String baliseCourante;
    ArrayList<Contact> lesContacts;
    public void startDocument()
    {
        /* Traitement à effectuer au début (connexion à la base…) */
    }	

    public void endDocument()
    {
        /* Traitement à effectuer à la fin (fermeture connexion) */
    }

    public void startElement(String namespace, String localName,
		String qName, Attributes attr) throws SAXException
    {
        if (qName.equals("Your_Product_Keys"))
        {
            monCarnet.setLesContacts(lesContacts);
        }
        baliseCourante = qName;
    }
	
    public void endElement(String namespace, String localName,
        String qName) throws SAXException
    {
        if (qName.equals("Your_Product_Keys"))
        {
            monCarnet.setLesContacts(lesContacts);
        }
    }
		
    public void characters(char[] ch, int deb, int longueur) throws SAXException
    {
        donnees = new String(ch, deb, longueur);
        if (baliseCourante.equals("nom"))
        {
            monContact.setNom(donnees);
        }
        else
        {
            if (baliseCourante.equals("prenom"))
            {
                monContact.setPrenom(donnees);
            }
            else
            {
                if (baliseCourante.equals("cp"))
                {
                    monContact.setCp(donnees);
                }
                else
                {
                    if (baliseCourante.equals("ville"))
                    {
                        monContact.setVille(donnees);
                    }
                    else
                    {
                        if (baliseCourante.equals("tel"))
                        {
                            monContact.setTel(donnees);
                        }
                    }
                }
            }
        }
    }
    public Carnet retourneCarnet()
    {
        return monCarnet;
    }
}
