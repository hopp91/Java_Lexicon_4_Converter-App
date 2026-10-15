public class ConverterApp {
    int choice;
    String answer;


    // CONSTANTS

    // Currency conversion rates (SEK per unit)
    private static final double SEK_USD = 10.87;
    private static final double SEK_EUR = 11.32;

    // Weight conversion rates
    private static final double GRAMS_PER_KG = 1000.0;
    private static final double POUNDS_PER_KG = 2.20462;

    // Score limits
    private static final int MIN_SCORE = 0;
    private static final int MAX_SCORE = 100;

    // Grade thresholds
    private static final int GRADE_A_MIN = 90;
    private static final int GRADE_B_MIN = 80;
    private static final int GRADE_C_MIN = 70;
    private static final int GRADE_D_MIN = 60;

    void main() {

        // CONVERTER APP LAYOUT

        IO.println("""
                ==================================
                      LEXICON CONVERTER APP
                ==================================
                1. Currency Converter
                2. Weight Converter
                3. Grade Converter
                4. Exit
                """);


        do {
            IO.println("==================================");
            String input = IO.readln("Enter your choice: ");
            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    IO.println("Currency Converter selected.");

                    // Currency Converter

                    double sek = Double.parseDouble(IO.readln("Enter amount in SEK: "));

                    double usd = sek / SEK_USD;
                    double eur = sek / SEK_EUR;

                    IO.println("USD: %2f".formatted(usd));
                    IO.println("EUR: %2f".formatted(eur));

                    break;

                case 2:
                    IO.println("Weight Converter selected.");

                    // Weight Converter

                    double kg = Double.parseDouble(IO.readln("Enter weight in kilograms: "));

                    double grams = kg * GRAMS_PER_KG;
                    double pounds = kg * POUNDS_PER_KG;

                    IO.println("Grams: %.3f".formatted(grams));
                    IO.println("Pounds: %.3f".formatted(pounds));

                    break;

                case 3:
                    IO.println("Grade Converter selected.");

                    // Grade Converter

                    IO.println("Enter your score (0-100): ");

                    if (MIN_SCORE < 0 || MAX_SCORE > 100) {
                        IO.println("Invalid score! Enter a score between 0 and 100.");
                    } else if (GRADE_A_MIN >= 90) {
                        IO.println("Grade: A ");
                        IO.println("Label: Excellent ");
                    } else if (GRADE_B_MIN >= 80) {
                        IO.println("Grade: B ");
                        IO.println("Label: Good ");
                    } else if (GRADE_C_MIN >= 70) {
                        IO.println("Grade: C ");
                        IO.println("Label: Pass ");
                    } else if (GRADE_D_MIN >= 60) {
                        IO.println("Grade: D ");
                        IO.println("Label: Below average ");
                    } else {
                        IO.println("Grade: F ");
                        IO.println("Label: Fail ");
                        break;
                    }

                case 4:
                    IO.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                    IO.println("Invalid choice. Please select 1-4.");


            }
                IO.println("==================================");
                answer = IO.readln("Continue? (yes/no): ");

    }
                while ("yes".equalsIgnoreCase(answer));

                IO.println("Thank you for using Lexicon Converter App!");
                IO.println("==================================");



    }

}


