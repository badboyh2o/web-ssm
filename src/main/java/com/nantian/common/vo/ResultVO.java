package com.nantian.common.vo;


/**
 * 封装返回结果
 *
 * @param <T>
 */
public class ResultVO<T> {
    private String code;
    private String msg;
    private T result;
 
    /**
     * 新建 ResultVO
     * @param <T>
     * @return
     */
    public static <T> ResultVO<T> getNewResultVO() {
        return new ResultVO<T>();
    }
    
    // 构造器
    public ResultVO() {
        super();
    }
    public ResultVO(String code) {
        super();
        this.code = code;
    }
    public ResultVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResultVO(String code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }
    
    // getter/setter
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
}
