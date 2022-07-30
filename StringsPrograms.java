package mockPractice;

public class StringsPrograms {

	public static void main(String[] args) {
	String s1="Bhagya";
	String s2="bhagya";
	String s3="Gabhane";
	System.out.println("check1 " +s1.equals(s2));
	System.out.println("check2 " +s1.equals(s3));
	System.out.println("check3 " +s1.equalsIgnoreCase(s2));
	String s4="Magic Tables are invisible tables or virtual tables."
			+ " You can see them only with the help Triggers in SQL Server";
	System.out.println("sybstring with begining :" +s4.substring(20));
	System.out.println("second type of substring :" +s4.substring(6, 12));
	System.out.println("replace old char  with new char" +s4.replace('a', '@'));
	System.out.println("replace old string to new string " +s4.replace("invisible", "disable"));
	System.out.println("replace all " +s4.replaceAll("[A-Z]", "*"));
	//not understand
	System.out.println("replace all "+s4.replaceFirst("[A-Z]", s4));
	System.out.println("remove space "+s4.replaceAll(" ", ""));
	String s5="Magic  Tables   are invisible  tables or  virtual tables.";
	System.out.println("concatination of strings " +s1+s3);
	System.out.println(" string to uppercase " +s1.toUpperCase());
	System.out.println(" to lower case " +s3.toLowerCase());
	System.out.println(" char AT " +s3.charAt(3));
	System.out.println(" index of " +s2.indexOf('g'));
	System.out.println("trim "+s4.trim());
	System.out.println("start with method "+s3.startsWith("G"));
	System.out.println("End with "+s2.endsWith("y"));

	}

}
