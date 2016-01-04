package com.abc.calldetails.service;

import com.abc.calldetails.model.CallDetails;

import java.util.Date;
import java.util.List;

/**
 * @author Swadeep.S
 *
 */
public interface iCallDetailsReport {
	/**
	 * @param callStartTime
	 * @param callEndTime
	 * @return
	 */
	public List<CallDetails> getCallDetails(Date callStartTime, Date callEndTime);

	/**
	 * @param callerNumber
	 * @param callStartTime
	 * @param callEndTime
	 * @return
	 */
	public int getCallDurationDetail(int callerNumber, Date callStartTime, Date callEndTime);

	/**
	 * @param callStatus
	 * @param callStartTime
	 * @param callEndTime
	 * @return
	 */
	public List<CallDetails> getCallStatusDetail(CallDetails.CallStatus callStatus, Date callStartTime,
			Date callEndTime);

	/**
	 * @param businessNumber
	 * @param callStartTime
	 * @param callEndTime
	 * @return
	 */
	public List<CallDetails> getCallDetail(int businessNumber, Date callStartTime, Date callEndTime);
}
