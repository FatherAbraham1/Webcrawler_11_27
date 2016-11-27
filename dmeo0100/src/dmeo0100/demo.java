package dmeo0100;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
	  /** 
     * ��ȡָ��HTML��ǩ��ָ�����Ե�ֵ 
     * @param source Ҫƥ���Դ�ı� 
     * @param element ��ǩ���� 
     * @param attr ��ǩ���������� 
     * @return ����ֵ�б� 
     */  
    public static List<String> match(String source, String element, String attr) {  
        List<String> result = new ArrayList<String>();  
        String reg = "<" + element + "[^<>]*?\\s" + attr + "=['\"]?(.*?)['\"]?(\\s.*?)?>";  
        Matcher m = Pattern.compile(reg).matcher(source);  
        while (m.find()) {  
            String r = m.group(1);  
            result.add(r);  
        }  
        return result;  
    }  
      
    public static void main(String[] args) {  
        String source = "<a title=�й������� href=''>aaa</a><a title='�����ձ�' href=''>bbb</a>";  
        List<String> list = match(source, "a", "title");  
        System.out.println(list);  
    }  

}
