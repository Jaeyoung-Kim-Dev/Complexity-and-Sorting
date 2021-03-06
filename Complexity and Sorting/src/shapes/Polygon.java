package shapes;

/**
 * Base Polygon shape
 * 
 * @author Jaeyoung Kim
 *
 */
public abstract class Polygon implements Comparable<Polygon> {
	private double height;
	private double volume;
	private double baseArea;
		
	/**
	 * @param height polygon's height
	 */
	public Polygon(double height) {
		this.height = height;
	}

	/**
	 * Get the height
	 * 
	 * @return the height
	 */
	public double getHeight() {
		return this.height;
	}
	
	/**
	 * Get the volume
	 * 
	 * @return the volume
	 */
	public double getVolume() {
		return this.volume;
	}
	
	/**
	 * Get the base area
	 * 
	 * @return the base area
	 */
	public double getBaseArea() {
		return this.baseArea;
	}
	
	@Override
	public int compareTo(Polygon o) {
		double difference = this.height - o.height;
		if (difference < 0) {
			return 1;
		} else if (difference > 0) {
			return -1;
		} else // this.height == o.height
		{
			return 0;
		}
	}
}
