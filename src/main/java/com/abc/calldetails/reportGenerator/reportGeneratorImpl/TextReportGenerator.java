package com.abc.calldetails.reportGenerator.reportGeneratorImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.abc.calldetails.reportGenerator.ReportGenerator;

/**
 * @author Swadeep.S
 *
 */
public class TextReportGenerator implements ReportGenerator {
	private static final String FILE_TYPE = ".txt";
	
	
	/* (non-Javadoc)
	 * @see com.abc.calldetails.reportGenerator.ReportGenerator#generateReport(java.lang.String, java.lang.String)
	 * 
	 * This method will generate the reports in Plain Text Format.
	 */
	public void generateReport(String fileName, String content) {
		File file = new File(fileName.concat(FILE_TYPE));
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
