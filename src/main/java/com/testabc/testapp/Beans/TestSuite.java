package com.testabc.testapp.Beans;

import java.util.List;

public class TestSuite {
	private Package pakcage;
	private List<TestGroup> testGroups;
	public Package getPakcage() {
		return pakcage;
	}
	public void setPakcage(Package pakcage) {
		this.pakcage = pakcage;
	}
	public List<TestGroup> getTestGroups() {
		return testGroups;
	}
	public void setTestGroups(List<TestGroup> testGroups) {
		this.testGroups = testGroups;
	}
	
}
