//Note that we took out the class's access modifier.
//A private member is only accessible within the 
//same class as it is declared. A member with no access modifier is only accessible 
//within classes in the same package. A protected member is accessible within all 
//classes in the same package and within subclasses in other packages.
//You can only have public, abstract, and final.
class Single {
	// static variable single_instance of type Singleton
	private static Single myvar1 = null;
	// private constructor restricted to this class itself 
	private Single()
	{
		//Nothing goes here.
	}
	// static method to create instance of Singleton class
	public static Single GetInstance()
	{
		if(null == myvar1)
		{
			myvar1 = new Single();
		}
		return myvar1;
	}
	//Showing that program is doing something. 
	public void DoSomething(String msg)
	{
		System.out.println(msg + " This is the second one.");
	}
}

