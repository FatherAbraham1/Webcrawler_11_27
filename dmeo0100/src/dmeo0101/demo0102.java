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
				+ " target=_blank>�Ĵ���������֯��Ʒ���޹�˾</a></li><li><span>�Ĵ��������޷Ĳ����޹�˾��Ҫ��Ʒ�У��޷Ĳ���Ⱦɫɴ�ͽ����벼�޷Ĳ���Ϊ�ȷ硢�����͸����޷Ĳ��������1200�����ҡ�</span><div class=tel> �绰: 028-84397826��������ַ: �Ĵ� �ɶ��� һ��·������64�Ž�̩��Ԣa��2-6</div></li>");
		//String text = doc.select("li").first().text(); // �Ĵ���������֯��Ʒ���޹�˾
	
		String text1 = doc.select("li").get(0).text()+"  "+doc.select("li").get(1).text();
		
		
		System.out.println( text1);
	}

}
