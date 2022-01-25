import org.junit.Assert;
import org.junit.Test;
import pageObjects.ValidateResponse;
import pageObjects.VerifyStatus;
import utils.Enumerations;

public class Unittests {
    private final String TESTURL = Enumerations.URL.MOVIES.getUrl();
    private final String API_KEY = Enumerations.URL.KEY.getUrl();
    VerifyStatus verifyStatus = new VerifyStatus();
    ValidateResponse validateResponse = new ValidateResponse();


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
        verifyStatus.getRestTest(TESTURL+"?t=test"+"&y="+2021,200,API_KEY);
    }

    @Test
    public void apiCallStatusCodeNOK() {
        verifyStatus.getRestTest(TESTURL+"bla"+"&y="+2021,400,API_KEY);
    }

    @Test
    public void apiCallValidateResponse() {
        validateResponse.getRestTest(TESTURL+"?t=test"+"&y="+2021, "The Beta Test", API_KEY);
    }
}
