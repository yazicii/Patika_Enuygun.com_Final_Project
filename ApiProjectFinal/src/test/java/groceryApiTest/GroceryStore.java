package groceryApiTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GroceryStore {
    Response response;
    String baseURI = "http://demo4689844.mockable.io/";

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 200 when we get Grocery Request of all product info")
    public void getAllGrocery() {
        response = given().header("Content-Type", "application/json; charset=UTF-8")
                .get(baseURI+"allGrocery")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 200 when we get Grocery Request of apple product info")
    public void getAllGroceryName() {
        response = given().header("Content-Type","application/json; charset=UTF-8")
                .get(baseURI+"apple")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response();
        Assert.assertEquals(response.getStatusCode(),200);

    }


    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that status code is 201 when we post Grocery Request of banana product info")
    public void postAddGrocery(){
        JSONObject request = new JSONObject();
        request.put("id",4);
        request.put("name","banana");
        request.put("price",12.3);
        request.put("stock",100);
        response=given().contentType(ContentType.JSON)
                .header("Content-Type","application/json")
                .body(request.toString())
                .when()
                .post("http://demo4689844.mockable.io/imademethink_post")
                .then()
                .log().all()
                .statusCode(201)
                .extract().response();

        Assert.assertEquals(response.getStatusCode(),201);
    }
}
