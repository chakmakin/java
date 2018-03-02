package com.raj;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeGenerator {
	private static final String QR_CODE_IMAGE_PATH = "./QRExamp.jpg";
	private static String xmlString = "<website>\n" + "<name>http://chakmak.in</name>\n"
			+ "<twitter>https://twitter.com/chakmakin</twitter>\n"
			+ "<facebook>https://www.facebook.com/chakmakin?_rdr=p</facebook>\n"
			+ "<googleplus>https://plus.google.com/+ChakmakInplus/posts</googleplus>\n"
			+ "<github>https://github.com/chakmakin</github>\n" + "</website>";

	private static void generateQRCodeImage(String text, int width, int height, String filePath)
			throws WriterException, IOException {
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

		Path path = FileSystems.getDefault().getPath(filePath);
		MatrixToImageWriter.writeToPath(bitMatrix, "jpg", path);
	}

	public static void main(String[] args) {
		try {
			String textToQR = "http://chakmak.in";
			Boolean website = true;
			if (website == true) {
				generateXMLQR();
			} else {
				generateQRCodeImage(textToQR, 350, 350, QR_CODE_IMAGE_PATH);
			}

			System.out.println("Done");
		} catch (WriterException e) {
			System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
		}
	}

	private static void generateXMLQR() throws WriterException, IOException {
		int width = 350;
		int height = 350;
		String XML_QR_PATH = "./XMLQR.jpg";
		QRCodeWriter qrWriter = new QRCodeWriter();
		BitMatrix bitMatix = qrWriter.encode(xmlString, BarcodeFormat.QR_CODE, width, height);

		Path path = FileSystems.getDefault().getPath(XML_QR_PATH);
		MatrixToImageWriter.writeToPath(bitMatix, "jpg", path);
	}
}
