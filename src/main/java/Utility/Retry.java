package Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer
{
	int retry_count=1;
	@Override
	public boolean retry(ITestResult result) 
	{
		int maxretry_count=2;
		if(retry_count<maxretry_count)
		{
			retry_count++;
			return true;  //go and retry
		}
		return false;
	}
	
}
