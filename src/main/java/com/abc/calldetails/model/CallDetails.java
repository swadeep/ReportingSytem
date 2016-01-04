package com.abc.calldetails.model;

import java.math.BigInteger;
import java.util.*;

/**
 * @author Swadeep.S
 *
 */
public class CallDetails {
	private int callId;
	private UUID uniqueId;
	private Date callStartTime;
	private Date callEndTime;
	private int duration;
	private BigInteger businessNumber;
	private BigInteger callerNumber;
	private CallStatus callStatus;

	public enum CallStatus {
		Answered, Unanswered
	};

	public int getCallId() {
		return callId;
	}

	public void setCallId(int callId) {
		this.callId = callId;
	}

	public UUID getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(UUID uniqueId) {
		this.uniqueId = uniqueId;
	}

	public Date getCallStartTime() {
		return callStartTime;
	}

	public void setCallStartTime(Date callStartTime) {
		this.callStartTime = callStartTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getCallEndTime() {
		return callEndTime;
	}

	public void setCallEndTime(Date callEndTime) {
		this.callEndTime = callEndTime;
	}

	public BigInteger getBusinessNumber() {
		return businessNumber;
	}

	public void setBusinessNumber(BigInteger businessNumber) {
		this.businessNumber = businessNumber;
	}

	public BigInteger getCallerNumber() {
		return callerNumber;
	}

	public void setCallerNumber(BigInteger callerNumber) {
		this.callerNumber = callerNumber;
	}

	public CallStatus getCallStatus() {
		return callStatus;
	}

	public void setCallStatus(CallStatus callStatus) {
		this.callStatus = callStatus;
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			CallDetails callDetails = (CallDetails) object;
			if (callDetails.getUniqueId() == this.getUniqueId() && this.getCallId() == callDetails.getCallId()) {
				result = true;
			}
		}
		return result;
	}

	// just omitted null checks
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.getUniqueId().hashCode();
		hash = 7 * hash + this.getCallId();
		return hash;
	}

	@Override
	public String toString() {
		return "CallDetails{" + "callId=" + callId + ",uniqueId=" + uniqueId + ",callStartTime=" + callStartTime
				+ ",callEndTime=" + callEndTime + ",duration=" + duration + ",businessNumber=" + businessNumber
				+ ",callerNumber=" + callerNumber + ",callStatus=" + callStatus.name() + '}';

	}
}
