package Practice;

 class method {

	public void print() {
	    System.out.println("This is parent class");
	  }
	}
class ChildClass extends method  {
	  public void print() {
	    System.out.println("This is child class");
	  }
}

	 class ParentAndChild{
		 public static void main(String[] args) {
			 method  parent = new method ();
			    ChildClass child = new ChildClass();
			    method  obj = new method ();
			    
			    parent.print();
			    child.print();
			    obj.print();
		 }
	
}






