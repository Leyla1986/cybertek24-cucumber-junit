package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    /**
     * parent class for concrete Page obj classes
     * provide constructor with initElements method for reusability
     * abstract - to prevent instantiation.Make test code more
     */
        public BasePage() {
            PageFactory.initElements(Driver.getDriver(), this);


    }
}

