package com.terasoft.terautils.cjresp;

import java.util.ArrayList;
import java.util.List;

public class CjRespItem {

	public String href = "";
	public List<CjRespData> data = new ArrayList<CjRespData>();
	public List<CjRespLink> links = new ArrayList<CjRespLink>();
		
	public void addData(CjRespData data)
	{
		this.data.add(data);
	}
	
	public void addLink(CjRespLink link)
	{
		this.links.add(link);
	}
	
}
