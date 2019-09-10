package com.lotto.web.servicesImpl;

import java.util.Random;

import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoImplEx implements LottoService{

	@Override
	public void createLotto(LottoBean param) {
		param.setBall(createBall());
		param.setLotteryNum(createLotteryNum());
		param.setLottoSeq(createLottoSeq());
	}

	@Override
	public String createLottoSeq() {//일련번호 4자리 NO.XXXX
		String flag = "";
		int a = 0;
		Random ran = new Random();
		for(int i = 0; i < 4; i ++) {
			a += ran.nextInt(999)+1;
		}
		flag = "No."+a;
		return flag;
	}

	@Override
	public int createBall() {//볼 숫자
		int flag =0;
	//	Random ran = new Random();
	//	 flag = ran.nextInt(45)+1;
		flag = (int) (Math.random()*45)+1;
		return flag;
	}

	@Override
	public String createLotteryNum() { //로또 
		String flag = "";
		int a =  0;
		int[] arr = new int[6];
		for(int i =0; i <arr.length ; i++) {
			a = createBall();
			if(!duplicatePrevention( arr, a)) {
				arr[i] = a;
				
			}else {
				i--;
			}
		}
		
		
		return flag;
	}

	@Override
	public boolean duplicatePrevention(int[] arr, int a) { //중복체크
		boolean flag = false;
		for(int i =0; i< 6; i++) {
			if(a == arr[i]) {
				flag = true;
			}else{
				flag = false;
			}
		}
		
		
		return flag;
	}

	@Override
	public int[] bubbleSort(int[] arr, boolean flag) {//오름차순 정렬
		int a = 0; 
		for(int j =0; j<arr.length; j++) {
			for(int i = 0; i< arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
										
				}
			}
		}
		
		return null;
	}

}
