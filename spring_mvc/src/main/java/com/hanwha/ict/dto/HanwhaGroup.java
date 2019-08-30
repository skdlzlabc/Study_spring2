package com.hanwha.ict.dto;

import java.util.List;

public class HanwhaGroup {
	
	final static String ENUM_SERVICE = "서비스유화";
	final static String ENUM_MAKE = "제조방산";
	final static String ENUM_FINANCE = "금융";
	
	private List<HanwhaCompany> cmpList;
	
	public List<HanwhaCompany> getCmpList() {
		return cmpList;
	}
	
	public void setCmpList(List<HanwhaCompany> cmpList) {
		this.cmpList = cmpList;
	}
	
	public String getPressAndCount(int num){
		
		StringBuilder sb = new StringBuilder();
		
		int size = cmpList.size();
		String sector;
		
		switch (num) {
		case 1:
			sector = ENUM_SERVICE;
			break;
		case 2:
			sector = ENUM_MAKE;
			break;
		case 3:
			sector= ENUM_FINANCE;
			break;
		default:
			return sb.append("없는 번호 입니다.").toString();
		}
			int total = 0;
		
			for(int i=0; i<size; ++i){
				HanwhaCompany hanwhaCompany = cmpList.get(i);
				if(hanwhaCompany.getCompanySector().equals(sector)){
					sb.append("회사이름 : ")
					.append(hanwhaCompany.getCompanyName())
					.append(" 대표이사 : ")
					.append(hanwhaCompany.getGroupPresident())
					.append("\n");

					total += hanwhaCompany.getCompanyEmployeeCount();
				}		
			}
			
			sb.append("[총 사원수 : ")
			.append(total)
			.append("]\n");
			
		return sb.toString();
	}
}
