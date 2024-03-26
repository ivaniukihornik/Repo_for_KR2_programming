// Variant 7 - Gravity Force (F=mg)
class Forces {

    public static Object calculateGravityForce(double m) {
        double g = 9.81; // gravity of Earth constant
        return m * g;
    }

    public static void main(String[] args) {
        double mass = 10.11; // enter the value of mass in kilograms
        System.out.println("The gravity force for mass " + mass + " kg is: " +
                calculateGravityForce(mass) + " H");
    }

}

