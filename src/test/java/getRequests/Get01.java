package getRequests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Get01 {
    /*
  Given
      https://petstore.swagger.io/v2/pet/12
  When
      User sends a GET Request to the url
  Then
      HTTP Status Code should be 200
  And
      Content Type should be JSON
  And
      Status Line should be HTTP/1.1 200 OK
*/
    public static void main(String[] args) {
        //set url
        String url ="https://petstore.swagger.io/v2/pet/12";

        //set expected data

        //send request
        Response response = given().when().get(url);
        response.prettyPrint();

        // do assertion

        // http status code should be 200
        if (response.statusCode()==200){
            System.out.println("test passed");
        }else {
            System.out.println("failed");
        }

        if (response.contentType().equals("application/json")){
            System.out.println("test passed");
        }else {
            System.out.println("failed");
        }
        if (response.statusLine().equals("HTTP/1.1 200 OK")){
            System.out.println("test passed");
        }else {
            System.out.println("failed");
        }
    }

}
