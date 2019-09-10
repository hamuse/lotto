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
		return "고객정보 [아이디=" 	+ cid + ","
									+ " 비밀번호=" + pw +
									", 로또일련번호=" + lottoSeq +
									", 당첨금=" + prizemoney
				+ "]";
	}
      
}
