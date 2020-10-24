package problemdomain;

public abstract class Polygon implements Comparable<Polygon> {
	private double height;
	
	@Override
	public int compareTo(Polygon o) {
		double difference = this.height - o.height;
		return (int) difference;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return this.height;
	}
	
	

}
