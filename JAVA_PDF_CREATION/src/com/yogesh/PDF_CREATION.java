package com.yogesh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF_CREATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object of Document class 
		
		Document document = new Document();
		
		try {
			
			// take writer class object 
			
			PdfWriter writer =  PdfWriter.getInstance(document, new FileOutputStream("yogesh.pdf"));
			
			
			// open Document 
			document.open();
			
			// writing paragaraph 
			
			document.add(new Paragraph("This is my new File of Creation Document "));
			
			
		 // crate the object of list 
			
			List orderlist = new List(List.ORDERED);
			
			// adding item in List 
			
			orderlist.add(new ListItem("Jan"));
			orderlist.add(new ListItem("feb"));
			orderlist.add(new ListItem("march"));
			orderlist.add(new ListItem("April"));
			orderlist.add(new ListItem("May"));

			document.add(orderlist);
			
			
			
			
			
			
			document.close();
			writer.close();
			

		}
		
		catch(DocumentException e) {
			e.printStackTrace();
		}
		
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
