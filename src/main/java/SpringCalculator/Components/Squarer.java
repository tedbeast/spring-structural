package SpringCalculator.Components;

/**
 * TODO: Modify this class so that it functions as a component within the Spring Framework.
 *
 * The current functionality of the Application requires the "Squarer" class to be retrieved from the Application
 * Context - which you can think of as the current pool of usable Spring Beans. In order for this class to be contained
 * within the Application Context, several things need to happen:
 *
 * 1, this class needs to be declared a Component using the @Component annotation.
 * 2, the configuration of this class should be provided using the @Bean annotation in the Configuration class,
 * which in this case is Application.java.
 * 3, because this class is dependent on Multiplier, a Multiplier bean should be Autowired into this class. Look into
 * how the Multiplier can be autowired in (there are 3 different ways!)
 *
 * Refer to the other classes on how to accomplish these 3 things!
 */
public class Squarer {
    Multiplier multiplier;

    public Squarer(Multiplier multiplier){
        this.multiplier = multiplier;
    }

    /**
     * Leverage the Multiplier dependency to multiply a value with itself.
     * This will only work if Multiplier was successfully autowired into this class.
     * @param value some number
     * @return value^2
     */
    public double getSquare(double value){
        return multiplier.multiply(value, value);
    }
}
