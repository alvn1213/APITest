package com.testabc.testapp.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
 	/**
	   * checkStrNotNullBlank
	   * @param strData
	   * @return true/false
	   */
	public static boolean checkStrNotNullBlank(String strData){
		if(strData==null){
			return false;
		}else{
			if(strData.isEmpty()==true){
				return false;
			}else{
				return true;
			}
		}
	}
	/**
	   * checkStrNullBlank
	   * @param strData
	   * @return true/false
	   */
	public static boolean checkStrNullBlank(String strData){
		if(strData==null){
			return true;
		}else{
			if(strData.isEmpty()==true){
				return true;
			}else{
				return false;
			}
		}
	}
  /** Convert String to integer **/
  public static int convertStrToInt(String strNum) {
      int intResult = 0;
      try {
          intResult = Integer.valueOf(strNum);
      } catch (Exception e) {
      }
      return intResult;
  }
	/**
	   * get current datetime
	   * 
	   * @return current date (String format ->yyyy/MM/dd HH:mm:ss)
	   */
	public static String currentTime(){
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").format(new Date() );
	}
	/**
	   * get time diff
	   * @param starTime
	   * @param endTime
	   * @return long milliseconds
	   * 
	   * @return current date (String format ->yyyy/MM/dd HH:mm:ss)
	   */
	public static long timeDiff(String startTime,String endTime) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		try {
			Date d1 = format.parse(startTime);
			Date d2 = format.parse(endTime);
			long diff = d2.getTime() - d1.getTime(); 
			return diff;
		} catch (Exception e) {
			return 0;
		}

	}
}
