package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
public int initalCount = 0;
public int maxRetryCount = 2;

@Override
    public boolean retry(ITestResult result)
{
    if(initalCount < maxRetryCount)
    {
        initalCount++;
        return true;
    }
    return false;
}



}