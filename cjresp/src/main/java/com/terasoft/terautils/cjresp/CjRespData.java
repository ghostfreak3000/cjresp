package com.terasoft.terautils.cjresp;

public class CjRespData {

	private final String name, prompt;
	private final Object value;

	public CjRespData(String name, Object value, String prompt) {
		super();
		this.name = name;
		this.value = value;
		this.prompt = prompt;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}

	public String getPrompt() {
		return prompt;
	}
	
}
