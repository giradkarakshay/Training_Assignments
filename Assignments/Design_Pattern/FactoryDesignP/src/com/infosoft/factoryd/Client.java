/**
 * 
 */
package com.infosoft.factoryd;

/**
 * @author giradkar.akshay
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		 //creates an instance of XML document
	    XMLDocument xmlDocument=(XMLDocument) new DocumentFactory().getInstance("XML");
	    //Similarly creates an instance of PDF document
	    PDFDocument pdfDocument=(PDFDocument) new DocumentFactory().getInstance("PDF");
	    
	    xmlDocument.getdoc();
	    pdfDocument.getdoc();
	  } 
		
	}
