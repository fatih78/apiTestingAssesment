package pageObjects;

import net.thucydides.core.annotations.Step;

public class ApiCall extends Base {
    @Step
    public void getRestStatus(String url, int statuscode, String key) {
        super.getRestTestStatuscode(url, statuscode, key);
    }

    @Step
    public void getRestTestResponse(String url, String parameter, String key) {
        super.getRestTestValidateResponse(url, parameter, key);
    }
}
