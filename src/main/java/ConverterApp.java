public class ConverterApp {
    void main() {

        // My first commit

        IO.println("""
                ==================================
                      LEXICON CONVERTER APP
                ==================================
                1. Currency Converter
                2. Weight Converter
                3. Grade Converter
                4. Exit
                ==================================
                """);

        int choice;
        String answer;

        do {
            String input = IO.readln("Enter your choice: ");
            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    IO.println("Currency Converter selected.");

                // Currency Converter

                double sek = Double.parseDouble(IO.readln("Enter amount in SEK: "));

                double usd = sek / 10.87;
                double eur = sek / 11.32;

                IO.println("USD: %2f".formatted(usd));
                IO.println("EUR: %2f".formatted(eur));
                IO.println("==================================");

                break;

                case 2:
                    IO.println("Weight Converter selected.");

                    // Weight Converter

                    double kg = Double.parseDouble(IO.readln("Enter weight in kilograms: "));

                    double grams = kg * 1000;
                    double pounds = kg * 2.20462;

                    IO.println("Grams: %.3f".formatted(grams));
                    IO.println("Pounds: %.3f".formatted(pounds));
                    IO.println("==================================");

                    break;

                case 3:
                    IO.println("Grade Converter selected.");
                    break;
                default:
                    IO.println("Invalid choice. Please select 1-3.");
                    IO.println("==================================");
            }

            answer = IO.readln("Continue? (yes/no): ");
            IO.println("==================================");

        } while (answer.equalsIgnoreCase("yes"));

        IO.println("Thank you for using Lexicon Converter App!");
        IO.println("==================================");


            IO.println();



    }

}
        //outside class,

