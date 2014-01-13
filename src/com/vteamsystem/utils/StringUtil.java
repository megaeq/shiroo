package com.vteamsystem.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

	public final static String	PATTERN_COMMON_DATE	= "yyyy/MM/dd HH:MM:ss";

	public static String nowToString(String pattern) {
		String date = null;
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		date = format.format(new Date());
		return date;
	}

	public static boolean isStringEmpty(String str) {
		if (str == null || str.equals("")) {
			return true;
		} else if (str.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}

}
