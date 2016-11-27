package dmeo0100;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo0200 {
	public static void main(String[] args) throws IOException {
		File input = new File("/tmp/input.html");
		Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");

		Element content = doc.getElementById("content");
		Elements links = content.getElementsByTag("a");
		for (Element link : links) {
		  String linkHref = link.attr("href");
		  String linkText = link.text();
		}
	}

}
