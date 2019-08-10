



class Prism extends Rectangle implements  Cloneable{
	private Double height;
	//protected Prism myPri;
	
	public Prism(Double x, Double y, Double l, Double w, Double h, String  name, Colour colour)
	{
		super(x, y, l, w, name, colour);
		height = h;
	}
	
	public void  set_height(Double h)
	{
		height = h;
	}
	
	public Double  height() 
	{
		return height;
	}
	public void shrink (double y) throws SizeFactorException{
		if (y<LIMIT) 
				throw new SizeFactorException();
		height=height/y;
	}
	public void enlarge(double x) throws SizeFactorException{
		if (x<LIMIT) {
			throw new SizeFactorException();
			}height=height*x;
	}
	
	public Double  area()
	{
		return  2 * (length * width) + 2 * (height * length) + 2 * (height * width); 
	}
	
	public Double  perimeter()
	{
		return  width  * 2 + length * 2;
	}
	
	public Double  volume()
	{
		return  width  * length * height;
	}
	
	
	public String toString()
	{
		String s = super.toString()+ "\nHeight: " + height;
		return s;
	}
	 public Object clone() throws CloneNotSupportedException{
    	return super.clone();
    	// temp.myPri = (Prism) myPri.clone();
    	// return temp;
     }
}
