package uz.coder.iText;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfStyle {
    public static void main(String[] args) throws Exception {

        Font blueFont = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.NORMAL, new CMYKColor(255, 0, 0, 0));
        Font yellowFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.NORMAL, new CMYKColor(0, 255, 0, 0));
        Font redFont = FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 0, 255, 0));
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/home/coder/Desktop/StylingExample.pdf"));
        document.open();

        Paragraph paragraphOne = new Paragraph("Some colored paragraph text", redFont);
        document.add(paragraphOne);

        Paragraph chapterTitle = new Paragraph("Chapter Title", yellowFont);
        Chapter chapter1 = new Chapter(chapterTitle,1);
        chapter1.setNumberDepth(0);

        Paragraph secondTitle = new Paragraph("Section Title", redFont);
        Section section1 = chapter1.addSection(secondTitle);

        Paragraph sectionContent = new Paragraph("Section text content", blueFont);
        section1.add(sectionContent);
        document.add(chapter1);

        document.close();
        writer.close();
    }
}
