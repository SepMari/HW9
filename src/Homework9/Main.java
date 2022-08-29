package Homework9;

public class Main {

    public static void main(String[] args) {
        var nesbo = new Author("Jo Nesbo");
        Book snowman = new Book(0, "Snowman", 2019, nesbo);

        System.out.println(snowman);

        snowman.setYearPublisher(2022);
        System.out.println("Перевыпуск публикаци в " + snowman.getYearPublisher() + " году");

        var remark = new Author("Remark");
        Book blackObelisk = new Book(1, "Black Obelisk", 1956, remark);

        System.out.println(blackObelisk);

        //Вывод значений hashCode && equals
        System.out.println(nesbo.hashCode() == remark.hashCode());
        System.out.println(nesbo.equals(remark));
    }

}

/*
1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
3. Написать конструкторы для обоих классов, заполняющие все поля.
4. Создать геттеры для всех полей автора и всех полей книги.
5. Создать сеттер для поля «Год публикации» у книги.
6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух)
и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.

    Метод main не должен находиться в классах Book и Author.

    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.

7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

Задание 10й урок:
Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.
 */