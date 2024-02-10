package com.Methods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class rest_Assured {
	
	private void Basic_methods() {
		RestAssured.baseURI = "https://api.github.com";
		String token = "";
		
		Response response = RestAssured
				.given()
				.headers("Authorization","Bearer "+token)
				.when()
				.get()"users/BhavaAnu/repos"
				
				
				
				
		
	}

}
