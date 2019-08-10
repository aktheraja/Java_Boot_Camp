


class Circle extends Shape implements Cloneable
{
	private Double radius;
//private Circle myCir;
	Circle(Double x_origin, Double y_origin, Double newradius,  String name, Colour colour){
		super(x_origin, y_origin, name, colour);
		radius = newradius;
	}
	
	
	public void set_radius(Double newradius){
		radius = newradius;
	}
	public void shrink (double y) throws SizeFactorException{
		if (y<LIMIT) 
				throw new SizeFactorException();
		radius=radius/y;
	}
	public void enlarge(double x) throws SizeFactorException{
		if (x<LIMIT) {
			throw new SizeFactorException();
			}radius=radius*x;
	}
	
	
	public Double get_radius() {
		return radius;
	}
	
	public Double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public Double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public Double  volume(){
		return 0.0;
	}

	
	public String toString(){
		String s = super.toString()+ "\nRadius: " + radius;
		return s;
	}
         public Object clone() throws CloneNotSupportedException{
        	return  super.clone();
        	// temp.myCir = (Circle) myCir.clone();
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
