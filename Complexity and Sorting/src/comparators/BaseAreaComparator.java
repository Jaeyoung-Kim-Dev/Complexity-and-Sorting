package comparators;

import java.util.*;

import shapes.Polygon;

/**
 * Base Area Comparator
 * 
 * @author Jaeyoung Kim
 *
 */
public class BaseAreaComparator implements Comparator<Polygon> { 
    public int compare(Polygon a, Polygon b) {
		if (a.getBaseArea() < b.getBaseArea()) {
			return 1;
		} else if (a.getBaseArea() > b.getBaseArea()) {
			return -1;
		} else // a.getBaseArea() == b.getBaseArea()
		{
			return 0;
		}
    }
}