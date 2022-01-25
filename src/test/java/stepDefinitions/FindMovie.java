package stepDefinitions;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pageObjects.ApiCall;
import utils.Enumerations;

public class FindMovie extends Enumerations{

    public String TESTURL = URL.MOVIES.getUrl();
    public String API_KEY = URL.KEY.getUrl();

    @Steps
    ApiCall apiCall = new ApiCall();

    @When("I search by a word {string} and year {int} statuscode is {int}")
    public void iSearchByAWord(String parameter, int year, int statuscode) {
        apiCall.getRestStatus(TESTURL+parameter+"&y="+year,statuscode,API_KEY);
    }

    @When("I search by a word {string} and year {int} validate {string} in response")
    public void iSearchByAWordAndYearValidateInResponse(String parameter, int year, String value) {
        apiCall.getRestTestResponse(TESTURL+parameter+"&y="+year, value, API_KEY);
    }
}
