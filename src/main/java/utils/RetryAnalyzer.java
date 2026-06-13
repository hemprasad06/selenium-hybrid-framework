package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 2;

    @Override
    public boolean retry(ITestResult result) {

        if (retryCount < maxRetryCount) {

            retryCount++;

            System.out.println(
                    "Retrying Test: "
                            + result.getName()
                            + " Attempt: "
                            + retryCount);

            String screenshotPath =
                    ScreenshotUtil.captureScreenshot(
                            result.getName());

            System.out.println(
                    "Screenshot Captured: "
                            + screenshotPath);

            if (retryCount == 2) {

                try {

                    System.out.println(
                            "Applying extended wait before second retry");

                    Thread.sleep(5000);

                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }

            return true;
        }

        return false;
    }
}