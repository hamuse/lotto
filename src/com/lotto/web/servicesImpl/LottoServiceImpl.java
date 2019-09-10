package com.lotto.web.servicesImpl;

import java.util.Random;

import com.lotto.web.daoImpls.LottoDaoImpl;
import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService {
	private LottoDAO dao;

	public LottoServiceImpl() {
		dao = new LottoDaoImpl();
	}

	@Override
	public void createLotto(LottoBean param) {
		param.setBall(createBall());
		param.setLotteryNum(createLotteryNum());
		param.setLottoSeq(createLottoSeq());
		dao.insetLotto(param);
	}

	@Override
	public String createLottoSeq() {
		Random r = new Random();
		String seq = "No.";
		for (int i = 0; i < 4; i++) {
			seq += r.nextInt(10);
		}
		System.out.println("생성된 시퀀스값: " + seq);
		return seq;
	}

	@Override
	public int createBall() {

		return (int) (Math.random() *45)+1;

	}

	@Override
	public String createLotteryNum() {
		String reg = "";
		Random ran = new Random();

		int[] arr = new int[6];

		for (int i = 0; i < 6; i++) {
			int a = ran.nextInt(45) + 1;
			if (duplicatePrevention(arr, a)) {
				arr[i] = a;
			} else {
				i--;
			}
		}
		arr = bubbleSort(arr, true);
		for (int i = 0; i < arr.length; i++) {
			reg +=arr[i] + ",";
		}


		return reg;
	}

	@Override
	public boolean duplicatePrevention(int[] arr, int a) { // arr 안에 a가 중복이 아닐때
		boolean flag = true;
		for (int i = 0; i < 6; i++) {
			if (arr[i] == a) {
				flag = false;

			} else {
				flag = true;
			}
		}

		return flag;
	}

	@Override
	public int[] bubbleSort(int[] arr,boolean flag) { // 오름차순정렬
		int t = 0;
		for(int k =0; k < arr.length; k++)	{
		for (int i = 0; i < arr.length - 1; i++) {
			if(flag) {
			if (arr[i] > arr[i + 1]) {
				t = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = t;
			}
			}else {
				if (arr[i] <arr[i + 1]) {
					t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}
			}
		}
		}
		return arr;
	}
	}
