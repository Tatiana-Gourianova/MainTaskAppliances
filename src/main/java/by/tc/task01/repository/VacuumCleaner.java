package by.tc.task01.repository;

import java.sql.SQLException;

    public class VacuumCleaner extends BaseTable implements TableOperations{

        public VacuumCleaner() throws SQLException {
            super("vacuumCleaner_table");
        }

        @Override
        public void createTable() throws SQLException {
            super.executeSqlStatement("CREATE TABLE IF NOT EXISTS vacuumCleaner_table("+
                    "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                    "PowerConsumption SMALLINT NOT NULL," +
                    "FilterType NVARCHAR NOT NULL," +
                    "BagType NVARCHAR NOT NULL," +
                    "WandType NVARCHAR NOT NULL," +
                    "MotorSpeedRegulation SMALLINT NOT NULL," +
                    "CleaningWidth SMALLINT NOT NULL," +
                    ")", "vacuumCleaner " + tableName);


        }
        @Override
        public void createForeignKeys() throws SQLException {

        /*    super.executeSqlStatement(" ALTER TABLE vacuumCleaner_table ADD FOREIGN KEY (WandType) REFERENCES laptop(WandType)",
                    "Cоздан внешний ключ appliance.WandType -> appliance.id");
        */}

        @Override
        public void createExtraConstraints() throws SQLException {

        }
    }


