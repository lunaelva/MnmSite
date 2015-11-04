package com.mnm.site.util;

import com.mnm.site.model.GenderModel;

public class MemberUtil {
	public static GenderModel getValueChange(String param){
		GenderModel result = GenderModel.NONE;
		
		switch(param){
			case "M" : result = GenderModel.MALE;
				break;
			case "F" : result = GenderModel.FEMALE;
				break;
			default : result = GenderModel.NONE;
				
		}
		
		return result;
	}
}
