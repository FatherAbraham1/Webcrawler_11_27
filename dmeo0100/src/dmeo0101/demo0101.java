package dmeo0101;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class demo0101 {

	public static void main(String[] args) {
		Document doc  = Jsoup.parseBodyFragment("<class>123<br> <class>acx<br> <class>a12a<br>");
		String text = doc.select("class").first().text(); // 123 acx a12a
		System.out.println("text is ==="+text);
	}

}
