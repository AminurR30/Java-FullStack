package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isAuthenticated=true;
		
		if(isAuthenticated)
			System.out.println("Logged-in");
		else
			System.out.println("Not Logged-in");
		
		String result= (isAuthenticated)?"Logged-in":"Not Logged-in";
		System.out.println(result);

	}

}
