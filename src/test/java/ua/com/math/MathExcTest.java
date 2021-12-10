package ua.com.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MathExcTest {

        private final MathExc mathExc = new MathExc();

    static Arguments[] getFlightDistanceDegreeTestArg() {
        return new Arguments[] {
                Arguments.arguments(2, 3, 0.04263574748467763),
                Arguments.arguments(5, 6, 0.5300273049863087),
                Arguments.arguments(1, 4, 0.014191706745939281)
        };
    }
    static Arguments[] getFlightDistanceRadTestArg() {
        return new Arguments[] {
                Arguments.arguments(2, 3,-0.11396980546829993),
                Arguments.arguments(5, 6, -1.3678802598247999),
                Arguments.arguments(1, 4, 0.10088646445252782)
        };
    }
    static Arguments[]  getDistanceBtwCarsTestArg() {
        return new Arguments[] {
                Arguments.arguments(4, 7, 40, 10,150),
                Arguments.arguments(5, 6, 56, 78,914),
                Arguments.arguments(1, 4, 0, 34, 170),
                Arguments.arguments(1, 4, 34, 0, 34)
        };
    }

    static Arguments[]  findOutIfPointInFigureTestArg() {
        return new Arguments[]{
                Arguments.arguments(4, 5, -0.887595435161846),
                Arguments.arguments(5, 6, -1.3678802598247999),
                Arguments.arguments(1, 4, 0.10088646445252782),
                Arguments.arguments(1, 7, 0.10101383812972528)
        };
    }
        static Arguments[]  getValueOfExpressionTaskFourTestArg() {
            return new Arguments[] {
                    Arguments.arguments(4, 6.879818859970845),
                    Arguments.arguments(5, 6.959165181327739),
                    Arguments.arguments(4.5,6.3816749029715725),
                    Arguments.arguments(4.6, 6.199926981528159)
            };
        }

    @ParameterizedTest
    @MethodSource("getFlightDistanceDegreeTestArg")
    public void getFlightDistanceDegreeTest(double speed,  double angle, double result) {
        Assertions.assertEquals(mathExc.getFlightDistanceDegree(speed,angle), result);
    }

    @ParameterizedTest
    @MethodSource("getFlightDistanceRadTestArg")
    void getFlightDistanceRadTest(double speed,  double angle, double result) {
        Assertions.assertEquals(mathExc.getFlightDistanceRad(speed,angle), result);
    }

    @ParameterizedTest
    @MethodSource("getDistanceBtwCarsTestArg")
    void getDistanceBtwCarsTest(double speedOne, double speedTwo, double distance, double time, double result) {
        Assertions.assertEquals(mathExc.getDistanceBtwCars(speedOne, speedTwo, distance, time), result);
    }

    @ParameterizedTest
    @MethodSource("findOutIfPointInFigureTestArg")
    void findOutIfPointInFigureTest(double x, double y, double result) {
        Assertions.assertEquals(mathExc.getFlightDistanceRad(x, y), result);
    }

    @ParameterizedTest
    @MethodSource("getValueOfExpressionTaskFourTestArg")
    void getValueOfExpressionTaskFourTest(double x, double result) {
        Assertions.assertEquals(mathExc.getValueOfExpressionTaskFour(x), result);
    }
}