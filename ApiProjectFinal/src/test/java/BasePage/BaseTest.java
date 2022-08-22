package BasePage;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected Response response;
    protected int id;
    protected String name;
    protected JSONObject model;

    @BeforeTest
    public void setUp() {
        Faker faker = new Faker();
        id = faker.number().randomDigit();
        name = faker.name().username();
        RestAssured.baseURI = "https://petstore.swagger.io/v2/";
    }
}
