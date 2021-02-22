package com.gyoomi.app;

import java.util.List;

/**
 * {@link Import}注解的使用
 *
 * @author Leon
 * @version 2021/2/22 22:22
 */
public class Demo
{

	private Integer demoId;

	private String demoName;

	private List<String> list;

	public Demo()
	{
	}

	public Integer getDemoId() {
		return demoId;
	}

	public void setDemoId(Integer demoId) {
		this.demoId = demoId;
	}

	public String getDemoName() {
		return demoName;
	}

	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Demo{" +
			"demoId=" + demoId +
			", demoName='" + demoName + '\'' +
			", list=" + list +
			'}';
	}
}
