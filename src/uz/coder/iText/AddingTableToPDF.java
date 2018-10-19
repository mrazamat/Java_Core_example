//Let’s start writing our example codes with customary Hello World application.
// In this application, I will create a PDF file with a single statement in content.
package uz.coder.iText;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class AddingTableToPDF {
    public static void main(String[] args) throws Exception{
        Document document = new Document();

        String file = "/home/coder/Desktop/table.pdf";

        //Creating pdf object
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        document.add(new Paragraph("coding is fun"));

        // Set attributes here
        document.addAuthor("Coder");
        document.addCreationDate();
        document.addCreator("www.coder.uz");
        document.addTitle("Set Attribute Example");
        document.addSubject("An example to show how attributes can be added to pdf files.");
        document.close();
        writer.close();
    }

}
