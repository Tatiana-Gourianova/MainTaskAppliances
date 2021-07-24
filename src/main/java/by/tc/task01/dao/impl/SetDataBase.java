package by.tc.task01.dao.impl;

import by.tc.task01.ExchangeDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static by.tc.task01.ExchangeDB.DB_URL;

public class SetDataBase {
        public List<String> ReadenLines;
        public SetDataBase(ApplianceReader readFromFile) throws SQLException, ClassNotFoundException {


            List<String> allLines = readFromFile.takeAll();

            ExchangeDB db = new ExchangeDB();
            db.createTablesAndForeignKeys();

            db.setExchangeDB();
            String sql = "INSERT INTO speakers_table ( PowerConsumption, NumberOfSpeakers, FrequencyRange,CordLength) VALUES (6,7,8,9)";
//c id нестыковка
            try (Connection connection = DriverManager.getConnection(DB_URL)) {
                Statement statement = connection.createStatement();


                int rowsAffected = statement.executeUpdate(sql);
                sql = "INSERT INTO speakers_table ( PowerConsumption, NumberOfSpeakers, FrequencyRange,CordLength) VALUES (443,3,4,5)";
                rowsAffected = rowsAffected + statement.executeUpdate(sql);
                System.out.println(rowsAffected + "!?!!");
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }
    public List<String> GetDataBase(){
        return ReadenLines;
    }

    }


