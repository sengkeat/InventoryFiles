
public class Testmain {
	public static void main(String[] args){
		String str1 = "str1=&&amp;>";
		String str2 = "str2=<>";
		
		System.out.println("String 1 : "+ escapeXml(str1));
		System.out.println("String 1 : "+ escapeXml(str2));
	}
	public static String escapeXml(String xml){
		String s = "";
		s = xml.replaceAll("&amp;", "&");
		s = s.replaceAll("&gt;", ">");
		s = s.replaceAll("&lt;", "<");
		s = s.replaceAll("&apos;", "'");
		s = s.replaceAll("&quot;", "\"");
		
		s = s.replaceAll("&", "&amp;");
		s = s.replaceAll(">", "&gt;");
		s = s.replaceAll("<", "&lt;");
		s = s.replaceAll("'", "&apos;");
		s = s.replaceAll("\"", "&quot;");
		
		
		
		return s;
	}

}
