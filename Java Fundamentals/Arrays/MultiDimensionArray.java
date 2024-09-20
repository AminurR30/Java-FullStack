package arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{67,76,87,89,98},
				{76,77,56,65,90},
				{67,79,92,63,55}};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}
