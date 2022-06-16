package com.mindtree.Utility;

import java.io.File;

public class RenameAFile {

	public static void main(String[] args) {
	      File oldName = new File("C:\\Raghav\\MOSIP Issue Tracker.csv");
	      File newName = new File("C:\\Raghav\\mava.csv");
	      
	      if(oldName.renameTo(newName)) {
	         System.out.println("renamed");
	      } else {
	         System.out.println("Error");
	      }
	   }

}
