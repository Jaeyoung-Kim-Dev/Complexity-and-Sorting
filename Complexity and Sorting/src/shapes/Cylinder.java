/**
 * 
 */
package shapes;

/**
 * @author Jaeyoung Kim
 *
 */
public class Cylinder extends Polygon {	
	private double radius;
	
	/**
	 * User-defined constructor for Cylinder
	 * 
	 * @param height
	 * @param radius
	 */
	public Cylinder(double height, double radius) {
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
		return Math.PI * Math.pow(this.radius, 2) * this.getHeight();
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
