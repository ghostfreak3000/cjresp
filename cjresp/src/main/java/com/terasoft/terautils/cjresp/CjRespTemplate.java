package com.terasoft.terautils.cjresp;

import java.util.ArrayList;
import java.util.List;

public class CjRespTemplate {
	public List<CjRespData> data = new ArrayList<CjRespData>();
	
	public void addData(CjRespData data)
	{
		this.data.add(data);
	}
}
