package com.web.sut.pro.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.SysexMessage;

public class FileUtils {
	public static void createTSVFile(List<Map<String, String>> timebalancebookrecord, Map<String, String> head,String outPutPath, String filename) {
		File tsvFile = null;
		BufferedWriter tsvFileOutputStream = null;
		try {
			tsvFile = new File(outPutPath + "\\"+filename + ".tsv");
			File parent = tsvFile.getParentFile();
			if (parent != null && !parent.exists()) {
				parent.mkdirs();
			}
			tsvFile.createNewFile();
			tsvFileOutputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tsvFile), "utf8"), 1024);
	            // 写入文件头部
			
			for (Iterator<Entry<String, String>> propertyIterator = head.entrySet().iterator(); propertyIterator.hasNext();) {
				java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
				tsvFileOutputStream.write(propertyEntry.getValue().toString()); 
				tsvFileOutputStream.write("\t");
			}
			tsvFileOutputStream.newLine();
			for(int i=0;i<timebalancebookrecord.size();i++){
				for (Iterator<Entry<String, String>> propertyIterator1 = timebalancebookrecord.get(i).entrySet().iterator(); propertyIterator1.hasNext();) {
					java.util.Map.Entry propertyEntry1 = (java.util.Map.Entry) propertyIterator1.next();
					tsvFileOutputStream.write(propertyEntry1.getValue().toString()); 
					tsvFileOutputStream.write("\t");
				}
			/*Iterator it = timebalancebookrecord.get(i).entrySet().iterator();    
			while (it.hasNext()) {    
				    Map.Entry e = (Map.Entry) it.next(); 
				    
				    tsvFileOutputStream.write(e.getValue().toString()); 
					tsvFileOutputStream.write("\t");
			}  */  
			
			/* for (Iterator it =  timebalancebookrecord.get(i).keySet().iterator();it.hasNext();)

			   {

			    Object key = it.next();

			    tsvFileOutputStream.write(timebalancebookrecord.get(i).get(key)); 
				tsvFileOutputStream.write("\t");

			   }*/
			

				tsvFileOutputStream.newLine(); 
			}
	        tsvFileOutputStream.flush();  
	        } catch (Exception e) {  
	           e.printStackTrace();  
	        } finally {  
	        try {  
	        	tsvFileOutputStream.close();  
	        } catch (IOException e) {  
	        	e.printStackTrace();
	        }  
	    }  
	}
	
	public static void createCSVFile(List<Map<String, String>> timebalancebookrecord, Map<String, String> head,String outPutPath, String filename) {
		File csvFile = null;
		BufferedWriter csvFileOutputStream = null;
		try {
			csvFile = new File(outPutPath + "\\"+filename + ".csv");
			File parent = csvFile.getParentFile();
			if (parent != null && !parent.exists()) {
				parent.mkdirs();
			}
			csvFile.createNewFile();
			csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFile), "utf8"), 1024);
	            // 写入文件头部
			
			for (Iterator<Entry<String, String>> propertyIterator = head.entrySet().iterator(); propertyIterator.hasNext();) {
				java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
				csvFileOutputStream.write(propertyEntry.getKey().toString()); 
				if(propertyIterator.hasNext()){
					csvFileOutputStream.write(",");
				}
			}
			csvFileOutputStream.newLine();
			for(int i=0;i<timebalancebookrecord.size();i++){
				for (Iterator<Entry<String, String>> propertyIterator1 = timebalancebookrecord.get(i).entrySet().iterator(); propertyIterator1.hasNext();) {
					java.util.Map.Entry propertyEntry1 = (java.util.Map.Entry) propertyIterator1.next();
					csvFileOutputStream.write(propertyEntry1.getKey().toString()); 
					csvFileOutputStream.write(",");
					csvFileOutputStream.write(propertyEntry1.getValue().toString()); 
				}
				csvFileOutputStream.newLine(); 
			}
			csvFileOutputStream.flush();  
	        } catch (Exception e) {  
	           e.printStackTrace();  
	        } finally {  
	        try {  
	        	csvFileOutputStream.close();  
	        } catch (IOException e) {  
	        	e.printStackTrace();
	        }  
	    }  
	}
	    //把json格式的字符串写到文件
	public static void createJsonFile(String filePath, String data){  	
		try {
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(filePath),"UTF-8");
			out.write(data); 
			out.flush(); 
			out.close(); 
		} catch (Exception e) {
				e.printStackTrace();
		} 
	}

}
