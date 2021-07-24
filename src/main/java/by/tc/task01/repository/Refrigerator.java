package by.tc.task01.repository;

import java.sql.SQLException;




    public class Refrigerator extends BaseTable implements TableOperations{

        public Refrigerator() throws SQLException {
            super("refrigerator_table");
        }

        @Override
        public void createTable() throws SQLException {
            super.executeSqlStatement("CREATE TABLE IF NOT EXISTS refrigerator_table("+
                    "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                    "PowerConsumption SMALLINT NOT NULL," +
                    "Weight REAL NOT NULL,"+
                    "FreezerCapacity SMALLINT NOT NULL,"+
                    "OverallCapacity SMALLINT NOT NULL," +
                    "Height REAL NOT NULL," +
                    "Width REAL NOT NULL" +
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


