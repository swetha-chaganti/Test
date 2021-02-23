package StepD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;

import Base.testBase;
import Enums.browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	testBase Base;

	Logger log = Logger.getLogger(Hooks.class);
	@Before
	public void initializeTest() {
		Base = new testBase();
		testBase.selectBrowser(browsers.CHROME.name());
	}
	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				log.info(scenario.getName() + " is Failed");
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} else {
			try {
				log.info(scenario.getName() + " is pass");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		testBase.driver.quit();
	}
}

