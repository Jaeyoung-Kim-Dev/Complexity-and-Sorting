package controllers;

import java.util.*;

/**
 * Base Controller
 * 
 * @author Jaeyoung Kim
 *
 */
public abstract class Controller {
    public abstract void sort(Comparable[] items, Comparator comparator); 
}