package com.pms.dao;

import java.util.List;

import com.pms.model.ResColumnClassify;

public interface ResColumnClassifyDAO {
	
	public ResColumnClassify ResColumnClassifySave(ResColumnClassify cc) throws Exception;

	List<ResColumnClassify> QueryColumnClassify(String dataSet)
			throws Exception;
	
}
