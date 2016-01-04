package com.abc.calldetails;

import com.abc.calldetails.reportGenerator.ReportGenerator;
import com.abc.calldetails.reportGenerator.reportGeneratorImpl.*;


/**
 * @author Swadeep.S
 *
 */
public class ReportGeneratorFactory {
	private static ReportGenerator reportGenerator;

	/**
	 * @param type
	 * @return
	 */
	public static ReportGenerator getReportGenerator(String type) {
		if ("PDF".equals(type)) {
			reportGenerator = new PDFReportGenerator();
		} else if ("Text".equals(type)) {
			reportGenerator = new TextReportGenerator();
		} else {
			throw new RuntimeException("Invalid Report Type.");
		}
		return reportGenerator;
	}
}
 