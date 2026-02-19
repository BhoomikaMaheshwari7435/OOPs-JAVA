class University{
	static int totalStudent;
	static String universityName;
	
	static{
		universityName = "Saffrony Institute Of Technology";
		totalStudent = 0;
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("240390107020\n");
		System.out.println("Static Block is Executed.");
	}
	
	//instance Block
	{ System.out.println("Instance Block is Executed"); }
	
	//Constructore
	University(){
		totalStudent++;
		System.out.println("Constructor is Executed.");
	}
	
	static int getTotalStudent(){
		return totalStudent;
	}

public static void main(String[] args){
	System.out.println("Main Method Executed.");
	System.out.println("University Name."+ universityName);
	
	University s1 = new University();
	University s2 = new University();
	University s3 = new University();
	
	System.out.println("Total Students : "+ University.getTotalStudent());
}
}