package utils;

import org.testng.IRetryAnalyzer;

public class RetryAnalyzer implements IRetryAnalyzer
{
public int intitalCount = 0;
public int maxRetryCount = 2;

@override
    public boolean retry(ITestResult result)
{
    if(intitalCount < maxRetryCount)
    {
        intitalCount++;
        return true;
    }
}
return false;


}