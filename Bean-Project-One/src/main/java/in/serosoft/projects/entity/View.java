package in.serosoft.projects.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class View {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans-cfg.xml");
		First first = context.getBean("first",First.class);
		System.out.println(first.getId()+"\t"+first.getName()+"\t"+first.getSecond().getExperiance()+
				"\t"+first.getSecond().getSalary());
		
		System.out.println(first.getStringList());
		System.out.println(first.getStringSet());
		
		List<Second> secondList=first.getSecondList();
		Set<Second> secondSet=first.getSecondSet();

		
		for(Second s:secondList)
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getExperiance()+"\t"+s.getSalary());
		System.out.println("---------------------------------");
		
		for(Second s:secondSet)
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getExperiance()+"\t"+s.getSalary());
		System.out.println("---------------------------------");
		
		Map<String,Integer> secondMap=first.getSecondMap();
		for(Map.Entry second:secondMap.entrySet())
			System.out.println(second.getKey()+"\t"+second.getValue());

	}


}
