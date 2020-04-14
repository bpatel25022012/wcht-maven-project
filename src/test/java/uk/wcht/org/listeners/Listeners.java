package uk.wcht.org.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import uk.wcht.org.utility.Utility;

/**
 * Created By Bhavesh
 */
public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("This is on test start " + iTestResult.getName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        String screenshotName = Utility.takeScreenShot(iTestResult.getName());
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        Reporter.log("Click to see screenshot");
        Reporter.log("<a target = \"_blank\" href="+screenshotName+">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target = \"_blank\" href="+screenshotName+"><img src="+screenshotName+" height=200 width=200></img></a>");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("This is on test fail " + iTestResult.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("This is on test skip " + iTestResult.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("This is on  start " + iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("This is on finish "+ iTestContext.getName());
    }
}
