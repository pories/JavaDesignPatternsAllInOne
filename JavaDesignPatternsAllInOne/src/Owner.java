
public class Owner {
	private ISpreadSheet myvar1;
	public void SetSpreadSheet(ISpreadSheet DifferentSpreadSheet)
	{
		myvar1 = DifferentSpreadSheet;
	}
	
	public void WorkOn()
	{
		myvar1.Open();
	}

}
