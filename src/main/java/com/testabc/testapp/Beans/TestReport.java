package com.testabc.testapp.Beans;

public class TestReport {
	private PreRunInfo preRunInfo;
	private String starTime;
	private String endTime;
	private long timeDiff;
	public PreRunInfo getPreRunInfo() {
		return preRunInfo;
	}
	public void setPreRunInfo(PreRunInfo preRunInfo) {
		this.preRunInfo = preRunInfo;
	}
	public String getStarTime() {
		return starTime;
	}
	public void setStarTime(String starTime) {
		this.starTime = starTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public long getTimeDiff() {
		return timeDiff;
	}
	public void setTimeDiff(long timeDiff) {
		this.timeDiff = timeDiff;
	}
	
}
