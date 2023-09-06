package in.serosoft.projects.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class First {
	
	private int id;
	private String name;
	private int age;
	private Long mobile;
	
	private Second second;
	
	private List<String> stringList;
	
	private Set<String> stringSet;
	
	private List<Second> secondList;
	
	private Set<Second> secondSet;
	
	private Map<String, Integer> secondMap;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String message() {
		return "Hi Champ! I am your First bean";
	}

	public Second getSecond() {
		return second;
	}

	public void setSecond(Second second) {
		this.second = second;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public Set<String> getStringSet() {
		return stringSet;
	}

	public void setStringSet(Set<String> stringSet) {
		this.stringSet = stringSet;
	}

	public List<Second> getSecondList() {
		return secondList;
	}

	public void setSecondList(List<Second> secondList) {
		this.secondList = secondList;
	}

	public Set<Second> getSecondSet() {
		return secondSet;
	}

	public void setSecondSet(Set<Second> secondSet) {
		this.secondSet = secondSet;
	}

	public Map<String, Integer> getSecondMap() {
		return secondMap;
	}

	public void setSecondMap(Map<String, Integer> secondMap) {
		this.secondMap = secondMap;
	}

	
	
	
}
