/**
 * 
 */
package dmeo0101;

import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @author hehehe
 *
 */
public class demo0102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Document doc = Jsoup.parseBodyFragment("<li><a href=" + "/sichuan/14/wilcrea.htm"
				+ " target=_blank>四川威克力纺织制品有限公司</a></li><li><span>四川威克力无纺布有限公司主要产品有：无纺布、染色纱和金属针布无纺布分为热风、热轧和复合无纺布，年产量1200吨左右。</span><div class=tel> 电话: 028-84397826　　　地址: 四川 成都市 一环路东三段64号锦泰公寓a座2-6</div></li>");
		//String text = doc.select("li").first().text(); // 四川威克力纺织制品有限公司
	
		String text1 = doc.select("li").get(0).text()+"  "+doc.select("li").get(1).text();
		
		
		System.out.println( text1);
	}

}
