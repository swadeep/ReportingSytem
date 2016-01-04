package com.abc.calldetails.dao.daoImpl;

import com.abc.calldetails.dao.CallDetailDao;
import com.abc.calldetails.model.CallDetails;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author Swadeep.S
 *
 */
public class CallDetailDaoImpl implements CallDetailDao {
	
	/* (non-Javadoc)
	 * @see com.abc.calldetails.dao.CallDetailDao#getCallDetails(java.util.Date, java.util.Date)
	 * 
	 * This method will return all the call details
	 */
	public List<CallDetails> getCallDetails(Date callStartTime, Date callEndTime) {
		// SELECT * FROM CallDetails WHERE `callStartTime` >= callStartTime AND
		// 'callEndTime' <=callEndTime;

		return getCallDetails();
	}

	/* (non-Javadoc)
	 * @see com.abc.calldetails.dao.CallDetailDao#getCallDurationDetail(int, java.util.Date, java.util.Date)
	 * 
	 * This method will return the call duration details
	 */
	public int getCallDurationDetail(int callerNumber, Date callStartTime, Date callEndTime) {
		return 30;
	}

	/* (non-Javadoc)
	 * @see com.abc.calldetails.dao.CallDetailDao#getCallStatusDetail(java.lang.String, java.util.Date, java.util.Date)
	 * 
	 * This method will return the list of all the call status. ie., status = Anwered/Unanswered
	 */
	public List<CallDetails> getCallStatusDetail(String callStatus, Date callStartTime, Date callEndTime) {
		// SELECT * FROM CallDetails WHERE `callStartTime` >= callStartTime AND
		// 'callEndTime' <=callEndTime and callStatus='callStatus';
		return getCallDetails();
	}

	/* (non-Javadoc)
	 * @see com.abc.calldetails.dao.CallDetailDao#getCallDetail(int, java.util.Date, java.util.Date)
	 * 
	 * This method will return the list of call details of a particular business number
	 */
	public List<CallDetails> getCallDetail(int businessNumber, Date callStartTime, Date callEndTime) {
		// SELECT * FROM CallDetails WHERE `callStartTime` >= callStartTime AND
		// 'callEndTime' <=callEndTime and businessNumber='businessNumber';
		return getCallDetails();
	}

	
	/**
	 * In this method I'm setting static data to the call detais object
	 */
	private List<CallDetails> getCallDetails() {
		List<CallDetails> callDetails = new ArrayList<CallDetails>();
		CallDetails c1 = new CallDetails();
		c1.setBusinessNumber(new BigInteger("918030828000"));
		c1.setDuration(30);
		c1.setCallStatus(CallDetails.CallStatus.Answered);
		c1.setCallStartTime(new Date());
		c1.setCallEndTime(new Date());
		c1.setCallId(1);
		c1.setUniqueId(UUID.randomUUID());
		c1.setCallerNumber(new BigInteger("919845612345"));
		callDetails.add(c1);
		c1 = new CallDetails();
		c1.setBusinessNumber(new BigInteger("918030828000"));
		c1.setDuration(40);
		c1.setCallStartTime(new Date());
		c1.setCallStatus(CallDetails.CallStatus.Answered);
		c1.setCallEndTime(new Date());
		c1.setCallId(2);
		c1.setUniqueId(UUID.randomUUID());
		c1.setCallerNumber(new BigInteger("919845612346"));
		callDetails.add(c1);
		return callDetails;
	}
}
