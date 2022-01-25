package pageObjects;

import org.hamcrest.Matchers;

import static com.jayway.restassured.RestAssured.given;


public class Base {
    public void getRestTestStatuscode(String url, int statuscode, String key) {
        given()
                .when()
                .get(url + key)
                .then()
                // Assert response
                .log()
                .all()
                .assertThat()
                .statusCode(statuscode);
    }

    public void getRestTestValidateResponse(String url, String parameter, String key) {
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
