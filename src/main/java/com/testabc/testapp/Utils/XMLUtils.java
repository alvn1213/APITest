package com.testabc.testapp.Utils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtils {
	public void parseXML(){
        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder db;
		try {
			db = dbfactory.newDocumentBuilder();
		    Document doc = db.parse("D:\\GitHub\\APITest\\execType.xml");  
	        //1.getConfig  
		    NodeList configs = doc.getElementsByTagName("config");  
		    Node config=configs.item(0);
		    
	    
		    //2.get group  
		    NodeList testgroup = doc.getElementsByTagName("test");  

		    
		      
		      
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
  
	}

}
