

public interface Resizable {
	
	public static final double LIMIT = 1.0;
	public void shrink (double y) throws SizeFactorException;
	
	public void enlarge(double x) throws SizeFactorException;
	



}
