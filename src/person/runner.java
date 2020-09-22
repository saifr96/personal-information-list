package person;

import java.util.ArrayList;
import java.util.List;
public class runner {

	public static void person(String[] args) {
		// TODO Auto-generated method stub

		person tessa= new person("tessa" ,22, "IT consultant");
		person mike= new person("mika" ,24, "IT consultant");
		person john= new person("john" ,29, "bin man");
		person tom= new person("tom" ,35, "doctor");
		
		List<person> nameList= new ArrayList<>();
		nameList.add(tessa);
		nameList.add(mike);
		nameList.add(john);
		nameList.add(tom);
		
		System.out.println(nameList);
		info("tessa",nameList);
		}
	
	
	public static void info (String name, List<person>name1) {
		
		for (person i: name1) {
		if (i.name==name) {
			System.out.println(i);
		}
	}
	}
}
	

	
	
	

