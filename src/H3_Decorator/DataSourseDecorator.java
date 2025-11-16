package H3_Decorator;

public abstract class DataSourseDecorator implements DataSource {
    private DataSource dataSource;

    DataSourseDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }
}
