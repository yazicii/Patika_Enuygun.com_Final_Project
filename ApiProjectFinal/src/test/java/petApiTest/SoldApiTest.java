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

public class SoldApiTest extends BaseTest {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 200 when we get restapiPetFindByStatusSold of all pet info")
    public void restapiPetFindByStatusSold() {
        response = given().header("Content-Type", "application/json")
                .when()
                .get(baseURI + "pet/findByStatus?status=sold")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 200 when we post statusSoldPostRequest of status=sold info")
    public void statusSoldPostRequest() throws IllegalStateException{
        model = new JSONObject();
        model.put("name",name);
        model.put("id",id);
        model.put("status","sold");
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
    @Description("Verify that status code is 200 when we get afterSoldPostGetSpecificRequest of id pet info")
    public void afterSoldPostGetSpecificRequest() {
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
    @Description("Verify that status code is 200 when we delete afterSoldPostDeleteSpecificRequest of id pet report")
    public void afterSoldPostDeleteSpecificRequest() {
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

