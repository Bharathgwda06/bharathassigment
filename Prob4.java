import java.util.ArrayList;
import java.util.List;

public class Prob4 {
	    List<Integer> list;
	    
	    public Prob4() {
	        list = new ArrayList<>();
	    }
	   
	    public void push(int a) {
	        list.add(a);
	    }
	    public int pop() {
	        int res = list.get(0);
	        list.remove(0);
	        return res;
	    }
	    
	    public int peek() {
	        return list.get(0);
	    }
	    
	    public boolean empty() {
	        return list.size() == 0;
	    }
	    
	    public void print() {
	    	System.out.println(list);
	    }
	    
	    public void delete(int a) {
	    	if(a<list.size())
	    	list.remove(a);
	    	
	    }
	        
	  public static void main(String[] args) {
		  Prob4 obj=new Prob4();
		  obj.push(100);
		  obj.push(0);
		  obj.push(123);
		  System.out.println(obj.peek());
		  obj.pop();
		  System.out.println(obj.peek());
		  obj.push(1238);
		  obj.push(1273);
		  obj.delete(2);
		  obj.print();
		 	
	}    
	}