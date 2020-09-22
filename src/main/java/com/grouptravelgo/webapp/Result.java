package com.grouptravelgo.webapp;

public class Result {
	
	public static final int SUCCESS = 0;
	public static final int FAILED 	= -1;
	
	
public
	int result;
	String errString;
	
	public Result() {
		result = Result.FAILED;
		errString = "";
	}

	public Result(int result, String errString)
	{
		this.result 	= result;
		this.errString 	= errString;
	}
	
	public int getResult()
	{
		return result;
	}
	
	public String getErrString()
	{
		return errString;
	}
	
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		str.append("result:" + ", errString:" + errString);
		return str.toString();
	}

}
