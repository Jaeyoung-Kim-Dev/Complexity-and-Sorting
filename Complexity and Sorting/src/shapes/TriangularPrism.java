/**
 * 
 */
package shapes;

/**
 * Triangular Prism shape
 * 
 * @author Jaeyoung Kim
 *
 */
public class TriangularPrism extends Polygon {
	private double edgeLength;
	
	/**
	 * User-defined constructor for TrianglarPrism
	 * 
	 * @param height Triangular prism's height
	 * @param edgeLength Triangular prism's edge length
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
		return getBaseArea() * this.getHeight();
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
