package pageObjects;

import org.hamcrest.Matchers;

import static com.jayway.restassured.RestAssured.given;

public class ValidateResponse {
    private final static String API_KEY = "&apikey=9d24961e";

    public void getRestTest(String url, String parameter, String key) {
        given()
                .when()
                .get(url + key)
                .then()
                .log()
                .all()
                .assertThat()
                // Pass parameter
                .body(Matchers.containsString(parameter));

    }
}
