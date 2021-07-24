package by.tc.task01.repository;

import java.sql.SQLException;

//https://github.com/SadykovMR/jdbc-start/tree/26180844f31928c7fcda610f3b4e5c0245a4a9f2/src/sql/demo/repository


   public class Oven extends BaseTable implements TableOperations{

        public Oven() throws SQLException {
            super("oven_table");
        }

        @Override
        public void createTable() throws SQLException {
           super.executeSqlStatement("CREATE TABLE IF NOT EXISTS oven_table("+
                    "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                    "PowerConsumption SMALLINT NOT NULL," +
                    "Weight REAL NOT NULL,"+
                    "Capacity REAL NOT NULL,"+
                    "Depth REAL NOT NULL," +
                    "Height REAL NOT NULL," +
                    "Width REAL NOT NULL" +
                    ")",  "Создана таблица " + tableName);

        }
        @Override
        public void createForeignKeys() throws SQLException {
           super.executeSqlStatement(" ALTER TABLE oven_table ADD FOREIGN KEY (Depth) REFERENCES oven_table(width)",
                    "Cоздан внешний ключ appliance. -> appliance.id");
        }

        @Override
        public void createExtraConstraints() throws SQLException {

        }
    }
