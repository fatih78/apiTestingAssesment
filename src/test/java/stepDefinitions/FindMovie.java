package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import net.thucydides.core.annotations.Steps;
import pageObjects.ApiCall;
import utils.Enumerations;

public class FindMovie extends Enumerations {

    protected final String TESTURL = URL.MOVIES.getUrl();
    protected final String API_KEY = URL.KEY.getUrl();
    protected final String RESPONSE = "{\"Title\":\"Test\",\"Year\":\"2013\",\"Rated\":\"TV-MA\",\"Released\":\"04 Apr 2014\",\"Runtime\":\"89 min\",\"Genre\":\"Drama, History, Romance\",\"Director\":\"Chris Mason Johnson\",\"Writer\":\"Chris Mason Johnson\",\"Actors\":\"Scott Marlowe, Matthew Risch, Evan Boomer\",\"Plot\":\"In 1985, a gay dance understudy hopes for his on-stage chance while fearing the growing AIDS epidemic.\",\"Language\":\"English, Portuguese, French\",\"Country\":\"United States\",\"Awards\":\"3 wins & 3 nominations\",\"Poster\":\"https://m.media-amazon.com/images/M/MV5BMTQwMDU5NDkxNF5BMl5BanBnXkFtZTcwMjk5OTk4OQ@@._V1_SX300.jpg\",\"Ratings\":[{\"Source\":\"Internet Movie Database\",\"Value\":\"6.5/10\"},{\"Source\":\"Rotten Tomatoes\",\"Value\":\"82%\"},{\"Source\":\"Metacritic\",\"Value\":\"70/100\"}],\"Metascore\":\"70\",\"imdbRating\":\"6.5\",\"imdbVotes\":\"1,591\",\"imdbID\":\"tt2407380\",\"Type\":\"movie\",\"DVD\":\"06 Jun 2014\",\"BoxOffice\":\"$18,823\",\"Production\":\"N/A\",\"Website\":\"N/A\",\"Response\":\"True\"}";

    @Steps
    ApiCall apiCall = new ApiCall();

    @When("I search by a word {string} and year {int} statuscode is {int}")
    public void iSearchByAWord(String parameter, int year, int statuscode) {
        apiCall.getRestStatus(TESTURL + parameter + "&y=" + year, statuscode, API_KEY);
    }

    @When("I search by a word {string} and year {int} validate {string} in response")
    public void iSearchByAWordAndYearValidateInResponse(String parameter, int year, String value) {
        apiCall.getRestTestResponse(TESTURL + parameter + "&y=" + year, value, API_KEY);
    }

    @Then("scheme validation is correct for url {string}")
    public void schemeValidationIsCorrect(String url) throws IOException {
        apiCall.getRestTestScheme(TESTURL + url, API_KEY, RESPONSE);
    }
}



