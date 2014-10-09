package com.testabc.testapp;

import org.apache.log4j.Logger;

import com.testabc.testapp.Annotations.Group;
import com.testabc.testapp.Beans.PreRunInfo;
import com.testabc.testapp.Beans.TestResult;
import com.testabc.testapp.Utils.CommonUtils;

public class APITest implements IAPITest {
	private static final Logger logger=Logger.getLogger(APITest.class);
	private PreRunInfo preRunInfo;
	private String xmlPath;
	private TestResult testReport=new TestResult();
	APITest(String xmlPath,PreRunInfo preRunInfo){
		this.xmlPath=xmlPath;
		this.preRunInfo=preRunInfo;
	}
	public void startRun() {
		testReport.setStarTime(CommonUtils.currentTime());// 1. Set Start Time to TestListenser
		
		// 2.Parser XML path 
		// 3. Invoke API by Method with Annotation "Test"
	}
	public void endRun() {
		// 1. Show Test Report 
		TestResult testReport=showTestReport();
		logger.info("Product:"+testReport.getPreRunInfo().getProduct());
		logger.info("StartTime:"+testReport.getStarTime()+"EndTime:"+testReport.getEndTime()+"TimeDiff:"+testReport.getTimeDiff());
		// 3. if XMLPath Setting ,will generate Report

	}

	public TestResult showTestReport() {
		// 2. end Start Time to TestListenser
		testReport.setEndTime(CommonUtils.currentTime());
		long diff=CommonUtils.timeDiff(testReport.getEndTime(), testReport.getEndTime());
		testReport.setTimeDiff(diff);
		return null;		
	}

}
