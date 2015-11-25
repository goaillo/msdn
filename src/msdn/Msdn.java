/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msdn;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import org.xml.sax.XMLReader;

/**
 *
 * @author C103-image
 */
public class Msdn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu f1 = new Menu();
        f1.setVisible(true);
        /*try
        {
            Class c = Class.forName("org.apache.xerces.parsers.SAXParser");
            XMLReader parser = (XMLReader) c.newInstance();
            Menu gestioner= new Menu();
            parser.setContentHandler(gestioner);
            parser.parse("./ressources/carnet.xml");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/
    }
    
}
