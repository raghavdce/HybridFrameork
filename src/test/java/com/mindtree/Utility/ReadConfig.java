package com.mindtree.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {

		try {
			FileInputStream src = new FileInputStream(
					System.getProperty("user.dir") + "//ReadConfig//TestData.properties");
			prop = new Properties();
			prop.load(src);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getDriverPath() {
		String driverpath = prop.getProperty("chromePath");
		return driverpath;
	}
	
	public String getBaseURL() {
		String url = prop.getProperty("pre-regURL");
		return url;
	}
	
	public String getUsername() {
		String name1 = prop.getProperty("username");
		return name1;
	}
	
	public String getPrimaryName() {
		String primaryFullName = prop.getProperty("PrimaryName");
		return primaryFullName;
	}
	
	public String getDate() {
		String primaryDate = prop.getProperty("dd");
		return primaryDate;
	}
	
	public String getMonth() {
		String primaryMonth = prop.getProperty("mm");
		return primaryMonth;
	}
	
	public String getYear() {
		String primaryYear = prop.getProperty("yy");
		return primaryYear;
	}
	
	public String getPrimaryAdd1() {
		String primaryAdd1 = prop.getProperty("PrimaryAdd1");
		return primaryAdd1;
	}
	
	public String getPrimaryAdd2() {
		String primaryAdd2 = prop.getProperty("PrimaryAdd2");
		return primaryAdd2;
	}
	
	public String getPrimaryAdd3() {
		String primaryAdd3 = prop.getProperty("PrimaryAdd3");
		return primaryAdd3;
	}
	
	public String getPostCode() {
		String primaryPost = prop.getProperty("PostalCode");
		return primaryPost;
	}
	
	public String getMobile() {
		String primaryMobile = prop.getProperty("Mobile");
		return primaryMobile;
	}
	
	public String getEmail() {
		String primaryEmail = prop.getProperty("Email");
		return primaryEmail;
	}
	
	public String getReference() {
		String primaryReference = prop.getProperty("ReferenceNum");
		return primaryReference;
	}
	
	public String getGender() {
		String gender = prop.getProperty("Gender");
		return gender;
	}
	
	public String getResident() {
		String resident = prop.getProperty("Resident");
		return resident;
	}
	
	public String getRegion() {
		String region = prop.getProperty("Region");
		return region;
	}
	
	public String getProvince() {
		String province = prop.getProperty("Province");
		return province;
	}
	
	public String getCity() {
		String city = prop.getProperty("City");
		return city;
	}
	
	public String getZone() {
		String zone = prop.getProperty("Zone");
		return zone;
	}
	
	public String getCountryForCenter() {
		String country = prop.getProperty("Country");
		return country;
	}
	
	public String getAppointmentDate() {
		String date = prop.getProperty("AppointmentDate");
		return date;
	}
	
	public String setEmail1() {
		String email1 = prop.getProperty("AckEmail1");
		return email1;
	}
	
	/*public String getEmail2() {
		String email2 = prop.getProperty("AckEmail2");
		return email2;
	}
	
	public String getEmail3() {
		String email3 = prop.getProperty("AckEmail3");
		return email3;
	}
	
	public String getEmail4() {
		String email4 = prop.getProperty("AckEmail4");
		return email4;
	}
	
	public String getEmail5() {
		String email5 = prop.getProperty("AckEmail5");
		return email5;
	}*/
	
	public String setSMS1() {
		String sms1 = prop.getProperty("SMS1");
		return sms1;
	}
	
	public String getExpiredPrid() {
		String status = prop.getProperty("expiredPRID");
		return status;
	}
	
	public String getBookedPrid() {
		String status = prop.getProperty("bookedPRID");
		return status;
	}

}
