package com.barry.elk.vo.business;

import java.io.Serializable;

/**
 * rest 接口统一返回对象
 * 
 * @author chongwenjun
 *
 */
public class ResponseMessage implements Serializable {

	private static final long serialVersionUID = 1699596544860120252L;

	private String flag;
	private String message;

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseMessage() {
		this.flag = flag;
		this.message = message;
	}

	public ResponseMessage(String flag, String message) {
		this.flag = flag;
		this.message = message;
	}

	/**
	 * 成功/失败返回
	 * 
	 * @param flag
	 * @return
	 */
	public static ResponseMessage getReturnMsg(String flag, String message) {
		ResponseMessage returnObject = new ResponseMessage();
		returnObject.setFlag(flag);
		returnObject.setMessage(message);
		return returnObject;
	}



}
