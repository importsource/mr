package com.importsource.mr.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 
 * @author Hezf
 *
 */
public class FileMgr {
    
	/**
	 * 读取txt文件
	 * @param filePath
	 * @return
	 */
    public static String readTxtFile(String filePath){
    	StringBuilder sb=new StringBuilder();
        try {
                String encoding="GBK";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    while((lineTxt = bufferedReader.readLine()) != null){
                    	sb.append(lineTxt);
                        //System.out.println(lineTxt);
                    }
                    read.close();
        }else{
            System.out.println("找不到指定的文件");
        }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return sb.toString();
     
    }
     
    public static void main(String argv[]){
        String filePath = "L:\\Apache\\htdocs\\res\\20121012.txt";
//      "res/";
        readTxtFile(filePath);
    }
     
     
 
}