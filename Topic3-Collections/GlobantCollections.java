package hello;

import java.util.*;

public class GlobantCollections {
   public static void main(String[] args) {
	   ArrayList<Employee> staff=new ArrayList<Employee>();//"Employee" is a mock class, its instances are supposed to store relevant info (Age, position, name, etc.)
	   staff.sort();
	   staff.sort(Comparator.comparing(Employee::getSurname));//sorted by Surname
	   staff.sort(Comparator.comparing(Employee::getName));//sorted by Name
	   staff.sort(Comparator.comparing(Employee::getAge));//sorted by Age
	   staff.sort(Comparator.comparing(Employee::getPosition));//sorted by Position
	   
	   LinkedList<Employee> bootcampTutors=new LinkedList<Employee>();  
	   bootcampTutors.add(Gervasio); 
	   
	   Vector<Employee> vStaff =new Vector<Employee>();  
	   vStaff.add(Ilan);
	   bootcampTutors.sort();
	   
	   Stack<String> lastStudentToArrive = new Stack<String>();  
	   lastStudentToArrive.push("Claudio");  
	   
	   PriorityQueue<String> studentsInOrderOfArrival=new PriorityQueue<String>();
	   studentsInOrderOfArrival.add("Claudio"); 
	   
	   Deque<String> studentsSeatingOrder = new ArrayDeque<String>(); 
	   studentsSeatingOrder.add("Claudio");
	   studentsSeatingOrder.addLast("Agustin");
	   
	   HashSet<String> group1=new HashSet<String>();  
	   group1.add("Jefferson");  
	   
	   LinkedHashSet<String> group3=new LinkedHashSet<String>();  
	   group3.add("Giorgio");  
	   
	   TreeSet<String> companyHierarchy=new TreeSet<String>();  
	   companyHierarchy.add("Junior Developer");
	   
	   HashMap<String,String> staffCUIT=new HashMap<String,String>();  
	   staffCUIT.put("Ilan Rosenfeld","20-35555555-2");  
	   
	   LinkedHashMap<String,String> tutorsBCType=new LinkedHashMap<String,String>();  
	   tutorsBCType.put("Ilan Rosenfeld","Java");  
	   
	   TreeMap<Integer,String> tutorsEntryYear=new TreeMap<Integer,String>();  
	   tutorsEntryYear.put(2015,"Ilan Rosenfeld");  
   }
}