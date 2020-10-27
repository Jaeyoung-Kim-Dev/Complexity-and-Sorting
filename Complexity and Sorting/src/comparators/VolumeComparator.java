package comparators;

import java.util.*;

import shapes.Polygon;

/**
 * Volume Comparator
 * 
 * @author Jaeyoung Kim
 *
 */
public class VolumeComparator implements Comparator<Polygon> {
	public int compare(Polygon a, Polygon b) {
		if (a.getVolume() < b.getVolume()) {
			return 1;
		} else if (a.getVolume() > b.getVolume()) {
			return -1;
		} else // a.getVolume() == b.getVolume()
		{
			return 0;
		}
	}
}