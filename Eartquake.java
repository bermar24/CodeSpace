enum EarthquakeCategory {
    MICRO("Nothing to do, nothing happened"),
    MINOR("If you felt it, you are very sensitive"),
    LIGHT("Ok, that was felt by everyone, but don't worry everything is fine."),
    MODERATE("Thing might be shaking, stay indoor"),
    STRONG("Watch out for falling ceiling tiles"),
    MAJOR("Hide under the table"),
    GREAT("Seek shelter");

    private final String message;

    EarthquakeCategory(String advice) {
        this.message = advice;
    }

    public String getMessage() {
        return message;
    }

    public static EarthquakeCategory fromRichter(double richter) {
        return switch ((int) richter) {
            case 0, 1 -> EarthquakeCategory.MICRO;
            case 2, 3 -> EarthquakeCategory.MINOR;
            case 4 -> EarthquakeCategory.LIGHT;
            case 5 -> EarthquakeCategory.MODERATE;
            case 6 -> EarthquakeCategory.STRONG;
            case 7 -> EarthquakeCategory.MAJOR;
            default -> EarthquakeCategory.GREAT;
        };
    }
}

public class Earthquake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter richter magnitude: ");
        String line = scanner.nextLine();

        double magnitude;
        try {
            magnitude = Double.parseDouble(line);
        } catch (NumberFormatException ignored) {
            System.out.println("Input is not a number");
            return;
        }

        if (magnitude < 0) {
            System.out.println("Magnitude has to be a positive number");
            return;
        }

        EarthquakeCategory category = EarthquakeCategory.fromRichter(magnitude);
        System.out.println(category);
        System.out.println(category.getMessage());

    }
}

