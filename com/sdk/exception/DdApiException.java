package com.dangdang.sdk.exception;

public class DdApiException extends Exception {

	private static final long serialVersionUID = 4553269085477475400L;

	public DdApiException(){
		super();
	}

	public DdApiException(String s){
		super(s);
	}

	public DdApiException(String s, Throwable throwable){
		super(s, throwable);
	}

	public DdApiException(Throwable throwable){
		super(throwable);
	}
}
