package dmeo0101;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo0104 {

	public static void main(String[] args) throws IOException {
		File in = new File("output", "ouput.txt");

		Document doc = Jsoup.parse(in, "utf-8");

		Elements links = doc.select("li");
		
		System.out.println(links.size());
		
		// String text1 = doc.select("li").get(0).text()+" "+doc.select("span").get(0).text()+" "+doc.select("div.tel").get(0).text();
		 
		int index=links.size();
		
		for (int i = 0; i < index; i++) {
			 String text1 = doc.select("li > a[target]").get(i).text()+"       "+doc.select("span").get(i).text()+"      "+doc.select("div.tel").get(i).text();
			 
			 System.out.println((i+1)+" ==="+text1);
			
		}
		
		
	
	

	}

}
