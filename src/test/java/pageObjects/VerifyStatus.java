package pageObjects;

import static com.jayway.restassured.RestAssured.given;


public class VerifyStatus {

    public void getRestTest(String url, int statuscode, String key) {
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
}
