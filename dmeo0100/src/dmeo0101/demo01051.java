package dmeo0101;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class demo01051 {
	public static  String url="http://www.cn360cn.com/city/322/";
	
	public static void WriteStream(String data,File file){
		 try{
		 

		      //if file doesnt exists, then create it
		      if(!file.exists()){
		       file.createNewFile();
		      }

		      FileWriter fw = null;
		      fw = new FileWriter(file,true);
	           // String c = "abs"+"\r\n";
	            fw.write(data);
	            fw.close();
		    

		         System.out.println("Done");

		     }catch(IOException e){
		      e.printStackTrace();
		     }

	}
	
	public static void main(String[] args) throws IOException {
		
		File in=new File("output","ouput.txt");
		
		Document doc=Jsoup.parse(in, "utf-8");
		//String text = doc.select("li").first().text(); // 四川威克力纺织制品有限公司
	
		
		
		//div:not(.logo) 
		//公司名称：
		
/*		Iterator it=doc.select("li > a[target]").iterator();
		System.out.println(doc.select("li > a[target]").size());
		
		StringBuilder string= new StringBuilder();
		string.append(doc.select("li > a[target]").toString());

		
		WriteStream(string.toString(),new File("c:/1.txt"));
*/
		
		
		
/*		
		Iterator it=doc.select("div.tel").iterator();//span
		while (it.hasNext()) {
	
				System.out.println(it.next().toString());
				
		}*/
		//电话
/*		
		StringBuilder string= new StringBuilder();
	
		string.append(doc.select("div.tel").toString());

		
		WriteStream(string.toString(),new File("c:/3.txt"));
	
*/
		
		
		//介绍
/*
		StringBuilder string= new StringBuilder();
		string.append(doc.select("span").toString());
		WriteStream(string.toString(),new File("c:/21.txt"));
	
*/
	
		Iterator it=doc.select("span,style[color]").iterator();
		CharSequence cs1 = "style";
		StringBuilder str1= new StringBuilder();
		
		while (it.hasNext()) {
			//if (it.next().toString().contains(cs1)) {
				str1.append(it.next().toString()+"\n");
		
		//	}
				
		}
		
		WriteStream(str1.toString(),new File("c:/22.txt"));
	
		/*
		String s="<span style="+"color:red;"+">[1]"+"</span>";
		System.out.println(s.length());*/
	
		
	}

}
