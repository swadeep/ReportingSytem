package com.abc.calldetails.reportGenerator;

/**
 * @author Swadeep.S
 *
 */
public interface ReportGenerator {
	
	/**
	 * @param fileName
	 * @param content
	 * 
	 * Common interface to generate the reports.
	 */
	public void generateReport(String fileName, String content);
}
