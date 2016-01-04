package com.abc.calldetails.service.serviceImpl;

import com.abc.calldetails.dao.*;
import com.abc.calldetails.dao.daoImpl.CallDetailDaoImpl;
import com.abc.calldetails.model.CallDetails;
import com.abc.calldetails.service.iCallDetailsReport;

import java.util.Date;
import java.util.List;

/**
 * @author Swadeep.S
 *
 */
public class CallDetailReport implements iCallDetailsReport {
	CallDetailDao callDetailDao = new CallDetailDaoImpl();

	/* (non-Javadoc)
	 * @see com.abc.calldetails.service.iCallDetailsReport#getCallDetails(java.util.Date, java.util.Date)
	 */
	public List<CallDetails> getCallDetails(Date callStartTime, Date callEndTime) {
		return callDetailDao.getCallDetails(callStartTime, callEndTime);
	}

	/* (non-Javadoc)
	 * @see com.abc.calldetails.service.iCallDetailsReport#getCallDurationDetail(int, java.util.Date, java.util.Date)
	 */
	public int getCallDurationDetail(int callerNumber, Date callStartTime, Date callEndTime) {
		return callDetailDao.getCallDurationDetail(callerNumber, callStartTime, callEndTime);
	}

	/* (non-Javadoc)
	 * @see com.abc.calldetails.service.iCallDetailsReport#getCallStatusDetail(com.abc.calldetails.model.CallDetails.CallStatus, java.util.Date, java.util.Date)
	 */
	public List<CallDetails> getCallStatusDetail(CallDetails.CallStatus callStatus, Date callStartTime,
			Date callEndTime) {
		return callDetailDao.getCallStatusDetail(callStatus.name(), callStartTime, callEndTime);
	}

	/* (non-Javadoc)
	 * @see com.abc.calldetails.service.iCallDetailsReport#getCallDetail(int, java.util.Date, java.util.Date)
	 */
	public List<CallDetails> getCallDetail(int businessNumber, Date callStartTime, Date callEndTime) {
		return callDetailDao.getCallDetail(businessNumber, callStartTime, callEndTime);
	}
}
