/**
 * 
 */
package com.infosoft.factoryd;

/**
 * @author giradkar.akshay
 *
 */
public class DocumentFactory {
	
	public Document getInstance(String docIdentifier){
	    switch(docIdentifier){
	      case "XML": return new XMLDocument();
	      case "PDF": return new PDFDocument();
	    }
	    return null;
	  }  

}
