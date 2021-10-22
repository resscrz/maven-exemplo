/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maven.exemplo;

import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.io.FileOutputStream;

/**
 *
 * @author ressubu
 */

//exemplo de um java puxando a lib/dependencias itext por maven. Configurado no pom.xml

public class exemplolib {
    
    public void campos1(){
        try {
		   PdfReader pdfReader =new PdfReader("C:\\Pastaqualquer\\exemplodepdfqueexiste.pdf");
                   PdfStamper pdfStamper = new PdfStamper(pdfReader,new FileOutputStream("C:\\saidadopdf\\exemplo.pdf"));
                   BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_ROMAN ,BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
                   PdfContentByte pageContentByte =pdfStamper.getOverContent(1);
                     
                        //exemplo
                        pageContentByte.beginText();
			pageContentByte.setFontAndSize(baseFont,8);
			pageContentByte.setTextMatrix(445, 807);
			pageContentByte.showText("exemplo");
			pageContentByte.endText();
                        
                        		    pdfStamper.close();	
 
		    System.out.println("gerado");
		} catch (Exception e) {
		    e.printStackTrace();
		}
    
}
    
}
