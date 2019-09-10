package com.lotto.web.domains;

import java.io.Serializable;

public class LottoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String lottoSeq , lotteryNum;
	private int ball;
	public String getLottoSeq() {
		return lottoSeq;
	}

	public void setLottoSeq(String lottoSeq) {
		this.lottoSeq = lottoSeq;
	}

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}

	public String getLotteryNum() {
		return lotteryNum;
	}

	public void setLotteryNum(String lotteryNum) {
		this.lotteryNum = lotteryNum;
	}

	@Override
	public String toString() {
		return "�ζ�  [�ζ��Ϸù�ȣ=" + lottoSeq + ", ����ȣ=" + ball + ", �ζǹ�ȣ=" + lotteryNum + "]";
	}
	
	
}
