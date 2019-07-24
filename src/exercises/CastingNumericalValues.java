package exercises;

//Note that you can't cast a class to sth else, eg. String to int
public class CastingNumericalValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bvalue = 68;
		//16bits
		short svalue = 78;
		int ivalue = 88;
		long lvalue = 99;
		
		
		//Put f at the end
		float fvalue = 100.6f;
		double dvalue = 100.87;
		
		System.out.println(Byte.MAX_VALUE);
		//Won't work because maximum value is 127
		bvalue = (byte)128;
		System.out.println(bvalue);
		
		ivalue = (int) fvalue;
		System.out.println(ivalue);
	}

}
