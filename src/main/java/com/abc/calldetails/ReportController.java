package com.abc.calldetails;

import com.abc.calldetails.model.CallDetails;
import com.abc.calldetails.reportGenerator.ReportGenerator;
import com.abc.calldetails.service.serviceImpl.CallDetailReport;
import com.abc.calldetails.service.iCallDetailsReport;

import java.util.Date;
import java.util.List;

/**
 * @author Swadeep.S
 *
 */
public class ReportController {
	ReportGenerator reportGenerator;
	iCallDetailsReport detailedReport = new CallDetailReport();
	private static final String CALL_DETIAL_REPORT_FOR_DURATION = "Call Details report for Given Duration";
	private static final String FILE_PATH = "D:\\Test\\";

	/**
	 * @param reportType
	 * @param callStartTime
	 * @param callEndTime
	 * 
	 * This method will generate call details report and write it to the file system
	 */
	public void generateCallDetailsReport(String reportType, Date callStartTime, Date callEndTime) {
		reportGenerator = getReportGenerator(reportType);
		List<CallDetails> callDetails = detailedReport.getCallDetails(callStartTime, callEndTime);
		reportGenerator.generateReport(FILE_PATH + CALL_DETIAL_REPORT_FOR_DURATION, callDetails.toString());
	}

	/**
	 * @param reportType
	 * @param callStatus
	 * @param callStartTime
	 * @param callEndTime
	 * 
	 * This method will generate call status details ie., Anwered/Unanswerd report and write it to the file system
	 */
	public void generateCallStatusDetail(String reportType, CallDetails.CallStatus callStatus, Date callStartTime,
			Date callEndTime) {
		reportGenerator = getReportGenerator(reportType);
		List<CallDetails> callDetails = detailedReport.getCallStatusDetail(callStatus, callStartTime, callEndTime);
		reportGenerator.generateReport(FILE_PATH + CALL_DETIAL_REPORT_FOR_DURATION, callDetails.toString());
	}

	/**
	 * @param reportType
	 * @param businessNumber
	 * @param callStartTime
	 * @param callEndTime
	 * 
	 * This method will generate a single call details report and write it to the file system
	 */
	public void generateCallDetail(String reportType, int businessNumber, Date callStartTime, Date callEndTime) {
		reportGenerator = getReportGenerator(reportType);
		List<CallDetails> callDetails = detailedReport.getCallDetail(businessNumber, callStartTime, callEndTime);
		reportGenerator.generateReport(FILE_PATH + CALL_DETIAL_REPORT_FOR_DURATION, callDetails.toString());
	}

	/**
	 * @param reportType
	 * @return
	 * 
	 * This method will return what type of reports needs to be generated
	 */
	private ReportGenerator getReportGenerator(String reportType) {

		return ReportGeneratorFactory.getReportGenerator(reportType);
	}

	// Test

	public static void main(String[] args) {
		ReportController rc = new ReportController();
		rc.generateCallDetailsReport("Text", new Date(), new Date());
	}
}
