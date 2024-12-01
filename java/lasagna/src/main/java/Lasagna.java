public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method

    public static int expectedMinutesInOven() {
        return 40;
    }

    public static int remainingMinutesInOven(int minutesPassed) {
        return expectedMinutesInOven() - minutesPassed;
    }

    public static int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public static int totalTimeInMinutes(int numberOfLayers, int minutesPassed) {
        return preparationTimeInMinutes(numberOfLayers) + minutesPassed;
    }
}
