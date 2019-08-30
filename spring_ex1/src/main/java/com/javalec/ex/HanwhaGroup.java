package com.javalec.ex;

import java.util.List;

public class HanwhaGroup {
	private List<HanwhaCompany> hanwhaCompanyList;

	public List<HanwhaCompany> getHanwhaCompanyList() {
		return hanwhaCompanyList;
	}

	public void setHanwhaCompanyList(List<HanwhaCompany> hanwhaCompanyList) {
		this.hanwhaCompanyList = hanwhaCompanyList;
	}

	public String printAll(int num) {
		String str = ">>" + String.format("%7s", hanwhaCompanyList.get(num * 2).getCompanySector());
		// 0,1,2
		// 01,23,45
		int tmpSum = 0;
		for (int i = num * 2; i <= num * 2 + 1; i++) {
			str += String.format("%15s", (i + 1) + "." + hanwhaCompanyList.get(i).getCompanyName()) + ":"
					+ hanwhaCompanyList.get(i).getCompanyEmployeeCount() + " ";
			tmpSum += hanwhaCompanyList.get(i).getCompanyEmployeeCount();
		}
		str += String.format("%16s", "사업부별 인원수 합계: " + tmpSum); // 사업부별 인원수 합계
		return str;
	}
}
