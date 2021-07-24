package by.tc.task01.repository;

import java.sql.SQLException;



    public class Speakers extends BaseTable implements TableOperations{

        public Speakers() throws SQLException {
            super("speakers_table");
        }

        @Override
        public void createTable() throws SQLException {
            super.executeSqlStatement("CREATE TABLE IF NOT EXISTS speakers_table("+
                    "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                    "PowerConsumption SMALLINT NOT NULL," +
                    "NumberOfSpeakers SMALLINT NOT NULL,"+
                    "FrequencyRange NVARCHAR NOT NULL," +
                    "CordLength REAL NOT NULL" +
                    ")",  "Создана таблица " + tableName);



        }


        @Override
        public void createForeignKeys() throws SQLException {
            //super.executeSqlStatement();
         /*   super.executeSqlStatement(" ALTER TABLE laptop_table ADD FOREIGN KEY (id) REFERENCES laptop(id)",
                    "Cоздан внешний ключ appliance.laptop -> appliance.id");*/
        }

        @Override
        public void createExtraConstraints() throws SQLException {

        }
    }




