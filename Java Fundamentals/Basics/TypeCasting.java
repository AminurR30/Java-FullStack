package basics;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		int intValue=100;
		long longValue= intValue;
		double doubleValue=longValue;
		
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(doubleValue);
		
		double dValue=200.56;
		int iValue=(int)dValue;
		byte byteValue= (byte)iValue;
		
		System.out.println(dValue);
		System.out.println(iValue);
		System.out.println(byteValue);
		
	}

}
