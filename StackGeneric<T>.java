package shatdwikamadaniputri;

import java.util.Vector;

public class StackGeneric<T> {
	private Vector <T> StackGeneric = new Vector<T>();
	  public int top = -1;
	    public StackGeneric()

	    {    
	    }

	    public void insert (T value)

	    {
	    		top++;
	          StackGeneric.add(top,value);

	    }

	    public int remove()

	    {
	    	int value = top;
	        if (top>-1){
	        value = (Integer) StackGeneric.get(0);
				StackGeneric.remove(0);
				top--;
			}
			return value;
	            //return null;
	     //   }

	       // return queue.remove(0);

	    }

		public void push(int i) {
			// TODO Auto-generated method stub
			
		}

		public void cetak() {
			// TODO Auto-generated method stub
			
		}

		public String size() {
			// TODO Auto-generated method stub
			return null;
		}

		public char[] pop() {
			// TODO Auto-generated method stub
			return null;
		}
}
