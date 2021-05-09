package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "C:\\Users\\User\\Desktop\\eclipse\\NovBDDproject\\src\\main\\java\\feature",
					glue = "step_definition",
					plugin = {"pretty", "html:target/DemoTours-reports", "json:target/DemoTours-report-json"},
					monochrome = true
		)

public class Runner {

}
