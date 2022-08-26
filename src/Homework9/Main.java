package Homework9;

public class Main {

    public static void main(String[] args) {
        Book snowman = new Book("Snowman", 2019, "Jo Nesbo");

        System.out.println("Имя автора книги - " + snowman.getNameAuthor());
        System.out.println("Год публикации - " + snowman.getYearPublisher());
        System.out.println("Название книги - " + snowman.getNamePublisher());

        snowman.setYearPublisher(2022);
        System.out.println("Перевыпуск публикаци в " + snowman.getYearPublisher() + " году");

        Book blackObelisk = new Book("Black Obelisk", 1956,"Remark");

        System.out.println("Имя автора книги - " + blackObelisk.getNameAuthor());
        System.out.println("Год публикации - " + blackObelisk.getYearPublisher());
        System.out.println("Название книги - " + blackObelisk.getNamePublisher());

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
 */