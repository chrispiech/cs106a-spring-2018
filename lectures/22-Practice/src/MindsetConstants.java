

public interface MindsetConstants {

/** The width of the application window */
	public static final int APPLICATION_WIDTH = 800;

/** The height of the application window */
	public static final int APPLICATION_HEIGHT = 600;


/** The first year in the database */
	public static final int START_YEAR = 1800;

/** The last year in the database */
	public static final int END_YEAR= 2015;
	
/** The number of years */
	public static final int N_YEARS = END_YEAR - START_YEAR + 1;
	
	public static final int MAX_LIFE = 70;
	public static final int MAX_GDP = (int) Math.log(10000);
	
	public static final int MIN_LIFE = 20;
	public static final int MIN_GDP = (int) Math.log(400);
	
	public static final int X_AXIS_OFFSET = 70;
	public static final int Y_AXIS_OFFSET = 50;
	public static final int COUNTRY_LABEL_Y = APPLICATION_HEIGHT - 100;
	
	public static final int DELAY = 50;
}
