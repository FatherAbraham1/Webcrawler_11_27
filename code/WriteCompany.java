package dmeo0101;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WriteCompany {
	
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
	
	
	public static void WriteCompany(Document doc){
		Elements links = doc.select("li > a[target]");
		System.out.println("WriteCompany num is:="+links.size());
		
		Iterator it=doc.select("li > a[target]").iterator();
		
		
		//doc.select("li > a[target]").get(i).text()
		//System.out.println(doc.select("li > a[target]").size());
		
		StringBuilder string= new StringBuilder();
		for (int i = 0; i < links.size(); i++) {
			string.append(doc.select("li > a[target]").get(i).text()+"\n");
			System.out.println(i);
			
		}
		//string.append(doc.select("li > a[target]").toString());

		
		WriteStream(string.toString(),new File("c:/WriteCompany.txt"));
		
	}
	
	public static void WriteTel(Document doc){
		
		Elements links = doc.select("div.tel");
		System.out.println("WriteTel num is:="+links.size());
		
		
		Iterator it=doc.select("div.tel").iterator();
		StringBuilder string= new StringBuilder();
		
		//string.append(doc.select("div.tel").toString());
	/*	while (it.hasNext()) {
			
			string.append(it.next().toString());
			
		}
	*/
		
		for (int i = 0; i < links.size(); i++) {
			string.append(doc.select("div.tel").get(i).text()+"\n");
			System.out.println(i);
			
		}
		WriteStream(string.toString(),new File("c:/WriteTel.txt"));
		
		
	}
	
	public static void WriteInfo(Document doc){
		Elements links = doc.select("span,style[color]");
		System.out.println("WriteTel num is:="+links.size());
		
		Iterator it=doc.select("span,style[color]").iterator();
		CharSequence cs1 = "style";
		StringBuilder str1= new StringBuilder();
		
		
		
		for (int i = 0; i < links.size(); i++) {
			str1.append(doc.select("span,style[color]").get(i).text()+"\n");
			System.out.println(i);
			
		}
		
	/*	
		while (it.hasNext()) {
			//if (it.next().toString().contains(cs1)) {
				str1.append(it.next().toString()+"\n");
		
		//	}
				
		}
		*/
		WriteStream(str1.toString(),new File("c:/WriteInfo.txt"));
	}
	public static void main(String[] args) throws IOException {
		File in = new File("output", "3.txt");

		Document doc = Jsoup.parse(in, "utf-8");

		//Elements links = doc.select("li");
		//System.out.println("num is:="+links.size());
		
		WriteCompany(doc);
		//WriteInfo(doc);
		//WriteTel(doc);
		
	
		
	}

}
