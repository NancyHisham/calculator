import com.google.common.base.Strings;

public class Calculator {

    /**
     */
    private final String name;

    /**
     * This is the java documentation.
     * @param name
     */
    public Calculator(final String name) {
        if (Strings.isNullOrEmpty(name)) {
            this.name = "Standard";
        } else {
            this.name = name;
        }
    }

    /**
     * This is java documentation.
     * @param x documentation
     * @param y documentation
     * @return the sum.
     */
    public int add(final int x, final int y) {
        if (x < 0 || y < 0) {
            throw new RuntimeException("wrong");
        }

        return x + y;
    }

    /**
     * This is java documentation for subtraction.
     * @param x
     * @param y
     * @return the subtraction.
     */
    public int subtract(final int x, final int y) {
        return x - y;
    }
    /**
     * This is java documentation for division.
     * @param x
     * @param y
     * @return the division.
     */
    public int division(final int x, final int y) {
    	 if (y==0) {
             throw new RuntimeException("wrong");
         }

         return x / y;
    }
    /**
     * This is java documentation for multiplication.
     * @param x
     * @param y
     * @return the multiplication.
     */
    public int multiplication(final int x, final int y) {
         return x * y;
    }
    
    /**
     * This is java doc.
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * This is a java doc.
     * @param args
     */
    public static void main(final String[] args) {
        Calculator cal = new Calculator("Mohamed");
        System.out.println(cal.toString());
        System.out.println(cal.add(4, 6));
    }
}