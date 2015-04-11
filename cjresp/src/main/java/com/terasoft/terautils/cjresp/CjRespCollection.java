package com.terasoft.terautils.cjresp;

import java.util.ArrayList;
import java.util.List;

public class CjRespCollection {
	
	public String version = "1.0", href = "";
	private List<CjRespLink> links = new ArrayList<CjRespLink>();
	private List<CjRespItem> items = new ArrayList<CjRespItem>();
	private List queries = new ArrayList();
	public CjRespTemplate template = null; 
	public CjRespError error = null;

	public CjRespCollection(String version, String href) {
		super();
		this.version = version;
		this.href = href;
	}

	public CjRespCollection() {
		
	}

	public void addLink(CjRespLink link)
	{
		this.links.add(link);
	}
	
	public void addItem(CjRespItem item)
	{
		this.items.add(item);
	}
	
	public void addQuery(Object query)
	{
		this.queries.add(query);
	}
}
