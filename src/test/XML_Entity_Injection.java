package test;

import java.net.Socket;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XML_Entity_Injection {
	
	public void parse(Socket sock) throws Exception {
		  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder builder = factory.newDocumentBuilder();
		  builder.parse(sock.getInputStream()); //unsafe code / XXE attacks
		  
		  /*
		   * 
		   * public void disableDTDParse(Socket sock) throws Exception {
  				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
  				
  				//DocumentBuilder is created with DTD disabled, securing it against XXE attack
  				 *
  				factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true); 
  				DocumentBuilder builder = factory.newDocumentBuilder();
  				builder.parse(sock.getInputStream()); //safe code 
				}
		   * 
		   *  
		   */
		}	

}
