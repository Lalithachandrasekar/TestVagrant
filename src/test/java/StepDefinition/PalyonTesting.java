package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObjects.TestPalyon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class PalyonTesting {
	WebDriver driver;
	
	private TestPalyon Palyon;
	
	public PalyonTesting() throws IOException{}
			
	
	@When("^Verify whether the team has only 4 foreign players$")
	public void Verify_whether_the_team_has_only_4_foreign_players() throws Throwable {
		Palyon=new TestPalyon(); 
		Palyon.ForeignPlayer();
		
	}
	@When("^Verify whether there is atleast one wicket keeper$")
	public void Verify_whether_there_is_atleast_one_wicket_keeper() throws Throwable {
		Palyon=new TestPalyon(); 
		Palyon.WicketKeeper();
	}
	
}
