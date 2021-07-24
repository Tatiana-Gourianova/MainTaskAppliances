package by.tc.task01.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseIn {

    public static final DatabaseIn HOLDER_DATABASE = new DatabaseIn();

    public static DatabaseIn getDatabaseIn() {

        return DatabaseIn.HOLDER_DATABASE;
    }

    private DatabaseIn() {
        final String DB_URL = "jdbc:h2:E:\\new_doc\\Java\\jwd-task01-template_v2\\db\\exchange";
        final String DB_Driver = "org.h2.Driver";
        try {
            Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД

            Connection connection = DriverManager.getConnection(DB_URL);//соединениесБД
            //System.out.println("Соединение с СУБД выполнено.");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();// обработка ошибки  Class.forName

            //System.out.println("JDBC драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection

            //   System.out.println("Ошибка SQL !");
        }
    }

    public String query(String userQuery) {
        // Все запросы к базе данных будут проходить через этот
        // метод. Поэтому имеет смысл поместить сюда какую-то
        // логику кеширования.
        // ...
//!!!!!!!!!!!!!!!!!!!!!!!! дописать
        String responseQuery = "";
        DatabaseIn database = DatabaseIn.getDatabaseIn();

        //      database.query("SELECT ...")
        // ...
        //    Database bar = Database.getInstance()
        //  bar.query("SELECT ...")
        // Переменная "bar" содержит тот же объект, что и
        // переменная "foo".

    return responseQuery;}
}
    /*

***************************************************************

// Класс одиночки определяет статический метод `getInstance`,
// который позволяет клиентам повторно использовать одно и то же
// подключение к базе данных по всей программе.
class Database is
    // Поле для хранения объекта-одиночки должно быть объявлено
    // статичным.
    private static field instance: Database

    // Конструктор одиночки всегда должен оставаться приватным,
    // чтобы клиенты не могли самостоятельно создавать
    // экземпляры этого класса через оператор `new`.
    private constructor Database() is
        // Здесь может жить код инициализации подключения к
        // серверу баз данных.
        // ...

    // Основной статический метод одиночки служит альтернативой
    // конструктору и является точкой доступа к экземпляру этого
    // класса.
    public static method getInstance() is
        if (Database.instance == null) then
            acquireThreadLock() and then
                // На всякий случай ещё раз проверим, не был ли
                // объект создан другим потоком, пока текущий
                // ждал освобождения блокировки.
                if (Database.instance == null) then
                    Database.instance = new Database()
        return Database.instance

    // Наконец, любой класс одиночки должен иметь какую-то
    // полезную функциональность, которую клиенты будут
    // запускать через полученный объект одиночки.
    public method query(sql) is
        // Все запросы к базе данных будут проходить через этот
        // метод. Поэтому имеет смысл поместить сюда какую-то
        // логику кеширования.
        // ...

class Application is
    method main() is
        Database foo = Database.getInstance()
        foo.query("SELECT ...")
        // ...
        Database bar = Database.getInstance()
        bar.query("SELECT ...")
        // Переменная "bar" содержит тот же объект, что и
        // переменная "foo".



    public static final String DB_URL = "jdbc:h2:E:\\new_doc\\Java\\jwd-task01-template_v2\\db\\exchange";
    public static final String DB_Driver = "org.h2.Driver";

    public void  setExchangeDB(){

        try {
            Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД

            Connection connection = DriverManager.getConnection(DB_URL);//соединениесБД
            System.out.println("Соединение с СУБД выполнено.");
            connection.close();// отключение от БД

            //System.out.println("Отключение от СУБД выполнено.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();// обработка ошибки  Class.forName

            //System.out.println("JDBC драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection

            //   System.out.println("Ошибка SQL !");
        }
    }


*/




