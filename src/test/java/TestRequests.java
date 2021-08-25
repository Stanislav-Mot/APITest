import dataBase.DataBaseForTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import utils.Specification;

import static body.Body.getBody;
import static endPoints.EndPoints.*;
import static io.restassured.RestAssured.given;
import static methodsForConsole.Methods.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestRequests {

    @Test
    public void getTest() {
        Response response = given()
                .spec(Specification.getSpecification())
                .when()
                .get(INVENTORY);

        String body = getResult(response);
        int sold = getSold(body);

        //Assertions.assertEquals(sold, DataBaseForTest.SOLD, "This is different");
    }

    @Test
    public void postTest() {
        Response response = given()
                .spec(Specification.getSpecification())
                .when()
                .body(getBody())
                .post(TOKEN);

        String body = getResult(response);
        long id = getId(body);

      //  Assertions.assertTrue(id == DataBaseForTest.ID, "This is different");

    }

    @Test
    public void putTest() {
        Response response = given()
                .spec(Specification.getSpecification())
                .when()
                .body(getBody())
                .put(PET);

        String body = getResult(response);
        long id = getId(body);

       // Assertions.assertEquals(id, DataBaseForTest.ID, "This is different");
    }

    @Test
    public void deleteTest() {
        Response response = given()
                .spec(Specification.getSpecification())
                .when()
                .delete(DELETE);

        getResult(response);
    }
}

