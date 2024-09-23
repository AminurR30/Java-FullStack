package arrays;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer.capacity());
//		buffer.append("World");
//		System.out.println(buffer);
		for(int i=0;i<10000;i++) {
			buffer.append("World");
		}
		System.out.println("Time taken by StringBuffer: "+ (System.currentTimeMillis() - startTime));
		
		StringBuilder builder= new StringBuilder("Hello");
		System.out.println(builder.capacity());
//		builder.append("World");
//		System.out.println(builder);
		for(int i=0;i<10000;i++) {
			builder.append("World");
		}
		System.out.println("Time taken by StringBuilder: "+ (System.currentTimeMillis() - startTime));

	}

}
