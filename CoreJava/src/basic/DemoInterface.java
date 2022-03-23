/**
 * 
 */
package basic;

/**
 * @author sarve
 *
 */
@FunctionalInterface
public interface DemoInterface {
	public void Accelarate();

	public default void brake() {
		
	}
	public default void clutch() {
		
	}
	static void drivetrain() {
		
	}
	static void drivetrain2() {
		
	}
	@Override
	int hashCode();

}
