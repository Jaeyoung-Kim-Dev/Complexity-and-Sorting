/**
 * 
 */
package shapes;

/**
 * @author Jaeyoung Kim
 *
 */
public class PentagonalPrism extends Polygon {
	private double edgeLength;
	
	/**
	 * User-defined constructor for PentagonalPrism
	 * 
	 * @param height
	 * @param edgeLength
	 */
	public PentagonalPrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}
	
	/**
	 * Get the volume
	 * 
	 * @return the volume
	 */
	@Override
	public double getVolume() {
		return Math.sqrt(( 5 + 2 * Math.sqrt(5) ) * 5) / 4 * Math.pow(this.edgeLength, 2) * this.getHeight();
	}
	
	/**
	 * Get the base area
	 * 
	 * @return the base area
	 */
	@Override
	public double getBaseArea() {
		return Math.sqrt(( 5 + 2 * Math.sqrt(5) ) * 5) / 4 * Math.pow(this.edgeLength, 2);
	}
}
