package utilitys;

import java.time.Duration;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class SiteUtility {
	
	
	public FluentWait<RemoteWebDriver> defineWait
    (RemoteWebDriver driver, int max, long interval) 
{
FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
wait.withTimeout(Duration.ofSeconds(max));
wait.pollingEvery(Duration.ofMillis(interval));
return(wait);
}


}
