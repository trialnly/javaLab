public class Rectangle
{
	private double x;
	private double y;

	public Rectangle(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX() 
	{
	    return x;
	}

	public double getY() 
	{
	    return y;
	}

	public void setX(double x) 
	{
	    this.x = x;
	}

	public void setY(double y) 
	{
	    this.y = y;
	}

	public void showArea()
	{
		System.out.println(x*y);
	}

	public double getArea()
	{
		return x*y;
	}

}