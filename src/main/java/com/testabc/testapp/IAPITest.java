package com.testabc.testapp;

import com.testabc.testapp.Beans.TestResult;

public interface IAPITest {
	public void startRun();
	public void endRun();
	public TestResult showTestReport();
}
