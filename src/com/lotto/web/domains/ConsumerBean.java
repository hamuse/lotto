package com.lotto.web.domains;

import java.io.Serializable;

public class ConsumerBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cid , pw ,lottoSeq, prizemoney;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getLottoSeq() {
		return lottoSeq;
	}

	public void setLottoSeq(String lottoSeq) {
		this.lottoSeq = lottoSeq;
	}

	public String getPrizemoney() {
		return prizemoney;
	}

	public void setPrizemoney(String prizemoney) {
		this.prizemoney = prizemoney;
	}

	@Override
	public String toString() {
		return "������ [���̵�=" 	+ cid + ","
									+ " ��й�ȣ=" + pw +
									", �ζ��Ϸù�ȣ=" + lottoSeq +
									", ��÷��=" + prizemoney
				+ "]";
	}
      
}
