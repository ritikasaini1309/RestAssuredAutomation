import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ClarifaiMultipleImages {
  @Test()
  public void MultipleImages() {
	  
	  RestAssured.baseURI = "http://34.225.121.104/v2/models/";
	  Response httpRequest = RestAssured.given().header("Authorization", "Key 10939244cc2a4c30bd0ab9b74a28c303").
				header("Content-Type","application/json").body("{\n" + 
						"    \"inputs\": [\n" + 
						"      {\n" + 
						"        \"data\": {\n" + 
						"          \"image\": {\n" + 
						"            \"url\": \"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQC2NcenPNzEc1kH_EygaKq4Kbv4cB_h-B1DgIB2DJ2NjLABy7X\"\n" + 
						"          }\n" + 
						"        }\n" + 
						"      }\n" + 
						"    ]\n" + 
						"  }").when().post("d16f390eb32cad478c7ae150069bd2c6/outputs");
				System.out.println(httpRequest.body().asString());
		
}
}