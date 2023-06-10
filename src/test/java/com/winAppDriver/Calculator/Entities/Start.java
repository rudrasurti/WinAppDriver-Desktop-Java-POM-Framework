package com.winAppDriver.Calculator.Entities;

import com.winAppDriver.Calculator.Pages.StandardPage;

public class Start {
    
    private static StandardPage standardPage = new StandardPage();

    public static StandardPage GoToStandardPage() {
        return standardPage.StartStandardPage();
    }

}