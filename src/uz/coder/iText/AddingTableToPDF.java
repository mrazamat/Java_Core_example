package uz.coder.iText;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class AddingTableToPDF {
    public static void main(String[] args) throws Exception{
        Document document = new Document();

        String file = "/home/coder/Desktop/table.pdf";

        //Creating pdf object
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        document.add(new Paragraph("Razakov Azamat Xusenovich"));
        document.close();
    }

}
