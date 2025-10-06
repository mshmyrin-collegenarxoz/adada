import java.util.*;

public class FlightBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Шаг 1: Выберите город отправления и назначения.");
        System.out.print("Введите город отправления: ");
        String departureCity = scanner.nextLine();
        System.out.print("Введите город назначения: ");
        String destinationCity = scanner.nextLine();

        System.out.println("\nШаг 2: Выберите дату и время рейса.");
        System.out.print("Введите дату отправления (в формате дд.мм.гггг): ");
        String departureDate = scanner.nextLine();
        System.out.print("Введите время отправления (в формате чч:мм): ");
        String departureTime = scanner.nextLine();

        System.out.println("\nШаг 3: Доступные рейсы и цены.");
        List<String> availableFlights = Arrays.asList(
            "Рейс 1: Москва -> Санкт-Петербург, 10:00, 3000 руб.",
            "Рейс 2: Москва -> Екатеринбург, 12:00, 5000 руб.",
            "Рейс 3: Москва -> Казань, 14:00, 4500 руб."
        );

        for (String flight : availableFlights) {
            System.out.println(flight);
        }

        System.out.println("\nШаг 4: Выберите рейс для покупки.");
        System.out.print("Введите номер рейса для покупки (например, 1, 2 или 3): ");
        int flightChoice = scanner.nextInt();
        scanner.nextLine();

        String chosenFlight = availableFlights.get(flightChoice - 1);
        System.out.println("\nВы выбрали: " + chosenFlight);

        System.out.print("\nВведите ваше имя: ");
        String passengerName = scanner.nextLine();
        System.out.print("Введите номер паспорта: ");
        String passportNumber = scanner.nextLine();

        System.out.println("\nШаг 5: Оплата билета.");
        System.out.print("Введите номер вашей кредитной карты: ");
        String creditCardNumber = scanner.nextLine();
        
        System.out.println("\nПроцесс завершен. Ваш билет успешно куплен!");
        System.out.println("Пассажир: " + passengerName);
        System.out.println("Рейс: " + chosenFlight);
        System.out.println("Оплата прошла успешно. Приятного путешествия!");
    }
}
