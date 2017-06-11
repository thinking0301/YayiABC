package com.yayiabc.common.utils;

import java.io.*;

public class FileUtil {
	
	
	public FileUtil() {
		
	}
	
	public static String readFile(String filePath) {
		String content = "";
		try{
			FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");

            BufferedReader br = new BufferedReader(reader);
            String str = null;
            while((str = br.readLine())!=null) {
            	content = content + str + "\r\n";
            }

            br.close();
            reader.close();
       }catch(IOException e) {
           e.printStackTrace();
           return null;
       }
	   return content;
	}
	
	public static boolean writeFile(String fiePath,String content,boolean append) {//append是否文件末尾追加
		 try {
			 File file = new File(fiePath);
	         if(!file.exists())
				 file.createNewFile();

	         FileOutputStream out=new FileOutputStream(file,append);       
	         StringBuffer sb=new StringBuffer();
	         sb.append(content);
	         out.write(sb.toString().getBytes("utf-8"));
	         out.close();
	     } catch(IOException ex) {
	         System.out.println(ex.getStackTrace());
	         return false;
	     }
		 return true;
	}
	
	
	public static boolean deleteFile(String filePath) {
		File file = new File(filePath);
		if(file.exists()) 
			file.delete();
		return true;
	}

}
