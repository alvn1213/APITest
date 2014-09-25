package com.testabc.testapp.Beans;

public class PreRunInfo {
	private String product;
	private String executeType; // BVT,SVT,FVT
	private String prodVersion;
	private String testEnv;    // Dev,Test,Prod
	private String executor;
	private boolean debug;
	
	public boolean isDebug() {
		return debug;
	}
	public void setDebug(boolean debug) {
		this.debug = debug;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getExecuteType() {
		return executeType;
	}
	public void setExecuteType(String executeType) {
		this.executeType = executeType;
	}
	public String getProdVersion() {
		return prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}
	public String getTestEnv() {
		return testEnv;
	}
	public void setTestEnv(String testEnv) {
		this.testEnv = testEnv;
	}
	public String getExecutor() {
		return executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
	}   
	

}
