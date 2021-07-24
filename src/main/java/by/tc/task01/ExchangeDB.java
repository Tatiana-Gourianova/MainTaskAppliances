package by.tc.task01;



import by.tc.task01.repository.*;


import java.sql.*;
public class ExchangeDB {
        public static final String DB_URL = "jdbc:h2:E:\\Java\\jwd-task01-template_v2\\db\\exchange";
        public static final String DB_Driver = "org.h2.Driver";

        //SBD Tables
        Oven oven;
        Laptop laptop;
        Refrigerator refrigerator;
        Speakers speakers;
        TabletPC tabletPC;
        VacuumCleaner vacuumCleaner;


    // Получить новое соединение с БД
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL);

        }

        // Инициализация
        public ExchangeDB() throws SQLException, ClassNotFoundException { try {
            Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД

            Connection connection = DriverManager.getConnection(DB_URL);//соединениесБД
           // System.out.println("Соединение с СУБД выполнено.");
            connection.close();// отключение от БД

           // System.out.println("Отключение от СУБД выполнено.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();// обработка ошибки  Class.forName

            //System.out.println("JDBC драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection

            //   System.out.println("Ошибка SQL !");
        }


            // Инициализируем таблицы
            //Connection connection =   DriverManager.getConnection(DB_URL);

            //System.out.println("Создана таблица " + statement.getClass().toString());
             //*/

            oven=new Oven();

            laptop=new Laptop();
           // System.out.println("Создана таблица "+laptop.toString());
            refrigerator=new Refrigerator();
            speakers=new Speakers();

            tabletPC=new TabletPC();
            vacuumCleaner=new VacuumCleaner();


        }


        // Создание всех таблиц и ключей между ними
        public void createTablesAndForeignKeys() throws SQLException {
           oven.createTable();
           laptop.createTable();
           refrigerator.createTable();
           speakers.createTable();
           tabletPC.createTable();

        //!!!!!!!!!!!!
        ////    vacuumCleaner.createTable();
         //@@!!!!!!!!!!!!!!!!!   vacuumCleaner.createForeignKeys();
        }

    public void setExchangeDB() {
                try{
                    ExchangeDB ExchangeDB = new ExchangeDB();
                    ExchangeDB.createTablesAndForeignKeys();
                } catch (SQLException e) {
                    e.printStackTrace();
                 //   System.out.println("Ошибка SQL !");
                } catch (ClassNotFoundException e) {
                  //  System.out.println("JDBC драйвер для СУБД не найден!");
                }
            }



  /*  public void Upend(){try {


        Connection connection = DriverManager.getConnection(DB_URL);
        Statement statement = connection.createStatement();

        String sql = "INSERT INTO speakers_table ( PowerConsumption, NumberOfSpeakers, FrequencyRange,CordLength) VALUES (6,7,8,9)";
        int rowsAffected = statement.executeUpdate(sql);
        sql = "INSERT INTO speakers_table ( PowerConsumption, NumberOfSpeakers, FrequencyRange,CordLength) VALUES (443,3,4,5)";
        rowsAffected = rowsAffected+statement.executeUpdate(sql);
        System.out.println(rowsAffected + "!?!!");
        connection.close();
    }catch (SQLException e) {
            e.printStackTrace();
            //   System.out.println("Ошибка SQL !");
        }

    }*/
    }

