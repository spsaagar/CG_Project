package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features= {".//Features/"},
                //features= {".//Features/Register.feature"},
        		//features= {".//Features/login.feature"},
        		  features= {".//Features/AddProductToCart.feature"},
                //features="@target/rerun.txt",   // Runs only failures
                glue="stepDefinitions",
                plugin= {"pretty",
                        "html:reports/myreport.html",
                        "json:reports/myreport.json",
                        "rerun:target/rerun.txt",    //Mandatory to capture failures
                },
                dryRun=false,
                monochrome=true,
                tags = "@sanity"	//Scenarios tagged with @sanity,

        )

public class TestRunner {

}

