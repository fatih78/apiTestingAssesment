import org.junit.Assert;
import org.junit.Test;
import pageObjects.ApiCall;
import utils.Enumerations;

public class Unittests {
    private final String TESTURL = Enumerations.URL.MOVIES.getUrl();
    private final String API_KEY = Enumerations.URL.KEY.getUrl();
    ApiCall apiCall = new ApiCall();


    @Test
    public void url() {
        Assert.assertEquals("http://www.omdbapi.com/", this.TESTURL);
    }

    @Test
    public void api_key() {
        Assert.assertEquals("&apikey=9d24961e", this.API_KEY);
    }

    @Test
    public void apiCallStatusCodeOK() {
        apiCall.getRestStatus(TESTURL+"?t=test"+"&y="+2021,200,API_KEY);
    }

    @Test
    public void apiCallStatusCodeNOK() {
        apiCall.getRestStatus(TESTURL+"bla"+"&y="+2021,400,API_KEY);
    }

    @Test
    public void apiCallValidateResponse() {
        apiCall.getRestTestResponse(TESTURL+"?t=test"+"&y="+2021, "The Beta Test", API_KEY);
    }
}
