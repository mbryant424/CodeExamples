package CodeExamples;

/**
 * Each {@code Car} instance maintains information about a {@code Car}.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Car implements java.io.Serializable { // add this when writing an object to a file

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The Exterior Colors defined for Cars.
	 * 
	 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
	 */
	enum ExteriorColor {
		RED, GREEN, BLUE
	}

	/**
	 * The plate number of this {@code Car}.
	 */
	protected String plateNumber;

	/**
	 * The exterior color of this {@code Car}.
	 */
	protected ExteriorColor exteriorColor;

	/**
	 * Constructs a {@code Car} instance.
	 * 
	 * @param plateNumber
	 *            the plate number of the {@code Car}.
	 * @param exteriorColor
	 *            the exterior color of the {@code Car}.
	 */
	public Car(String plateNumber, ExteriorColor exteriorColor) {
		this.plateNumber = plateNumber;
		this.exteriorColor = exteriorColor;
	}

	/**
	 * Returns a string representation of this {@code Car}.
	 * 
	 * @return a string representation of this {@code Car}.
	 */
	public String toString() {
		return "(plate number: " + plateNumber + ", " + "exterior color: " + exteriorColor + ")";
	}

	/**
	 * Returns the plate number of this {@code Car}.
	 * 
	 * @return the plate number of this {@code Car}.
	 */
	public String getPlateNumber() {
		return plateNumber;
	}

	/**
	 * Returns the exterior color of this {@code Car}.
	 * 
	 * @return the exterior color of this {@code Car}.
	 */
	public ExteriorColor getExteriorColor() {
		return exteriorColor;
	}

}