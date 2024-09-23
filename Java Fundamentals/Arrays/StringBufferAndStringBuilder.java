package arrays;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer.capacity());
		buffer.append("World");
		System.out.println(buffer);
		
		StringBuilder builder= new StringBuilder("Hello");
		System.out.println(builder.capacity());
		builder.append("World");
		System.out.println(builder);

	}

}
