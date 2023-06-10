package com.winAppDriver.Calculator.Tests;

import org.testng.annotations.Test;

import com.winAppDriver.Calculator.Entities.Start;
import com.winAppDriver.automation.core.TestBase;

public class StandardPageTests extends TestBase {
    
    @Test(  description = "Add 2 numbers",
            groups = {"ORTTest"} )
    public void testAdditionOperation() throws InterruptedException {
        // System.out.println("ADD");
        Start
            .GoToStandardPage()
            .VerifyAddOperation();
    }

    @Test(  description = "Subtract 2 numbers",
            groups = {"ORTTest"} )
    public void testSubtractionOperation() throws InterruptedException {
        // System.out.println("ADD");
        Start
            .GoToStandardPage()
            .VerifySubtractOperation();
    }

}