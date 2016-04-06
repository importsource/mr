package com.importsource.mr.core;

import java.util.ArrayList;
import java.util.List;

/**
 * 分词器
 * @author Hezf
 *
 */
public class Split {
	// private String[] dictionary = { "今天", "是", "星期", "星期六","啊" }; // 词典
	private String[] dictionary;
	List<String> list=new ArrayList<String>();
	/**
	 * 
	 */
	public List<String> split(String input) {
		
		// System.out.println("开始分词");
		String temp = null;
		for (int i = 0; i < input.length(); i++) {
			temp = input.substring(i); // 每次从字符串的首部截取一个字，并存到temp中
			// System.out.println("*****" + temp + "*********" + this.input);
			// 如果该词在字典中， 则删除该词并在原始字符串中截取该词
			if (this.isInDictionary(temp)) {
				list.add(temp);
				System.out.println(temp);
				input = input.replace(temp, "");
				i = -1; // i=-1是因为要重新查找， 而要先执行循环中的i++
			}
		}

		// 当前循环完毕，词的末尾截去一个字，继续循环， 直到词变为空
		if (null != input && !"".equals(input)) {
			input = input.substring(0, input.length() - 1);
			this.split(input);
		}
		// System.out.println("结束分词");
		return list;
	}

	public boolean isInDictionary(String temp) {
		for (int i = 0; i < this.dictionary.length; i++) {
			if (temp.equals(this.dictionary[i].trim())) {
				return true;
			}
		}
		return false;
	}

	public void setDictionary() {
		String dicString = FileMgr.readTxtFile("Y:\\中文分词词库整理\\百度分词词库.txt");
		dictionary = dicString.split("[,]");
	}

	public String[] getDictionary() {
		return this.dictionary;
	}
}
