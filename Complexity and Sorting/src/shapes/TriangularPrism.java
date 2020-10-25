/**
 * 
 */
package shapes;

/**
 * @author Jaeyoung Kim
 *
 */
public class TriangularPrism extends Polygon {
	private double edgeLength;
	
	/**
	 * User-defined constructor for TrianglarPrism
	 * 
	 * @param height
	 * @param edgeLength
	 */
	public TriangularPrism(double height, double edgeLength) {
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
		return Math.sqrt(3) / 4 * Math.pow(this.edgeLength, 2) * this.getHeight();
	}
	
	/**
	 * Get the base area
	 * 
	 * @return the base area
	 */
	@Override
	public double getBaseArea() {
		return Math.sqrt(3) / 4 * Math.pow(this.edgeLength, 2);
	}	
}
