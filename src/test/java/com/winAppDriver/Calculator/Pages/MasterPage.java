package com.winAppDriver.Calculator.Pages;

import com.winAppDriver.Calculator.PageObjects.StandardPageObjects;
import com.winAppDriver.automation.core.PageBase;

public class MasterPage extends PageBase {

    public StandardPageObjects homePageObjects = new StandardPageObjects();

    public StandardPage GetStandardPage() {
        StandardPage page = new StandardPage();
        // Action.waitUntilPageLoad(page)
        return page;
    }
    
}