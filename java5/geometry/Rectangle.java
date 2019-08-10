


class Rectangle extends Shape implements Cloneable
{
	protected Double width, length;

	//protected Rectangle myRec;
	
	public Rectangle(Double x_origin, Double y_origin, Double newlength, Double newwidth, String  name, Colour colour){
		super(x_origin, y_origin, name, colour);
		length= newlength;
		width =newwidth;
		
	}
	
	protected void  set_length(Double newlength){
		length = newlength;
	}
	
	protected Double  get_length() {
		return length;
	}
	
	protected Double  area(){
		return  width *length;
	}
	
	protected Double  perimeter(){
		return  width  * 2 + length * 2;
	}
	
	protected Double  volume(){
		return 0.0;
	}
	public void shrink (double y) throws SizeFactorException{
		if (y<LIMIT) 
				throw new SizeFactorException();
		length=length/y;
		width=width/y;
	}
	public void enlarge(double x) throws SizeFactorException{
		if (x<LIMIT) {
			throw new SizeFactorException();
			}length=length*x;
			width= width*x;
	}	 

	
	@Override
	public String toString(){
		String s = super.toString()+ "\nWidth: " + width + "\nLength: " + length;
		return s;
	}
	 public Object clone() throws CloneNotSupportedException{
    	return super.clone();
    	// temp.myRec = (Rectangle) myRec.clone();
    	// return temp;
     }

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		
	}
        	
}