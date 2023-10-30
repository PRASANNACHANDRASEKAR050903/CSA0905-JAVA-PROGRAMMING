 class Geometry {
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double calculateVolume(double radius, double height, boolean isCone) {
        if (isCone) {
            return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        } else {
            return calculateVolume(radius, height); // Calculate volume of a cylinder
        }
    }

    public static void main(String[] args) {
        double circleRadius = 5.0;
        double cylinderRadius = 4.0;
        double cylinderHeight = 6.0;
        double coneRadius = 3.0;
        double coneHeight = 5.0;

        double circleArea = calculateArea(circleRadius);
        double cylinderVolume = calculateVolume(cylinderRadius, cylinderHeight);
        double coneVolume = calculateVolume(coneRadius, coneHeight, true);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Volume of Cylinder: " + cylinderVolume);
        System.out.println("Volume of Cone: " + coneVolume);
    }
}
