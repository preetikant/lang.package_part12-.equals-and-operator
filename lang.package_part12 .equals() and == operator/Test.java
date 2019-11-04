class Test{
	public static void main(String args[]){
		String s1 = new String("durga");
		String s2 = new String("durga");
		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(s1==s2); //false just bcz refer to diffrent object
		System.out.println(s1.equals(s2)); // true just bcz s1,and s2 both have same values
		System.out.println(sb1==sb2); // false just bcz refer to diffrent object
		System.out.println(sb1.equals(sb2)); // false jsut bcz in StringBuffer .equals() method is also used to reference comparison
		//System.out.println(s1==sb2); // to get compile time error (incomparible type String and StringBuffer) just bcz 
										//to use == operator compulsor there should be some relation b/w agrument types
		System.out.println(s1.equals(sb2)); // false
	}
}