package com.zhuani21.review.exception;

public class ReviewBaseException extends Exception {

	private static final long serialVersionUID = -1239557605090161431L;
	private String message = null;

	public ReviewBaseException(){}
	public ReviewBaseException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String exceptionMsg) {
		this.message = exceptionMsg;
	}
}
