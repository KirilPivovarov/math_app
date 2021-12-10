package ua.com.math;

public class MathExc {

    private static final double GRAVITATIONAL_ACCELERATION = 9.80665;

    public double getFlightDistanceDegree(double startingSpeed, double angle){
        double result = ((startingSpeed * startingSpeed) * Math.sin(Math.toRadians(2 * angle))) / GRAVITATIONAL_ACCELERATION;
        return result;
    }

    public double getFlightDistanceRad(double startingSpeed, double angle){
        double result = ((startingSpeed * startingSpeed) * Math.sin(2 * angle)) / GRAVITATIONAL_ACCELERATION;
        return result;
    }

    public double getDistanceBtwCars(double speedCar1, double speedCar2, double initialDistance, double time){
        double endDistance = initialDistance + speedCar1 * time + speedCar2 * time;
        return endDistance;
    }

    public int findOutIfPointInFigure(double coordinateX, double coordinateY){
        int isPointInFigure;
        if(((coordinateX >= 0) && (coordinateY >= 1.5 * coordinateX - 1) && (coordinateY <= coordinateX)) ||
                ((coordinateX <= 0) && (coordinateY >= -1.5 * coordinateX - 1) && (coordinateY <= -coordinateX))){
            isPointInFigure = 1;
        }
        else{
            isPointInFigure = 0;
        }
        return isPointInFigure;
    }

    public double getValueOfExpressionTaskFour(double x){
        double result;
        double valueOfFirstItem;
        double valueOfSecondItem;
        double numeratorOfFirstItem = 6 * Math.log1p(Math.pow(Math.E, x + 1) + 2 * Math.pow(Math.E, x) * Math.cos(x));
        double denominatorOfFirstItem = Math.log1p(x - Math.pow(Math.E, x + 1) * Math.sin(x));
        double numeratorOfSecondItem = Math.cos(x);
        double denominatorOfSecondItem = Math.pow(Math.E, Math.sin(x));
        valueOfFirstItem = numeratorOfFirstItem / denominatorOfFirstItem;
        valueOfSecondItem = Math.abs(numeratorOfSecondItem / denominatorOfSecondItem);
        result = valueOfFirstItem + valueOfSecondItem;
        return result;
    }

}
