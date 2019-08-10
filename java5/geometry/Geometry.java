


public class Geometry {
	
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3.0, 4.0, 5.0, 6.0, "R1", new Colour("Black"));
        Circle c1 = new Circle (13.0, 14.0, 15.0, "C1",new Colour ("Green"));
        System.out.println("\nHere are the original values in r1:");
        System.out.println(r1);
        System.out.println("\nHere are the original values in c1:");
        System.out.println(c1);
        
		Rectangle r2 = new Rectangle(23.0, 24.0, 25.0, 26.0, "R2", new Colour("Black"));
        Circle c2 = new Circle (33.0, 34.0, 35.0, "C2", new Colour("Yellow"));
        System.out.println("\nHere are the original values in r2:");
        System.out.println(r2);
        System.out.println("Here are the original values in c2:");
        System.out.println(c2);
        
		Prism p1 = new Prism(43.0, 44.0, 45.0, 46.0, 47.0, "P1", new Colour("White"));
        Prism p2 = new Prism (53.0, 54.0, 55.0, 56.0, 57.0, "P2", new Colour("Gray"));
        System.out.println("\nHere are the original values in p1:");
        System.out.println(p1);
        System.out.println("\nHere are the original values in p2:");
        System.out.println(p2);
        
// THE FOLLOWING CODE SEGMENT MUST BE UNCOMMENTED ONLY FOR EXERCISE 1 in Lab 6
// EXERCISE_1_BEGINS

       System.out.println("\n\nMaking r1 copy of r2, c1 copy of c2, p1 copy of p2:");
   //   r1 = r2;
   //  c1 = c2;
   // p1 = p2;
       
        r2.set_length(1000.0);
        r2.getOrigin().setx(88.0);
        r2.getOrigin().sety(99.0);
        r2.name.setText("");
        c2.set_radius(2000.00);
        c2.getOrigin().setx(188.0);
        c2.getOrigin().sety(199.0);
       c2.name.setText("");
        p2.set_height(3000.0);
       p2.getOrigin().setx(88.0);
       p2.getOrigin().sety(99.0);
        p2.name.setText("");
        

        try {
       r1 =  (Rectangle) r2.clone();
        c1 = (Circle) c2.clone(); 
        p1 = (Prism) p2.clone();}
        catch(CloneNotSupportedException e){
        	System.out.println("Can not clone Rectangle r2");
        }
        
        
        
        System.out.println("\nHere are values for r1 after trying to make it a copy of r2:");
        System.out.println(r1);
        System.out.println("\nHere are values for c1 after trying to make it a copy of c2:");
       System.out.println(c1);  
       System.out.println("\nHere are values for p1 after trying to make it a copy of p2:");
       System.out.println(p1); 

// EXERCISE_1_ENDS

        
// THE FOLLOWING CODE SEGMENT MUST BE UNCOMMENTED ONLY FOR EXERCISE 2 in Lab 6
// EXERCISE_2_BEGINS

        try{

        	  r1.enlarge(2.0);
        	  r1.name.enlarge(3.0);
        	  c1.shrink(2.0);
        	  p1.enlarge(0.5);
        } catch(SizeFactorException e){
        	System.out.println(e.getMessage());
        	
        }
      
        System.out.println("\nHere are values for r1 after calling enlarge(2.0):");
        System.out.println(r1);
        System.out.println("\nHere is the font size for r1.name after calling enlarge(3.0):");
        System.out.println(r1.name.getFontSize());
        System.out.println("\nHere are values for c1 after calling shrink (2.0):");
        System.out.println(c1);
        System.out.println("\nHere are values for p1 after calling shrink (0.5):");
        System.out.println(p1);
 
        try{
        	  p1.enlarge(0.5);
        } catch(SizeFactorException e){
        	System.out.println(e.getMessage());
        	
        }
      
        System.out.println("\nHere are values for p1 after calling shrink (0.5) -- UNCHANGED:");
        System.out.println(p1); 
 

               
	}
}
