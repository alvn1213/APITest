package com.testabc.testapp.Beans;

public class TestCaseResult {
	private String apiName;
	private String testCaseID;
	private String passFail;
	private String errorMsg;
	private String message;
	private String group;
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getTestCaseID() {
		return testCaseID;
	}
	public void setTestCaseID(String testCaseID) {
		this.testCaseID = testCaseID;
	}
	public String getPassFail() {
		return passFail;
	}
	public void setPassFail(String passFail) {
		this.passFail = passFail;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
