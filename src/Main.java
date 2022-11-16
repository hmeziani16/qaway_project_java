import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valeurCelsius, resultInCelsius, valeurFahrenheit, resultInFahrenheit;
        char option = ' ', answer = ' ';

        System.out.println("----------------------------------------------------------------");
        System.out.println("-----------------------Welcome----------------------------------");
        System.out.println("----------Celsius-Fahrenheit/Fahrenheit-Celsius converter-------\n");

        System.out.println( "\n" +
                "Choose the conversion mode:\n" +
                "1- Celsius-Fahrenheit\n" +
                "2- Fahrenheit-Celsius");
        option = scanner.next().charAt(0);

            if (option == '1') {

                System.out.println("Enter your value in celsius : ");
                valeurCelsius =scanner.nextDouble();
                resultInFahrenheit=( valeurCelsius*9 / 5)+(32);
                System.out.println("Your value in fahrenheit is : " + resultInFahrenheit + "°F");
                System.out.println("               ");
                System.out.println("\n"+
                        "Do you want to convert other values ?\n" +
                        "/If Yes type any key\n" +
                        "/To finish the programme type N");
                answer= scanner.next().charAt(0);
                if (answer == 'N' && answer == 'n')  {
                    System.out.println("------------Goodbye!------------------");
                    System.out.println("------------See you soon--------------");

                }

            }
            else if (option == '2') {
                System.out.println("enter your value in fahrenheit : ");
                valeurFahrenheit =scanner.nextDouble();
                resultInCelsius=( valeurFahrenheit- 32)*5/9;
                System.out.println("your value in Celsius is : " +resultInCelsius+ "°C");
                System.out.println("               ");
                System.out.println("\n"+
                        "Do you want to convert other values ?\n" +
                        "/If Yes type any key\n" +
                        "/To finish the programme type N");
                answer= scanner.next().charAt(0);
                if (answer == 'N' && answer == 'n')  {
                    System.out.println("------------Goodbye!------------------");
                    System.out.println("------------See you soon--------------");

                }
                answer = scanner.next().charAt(0);

            }
            else  {

                System.out.println("Choose 1 or 2 ");
                option = scanner.next().charAt(0);
            }
          while (answer != 'N' && answer != 'n') {
              System.out.println( "\n" +
                      "Choose the conversion mode:\n" +
                      "1- Celsius-Fahrenheit\n" +
                      "2- Fahrenheit-Celsius");
              option = scanner.next().charAt(0);

              if (option == '1') {

                  System.out.println("Enter your value in celsius : ");
                  valeurCelsius =scanner.nextDouble();
                  resultInFahrenheit=( valeurCelsius*9 / 5)+(32);
                  System.out.println("Your value in fahrenheit is : " + resultInFahrenheit+ "°F");
                  System.out.println("               ");
                  System.out.println("\n"+
                          "Do you want to convert other values ?\n" +
                          "/If Yes type any key\n" +
                          "/To finish the programme type N");
                  answer= scanner.next().charAt(0);
                  if (answer == 'N')  {
                      System.out.println("------------Goodbye!------------------");
                      System.out.println("------------See you soon--------------");
                  }
              }
              else if (option == '2') {
                  System.out.println("Enter your value in Fahrenheit : ");
                  valeurFahrenheit =scanner.nextDouble();
                  resultInCelsius=( valeurFahrenheit- 32)*5/9;
                  System.out.println("Your value in Celsius is : " +resultInCelsius+ "°C");
                  System.out.println("               ");
                  System.out.println("\n"+
                          "Do you want to convert other values ?\n"+
                          "/If Yes type any key\n"+
                          "/To finish the programme type N");
                  answer= scanner.next().charAt(0);
                  if (answer == 'N')  {
                      System.out.println("------------Goodbye!------------------");
                      System.out.println("------------See you soon--------------");
                  }
              }
        }
    }
}