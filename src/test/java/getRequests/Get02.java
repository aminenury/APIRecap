package getRequests;

import base_urls.PetStoreBaseUrl;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class Get02 extends PetStoreBaseUrl {
    //Print all "available" pets on console by using"https://petstore.swagger.io/" documentation
    /*
    Given
       https://petstore.swagger.io/v2/pet/findByStatus?status=available
     When
        User sends Get request to url
     Then
        HTTP status code should be 200
     And
        Print all "avaiable" pets on console
     */
    @Test
    public void get02(){
      spec.pathParams("first","pet","second","findByStatus").queryParams("status","available");

        Response response = given().spec(spec).when().get();
        response.prettyPrint();

        response.then().assertThat().statusCode(200);
    }
}
