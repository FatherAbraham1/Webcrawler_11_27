package dmeo0101;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class demo0103 {

	public static void main(String[] args) throws Exception{
		
		File in=new File("output","ouput.txt");
		
		Document doc=Jsoup.parse(in, "utf-8");
		//String text = doc.select("li").first().text(); // 四川威克力纺织制品有限公司
	
		
		
		//div:not(.logo) 
		//Iterator it=doc.select("li > a[target]").iterator();
		//Iterator it=doc.select("div.tel").iterator();//span
		
		Iterator it=doc.select("span").iterator();
	
		
		while (it.hasNext()) {
			
			//if (it.next().toString().indexOf("[")<0) {
				System.out.println(it.next().toString());
			//}
			
			
			
		}
		String s="<span style="+"color:red;"+">[1]"+"</span>";
		System.out.println(s.length());
	
	
	}

}
