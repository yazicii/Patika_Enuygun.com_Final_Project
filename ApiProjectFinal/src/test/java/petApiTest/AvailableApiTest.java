package petApiTest;
import BasePage.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class AvailableApiTest extends BaseTest {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 200 when we get restapiPetFindByStatusAvailable of all pet info")
    public void restapiPetFindByStatusAvailable() {
        response = given().header("Content-Type", "application/json")
                .when()
                .get(baseURI + "pet/findByStatus?status=available")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 200 when we post statusAvailablePostRequest of status=available info")
    public void statusAvailablePostRequest() throws IllegalStateException{
        model = new JSONObject();
        model.put("name",name);
        model.put("id",id);
        model.put("status","available");
        response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(model.toJSONString())
                .log().all()
                .when()
                .post("pet");
        response
                .then()
                .log()
                .all()
                .statusCode(200);
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    //.body("[2].id",equalTo(9223372036854032000))
    @Test(priority = 3 )
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 200 when we get afterAvailablePostGetSpecificRequest of id pet info")
    public void afterAvailablePostGetSpecificRequest() {
        response = given().header("Content-Type", "application/json")
                .when()
                .get(baseURI + "pet/"+id)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
    }



    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 200 when we delete afterAvailablePostDeleteSpecificRequest of id pet info")
    public void afterAvailablePostDeleteSpecificRequest() {
        response = given().header("Content-Type", "application/json")
                .when()
                .delete(baseURI + "pet/"+id)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);

    }


}
