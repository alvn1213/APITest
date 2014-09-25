package com.testabc.testapp;

import com.testabc.testapp.Beans.TestReport;

public interface IAPITest {
	public void startRun();
	public void endRun();
	public TestReport showTestReport();
}
