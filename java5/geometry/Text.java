

 class Text implements Resizable
{
	
	private final Double DEFAULT_SIZE = 10.0;
	
    private Colour colour;
    private Double fontSize;
    protected String name;
    
    private String text;


	public Text(String text) {
       this.text = text;
       fontSize = DEFAULT_SIZE;
	}
	
	public void shrink (double y) throws SizeFactorException{
		if (y<LIMIT) 
				throw new SizeFactorException();
		
	}
	public void enlarge(double x) throws SizeFactorException{
		if (x<LIMIT) {
			throw new SizeFactorException();
			}
	}

	public Double getFontSize(){
		return fontSize;
	}
	
	public void setColour(String s){
		colour = new Colour(s);
	}
	
	public void setText(String newText){
		text = newText;
	}
	
	public String getText(){
		return text ;
	}
	
	@Override
	public String toString(){
		return (text);
	}

       
}

