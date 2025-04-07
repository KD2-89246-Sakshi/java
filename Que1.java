
public class Que1 {
	public static<T extends Number> T findMinimum(T[] array) throws IllegalAccessException
	{
		if(array==null || array.length==0)
		{
			throw new IllegalAccessException("Array cannot be null ");
		}
		T min = array[0];
		
		for(T num: array)
		{
			if(num.doubleValue()< min.doubleValue()) {
				min = num ;
			}
		}
		return min;
		
	}

	public static void main(String[] args) throws IllegalAccessException {
		Integer[] intArray= {5,2,8,1,9};
		Double[] doubleArray = {2.3, 4.5, 1.2, 3.6};
		
		System.out.println("Minimum integer : "+ findMinimum(intArray));
		System.out.println("Minimum Double: " + findMinimum(doubleArray));
		
	}

}
