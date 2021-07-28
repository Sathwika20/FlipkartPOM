package com.bridgelabz.pages.test;

import com.bridgelabz.utility.PDFHandling;
import org.testng.annotations.Test;

public class PDFHandlingTest {
    @Test
    public static void read_pdf() {
        PDFHandling pdf = new PDFHandling();
        pdf.verifyPDFContent();
    }
}
