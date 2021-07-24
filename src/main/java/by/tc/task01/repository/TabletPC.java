package by.tc.task01.repository;


import java.sql.SQLException;

public class TabletPC extends BaseTable implements TableOperations{

    public TabletPC() throws SQLException {
        super("tabletPC_table");
    }

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS tabletPC_table("+
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "BatteryCapacity SMALLINT NOT NULL," +
                "DisplayInchs SMALLINT NOT NULL," +
                "MemoryRom SMALLINT NOT NULL," +
                "FlashMemoryCapacity SMALLINT NOT NULL," +
                "Color NVARCHAR NOT NULL" +
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
