package arrays;

import java.util.Iterator;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		a= new int[5];
		
		int[] b=new int[5];
		
		int[] c=new int[] {10,20,30,40,50};
		
		int[] d=new int[5];
		d[0]=100;
		d[1]=60;
		d[2]=78;
		d[3]=80;
		d[4]=98;
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("***************");
		
		for (int i : d) {
			System.out.println(i);
		}

	}

}
