public class stringconcat {
	public static void main(String [] args){
		String str1 = "Maple";
		String str2 = "Leaf";
		String str3 = str1 + str2
			//str3 = MapleLeaf
		System.out.println(str3);
		
		str1 = "Toronto";
		str2 = "Ontario";
		str3 = "Canada";
		String str4 = str1 + ", " + str2 + ", " + str3;
		System.out.println(str4);
		
		str1 = "Area = ";
		double area = Math.PI * Math.pow(3,2);
		str1 += area;
		// str1 += area; short form of str1 = str1 + area;
		System.out.println(str1);
		
	}
}