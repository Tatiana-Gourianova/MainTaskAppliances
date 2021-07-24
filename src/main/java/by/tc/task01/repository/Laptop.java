package by.tc.task01.repository;

import java.sql.SQLException;

 public class Laptop extends BaseTable implements TableOperations{

        public Laptop() throws SQLException {
            super("laptop_table");
        }

        @Override
        public void createTable() throws SQLException {
            super.executeSqlStatement("CREATE TABLE IF NOT EXISTS oven_table("+
                    "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                    "BatteryCapacity SMALLINT NOT NULL," +
                    "OS SMALLINT NOT NULL,"+
                    "MemoryRom SMALLINT NOT NULL,"+
                    "SystemMemory SMALLINT NOT NULL," +
                    "CPU REAL NOT NULL," +
                    "DisplayInchs SMALLINT NOT NULL" +
                    ")", "Создана таблица " + tableName);


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
