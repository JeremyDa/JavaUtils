package com.jeremy.util2.Exceptions;

/**
 * 数据库连接异常
 * @author gitview@gmail.com
 */
public class ConnException extends Exception{
	private static final long serialVersionUID = -5515153957859362853L;

	public ConnException(Throwable e) {
		super(e);
	}
	
	public ConnException(String message) {
		super(message);
	}
	
	public ConnException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
