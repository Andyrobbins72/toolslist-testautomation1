package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {
    //messages - could have used text but this is what we are potentially testing
    private By successfulLoginmessage = By.xpath(".//body/div[@class = 'container']/p/b");

}
