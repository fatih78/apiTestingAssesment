package pageObjects;

import java.io.InputStream;
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
                .body(Matchers.containsString(parameter));
    }

    public void getRestSchemeValidation(String url, String key, String response) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("responseBody.txt");
        given()
                .get(url + key)
                .then()
                .assertThat()
                .body(Matchers.equalTo(response));
    }
}
