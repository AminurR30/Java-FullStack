package conditions;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sellingPrice=1200, costPrice=1000;
		
		if(sellingPrice > costPrice)
			System.out.println("Profit");
		else if(sellingPrice < costPrice)
			System.out.println("Loss");
		else
			System.out.println("No Profit No Loss");

	}

}
