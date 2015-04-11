package com.terasoft.terautils.cjresp;

public class CjRespError {

	private final String title, message, developer_message;

	private final Object code;
	
	public CjRespError(String title, Object code, String message,
			String developer_message) {
		super();
		this.title = title;
		this.code = code;
		this.message = message;
		this.developer_message = developer_message;
	}

	public String getTitle() {
		return title;
	}

	public Object getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getDeveloper_message() {
		return developer_message;
	}

}
