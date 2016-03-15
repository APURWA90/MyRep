package com.fastudent.competition;

import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import com.fastudent.base.TestBase;
import com.fastudent.util.TestUtil;

public class TestSuiteBase extends TestBase{
    // check if the suite ex has to be skiped
	@BeforeSuite
	public void checkSuiteSkip() throws Exception{
		initialize();
		APP_LOGS.debug("Checking Runmode of Competition");
		if(!TestUtil.isSuiteRunnable(suiteXls, "Competition")){
			APP_LOGS.debug("Skipped Shop Suite as the runmode was set to NO");
			throw new SkipException("RUnmode of Shop Suite set to no. So Skipping all tests in Suite A");
		}
		
	}
}
