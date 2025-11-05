package H1_task_2;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<Book> allBooks = new ArrayList<Book>(Arrays.asList(
            new Book("Бессмертный, И. А. Системы искусственного интеллекта", 2019, 130),
            new Book("Гниденко, И. Г. Технология разработки программного обеспечения", 2017, 235),
            new Book("Гордеев, С. И. Организация баз данных в 2 ч. Часть 2", 1994, 501),
            new Book("Жмудь, В. А. Моделирование замкнутых систем автоматического управления", 2019, 128),
            new Book("Зыков, С. В. Программирование. Объектно-ориентированный подход", 1999, 155),
            new Book("Иванов, В. М. Интеллектуальные системы 1 издание", 1990, 93),
            new Book("Иванов, В. М. Интеллектуальные системы 2 издание", 1999, 91),
            new Book("Советов, Б. Я. Базы данных : учебник для прикладного бакалавриата", 2019, 420),
            new Book("Трофимов, В. В. Основы алгоритмизации и программирования", 1999, 137),
            new Book("Черткова, Е. А. Статистика. Автоматизация обработки информации", 2017, 195)));

    static String[] nameStudents = {"Иванов", "Петров", "Сидоров", "Кумаров", "Капица",
            "Радд", "Бойко", "Лавров", "Турчин", "Даль"};

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            students.add(new Student(nameStudents[i], addBooks()));
        }

        students.stream().peek(student -> System.out.println(student.toString()))
                .flatMap(student -> student.getBooks()
                        .stream().peek(book -> Collectors.toList()))
                .sorted((book1, book2) -> (book2.getNumberOfPages() - book1.getNumberOfPages()))
                .distinct().filter(book -> book.getPublication() > 2000).limit(3)
                .map(Book::getPublication)
                .filter(publication -> publication == 2017).findFirst()
                .map(publication-> publication == 2017 ? publication : "Такая книга отсутствует")
                .stream().forEach(mes->System.out.println(mes));

    }


    static List<Book> addBooks() {
        List<Book> books = new ArrayList<>();

        Collections.shuffle(allBooks);

        Random random = new Random();
        int min = 5;
        int max = 10;
        int randomCount = random.nextInt(max - min + 1) + min;

        for (int i = 0; i < randomCount; i++) {
            books.add(allBooks.get(i));
        }
        return books;
    }
}