// Use Arrays.sort() to sort array of Students using Comparator.
//The 1st level sorting should be on city
//(desc), 2nd level sorting should be on marks (desc),
//3rd level sorting should be on name (asc).




import java.util.Arrays;
import java.util.Comparator;

class Student
{
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student(int roll, String name, String city, double marks )
	{
		this.roll = roll;
		this.name= name;
		this.marks= marks;
		this.city=city;
	}
	
	public String getCity()
	{
		return city;
	}
	public double getMarks()
	{
		return marks;
	}
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return "Roll:" + roll + ", Name:"+name +", City:"+ city+", Marks:" + marks;
	}
	
}
public class Que2 {

	public static void main(String[] args) {
		Student[] stu = {
				new Student(101, "Sakshi", "Mumbai", 85.5),
				new Student(102, "Priya", "Pune", 90.5),
				new Student(103, "Neha", "Mumbai", 75.5),
				new Student(104, "Teju", "Delhi", 88.0),
				new Student(105, "Yashu", "Luck", 86.5),
				new Student(106, "Sweety", "kolkata", 95.5)
		};
		class CityNameComparator implements Comparator<Student>{
			@Override
			public int compare(Student x, Student y) {
				int diff = x.getCity().compareTo(y.getCity()); 
				return diff; 
			}
			
		}
		CityNameComparator cityNameComparator = new CityNameComparator();
		
		Arrays.sort(stu, cityNameComparator); 
		System.out.println("Sorted on city");
		for(int i =0; i < stu.length; i++)
		{
			System.out.println(stu[i]);
		}
		System.out.println();

		class MarksDescComparator implements Comparator<Student>
		{
			@Override
			public int compare(Student x, Student y)
			{
				int diff = (int) (y.getMarks()-x.getMarks());
				return diff;
			}
		}
		Arrays.sort(stu, new MarksDescComparator() );
		System.out.println("Sorted on marks : ");
		for(int i =0; i< stu.length; i++)
		{
			System.out.println(stu[i]);
		}
		
		class NameAscComparator implements Comparator<Student>
		{
			@Override
			public int compare(Student x, Student y)
			{
				int diff = x.getName().compareTo(y.getName());
				return diff;
			}
		}
		Arrays.sort(stu , new NameAscComparator());
		System.out.println("Sorted on name :");
		for(int i =0; i <stu.length; i++)
		{
			System.out.println(stu[i]);
		
				
		} 
		

	}

}
