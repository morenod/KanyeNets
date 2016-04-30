import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Person {
	
	private String name;
	private Map<Person, Integer> collabs;

	public Person(String name) {
		
		if (name == null) {
			System.out.println("name is null");
		}
		
		this.name = name;
		this.collabs = new TreeMap<Person, Integer>();
		
	}
	
	public void addCollab(Person p) {
		
		if (collabs.keySet().contains(p)) {
			collabs.put(p, collabs.get(p) + 1);
		} else {
			collabs.put(p, 1);
		}
		
	}
	
	public void removeCollab(Person p) {
		
		if(collabs.keySet().contains(p)) {
			collabs.remove(p);
		}
		
	}
	
	public Map<Person, Integer> getCollabs() {
		
		return collabs;
		
	}
	
	public int getCollabSize() {
		
		return collabs.size();
		
	}
	
}
