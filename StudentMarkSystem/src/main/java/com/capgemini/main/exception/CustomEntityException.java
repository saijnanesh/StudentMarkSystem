package com.capgemini.main.exception;

import java.util.Date;

public class CustomEntityException {
	private Date timeStamp;
	private String message;
	private String errormsg;
	
	
	
	
	
	
	
	
	public CustomEntityException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomEntityException(Date timeStamp, String message, String errormsg) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.errormsg = errormsg;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	@Override
	public String toString() {
		return "CustomEntityException [timeStamp=" + timeStamp + ", message=" + message + ", errormsg=" + errormsg
				+ "]";
	}
	
	

}
