package com.lotto.web.daoImpls;

import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;

import com.lotto.web.pool.Constants;
import com.lotto.web.daos.ConsumerDAO;
import com.lotto.web.domains.ConsumerBean;

public class ConsumerDaoImpl implements ConsumerDAO {
	public static final String FILE_PATH= String.format("C:%sUsers%suser%seclipse-jee%sjee-lotto%sWebContent%sresources%stxt%s",
																	//C:%sUsers%suser%seclipse-jee%sjee-lotto%sWebContent%sresources%stxt%s"
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator);  
	@Override
	public void insertConsumer(ConsumerBean param) {
		try {
			File file = new File(Constants.FILE_PATH+"consumers.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("%s , %s", param.getCid(),param.getPw()));
			writer.newLine();
			writer.flush();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		try {
			File file = new File(Constants.FILE_PATH+"consumer.txt");
		}catch(Exception e){
			
		}
	}

}
