package com.bridgelabz.utility;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessBuffer;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;

import java.net.URL;

public class PDFHandling {
    public void verifyPDFContent() {
        PDFTextStripper pdfStripper;
        PDDocument pdDoc = null;
        COSDocument cosDoc = null;
        String parsedText = null;

        try {
            URL url = new URL("https://www.adobe.com/support/products/enterprise/knowledgecenter/media/c4611_sample_explain.pdf");
            RandomAccessBuffer file = new RandomAccessBuffer(url.openStream());
            PDFParser parser = new PDFParser(file);

            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(1);
            pdDoc = new PDDocument(cosDoc);
            parsedText = pdfStripper.getText(pdDoc);
            cosDoc.close();
            pdDoc.close();
            System.out.println(parsedText);
        } catch (Exception e) {
            System.err.println("Unable to open PDF Parser" + e.getMessage());
            Assert.assertTrue(parsedText.contains("PDF BOOKMARK SAMPLE "));
        }
    }

}
