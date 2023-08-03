package interfaceStudy;

public  class Child implements Father,Mother {
	
	@Override
	public void Farm()
	{
	  System.out.println("Father farm method");	
	}
	
	@Override
	public void money()
	{
		System.out.println("Father money method");
	}
	
	@Override
	public void property()
	{
		System.out.println("Father property method");
	}
	
	@Override
	public void love()
	{
		System.out.println("This is mother love method");
	}
	
	@Override
	public void house()
	{
		System.out.println("this is mother house method");
	}
	
	@Override
	public void Sweet()
	{
		System.out.println("This is mother sweet method");
	}
	
	
	
	
	

}


