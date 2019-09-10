package com.lotto.web.controllers;

import java.util.Random;

public class Controller {

	public static void main(String[] args) {
		String hakbun = "";
		String flag = "2019-";
		String ssn ="8909042555555";
		String num = ssn.substring(6,7);
		Random ran = new Random(10);
		int rnum = ran.nextInt(999)+1;
		
		
		hakbun = flag+num+rnum;
		System.out.println(hakbun);
}
}
