package com.mindtree.BaseClass;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC0001_Adv_Post_DataFromXL {

	@Test(dataProvider = "data")
	public void createEmpl(String ename, String esalary, String eage) {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject myObj = new JSONObject();
		myObj.put("name", ename);
		myObj.put("salary", esalary);
		myObj.put("age", eage);

		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(myObj.toJSONString());
		Response response = httpRequest.request(Method.POST, "/create");

		String responseBody = response.getBody().asString();
		System.out.println("The Response body is :" + responseBody);
		
		//System.out.println("THE RESPONSE IS : "+responseBody.contains(ename));

		Assert.assertEquals(true, responseBody.contains(ename));
		Assert.assertEquals(true, responseBody.contains(esalary));
		Assert.assertEquals(true, responseBody.contains(eage));

	}

	@DataProvider(name = "data")
	public String[][] passData() throws IOException {

		String path = "C:\\Raghav\\201-training\\RestAsured\\RestAssuredAPI\\src\\test\\java\\com\\mindtree\\RestAssured\\ReadinFromxl\\TestData.xlsx";
		//String path1 = System.getProperty("user.dir")+"\\src\\test\\java\\com\\mindtree\\RestAssured\\ReadinFromxl\\TestData.xlsx";
		int row = XLUtils.getRowCount(path, "Sheet1");
		int col = XLUtils.getCellCount(path, "Sheet1", 1);
		String empData[][] = new String[row][col];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {

				empData[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);

			}

		}
		return (empData);

	}

}
