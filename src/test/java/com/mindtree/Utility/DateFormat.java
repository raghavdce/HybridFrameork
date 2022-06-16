package com.mindtree.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class DateFormat {

	public static String getMonth() {
		
		ReadConfig readConfig = new ReadConfig();
		
		Map<String , String> myMap=new LinkedHashMap<String, String>();
		myMap.put("01", "Jan");
		myMap.put("02", "Feb");
		myMap.put("03", "Mar");
		myMap.put("04", "Apr");
		myMap.put("05", "May");
		myMap.put("06", "Jun");
		myMap.put("07", "Jul");
		myMap.put("08", "Aug");
		myMap.put("09", "Sep");
		myMap.put("10", "Oct");
		myMap.put("11", "Nov");
		myMap.put("12", "Dec");
		
		return (myMap.get(readConfig.getMonth()));
		
		/*//create Date object
	    Date date = new Date();
	    
	     //formatting month in M format like 1,2 etc
	     String strDateFormat = "MMM";
	     SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	     
	     System.out.println("Current Month in M format : " + sdf.format(9));*/

	}

}
