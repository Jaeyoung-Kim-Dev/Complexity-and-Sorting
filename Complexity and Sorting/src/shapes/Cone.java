/**
 * 
 */
package shapes;

/**
 * Cone shape
 * 
 * @author Jaeyoung Kim
 *
 */
public class Cone extends Polygon {
	private double radius;
	
	/**
	 * User-defined constructor for Cone
	 * 
	 * @param height cone's height
	 * @param radius cone's radius
	 */
	public Cone(double height, double radius) {
		super(height);		
		this.radius = radius;
	}

	/**
	 * Get the volume
	 * 
	 * @return the volume
	 */
	@Override
	public double getVolume() {
		return getBaseArea() * this.getHeight() / 3;
	}
	
	/**
	 * Get the base area
	 * 
	 * @return the base area
	 */
	@Override
	public double getBaseArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}	
}
