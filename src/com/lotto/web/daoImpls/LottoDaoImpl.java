package com.lotto.web.daoImpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.lotto.web.daos.LottoDAO;
import com.lotto.web.domains.LottoBean;

public class LottoDaoImpl implements LottoDAO{
	public static final String FILE_PATH= String.format("C:%sUsers%suser%seclipse-jee%sjee-lotto%sWebContent%sresources%stxt%s",
															File.separator,
															File.separator,
															File.separator,
															File.separator,
															File.separator,
															File.separator,
															File.separator,
															File.separator);  

	@Override
	public void insetLotto(LottoBean param) {
		try {
			File file = new File(FILE_PATH+"lotto2.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			System.out.println(param.getLottoSeq()+"/"+ param.getLotteryNum());
			writer.write(param.getLottoSeq()+"/"+ param.getLotteryNum());
			writer.newLine();
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
