package com.dswan.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

/**
 * Servlet implementation class BootstrapServlet
 */
@WebServlet("/bootstrap")
public class BootstrapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	public void init() {
//		
//	}
	   static AmazonDynamoDBClient dynamoDB;
//	   
//	   BootstrapServlet() throws Exception {
//	        /*
//	         * The ProfileCredentialsProvider will return your [default]
//	         * credential profile by reading from the credentials file located at
//	         * (C:\\Users\\Dillon\\.aws\\credentials).
//	         */
//	        AWSCredentials credentials = null;
//	        try {
//	            credentials = new ProfileCredentialsProvider("default").getCredentials();
//	        } catch (Exception e) {
//	            throw new AmazonClientException(
//	                    "Cannot load the credentials from the credential profiles file. " +
//	                    "Please make sure that your credentials file is at the correct " +
//	                    "location (C:\\Users\\Dillon\\.aws\\credentials), and is in valid format.",
//	                    e);
//	        }
//	        dynamoDB = new AmazonDynamoDBClient(credentials);
//	        Region usWest2 = Region.getRegion(Regions.US_WEST_1);
//	        dynamoDB.setRegion(usWest2);
//	    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String accountId = request.getParameter("id");
		out.println(accountId);
		
		
//		String tableName = "Accounts";
//		
//		 // Scan for particular accountId
//        HashMap<String, Condition> scanFilter = new HashMap<String, Condition>();
//        Condition condition = new Condition()
//            .withComparisonOperator(ComparisonOperator.EQ.toString())
//            .withAttributeValueList(new AttributeValue().withN("10555334"));
//        scanFilter.put("accountId", condition);
//        ScanRequest scanRequest = new ScanRequest(tableName).withScanFilter(scanFilter);
//        ScanResult scanResult = dynamoDB.scan(scanRequest);
//        System.out.println("Result: " + scanResult);
	}
}
