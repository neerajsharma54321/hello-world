import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Class1 {
public static void main(String s[])
{
	DateFormat dateFormat=new SimpleDateFormat("MMM yyyy");
	Date date=new Date();
	
	Calendar calendar=Calendar.getInstance();
	calendar.setTime(date);
	calendar.add(Calendar.MONTH,4);
	
	//System.out.println(dateFormat.format(calendar.getTime()));
	//System.out.println(dateFormat.format(date));
	Class1 class1=new Class1();
	System.out.println(class1.getLastNoMonth(12));
	System.out.print(class1.getNextMonth(5));
	
}

public List<String> getLastNoMonth(int numberOfMonth)
{
	DateFormat dateFormat=new SimpleDateFormat("MMM yyyy");
	Date date=new Date();
	Calendar calendar=Calendar.getInstance();
	calendar.setTime(date);
	List<String> list=new ArrayList<String>();
	for(int i=0;i<numberOfMonth;i++)
	{
		calendar.add(Calendar.MONTH,-1);
		list.add(dateFormat.format(calendar.getTime()));
	}
	return list;
}

public List<String> getNextMonth(int numberOfMonth)
{
	DateFormat dateFormat=new SimpleDateFormat("MMM yyyy");
	Date date=new Date();
	Calendar calendar=Calendar.getInstance();
	calendar.setTime(date);
	List<String> list=new ArrayList<String>();
	for(int i=0;i<numberOfMonth+1;i++)
	{
		calendar.add(Calendar.MONTH,1);
		list.add(dateFormat.format(calendar.getTime()));
	}
	return list;
}

}
