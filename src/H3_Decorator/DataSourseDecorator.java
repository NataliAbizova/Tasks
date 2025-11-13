package H3_Decorator;

public abstract class DataSourseDecorator implements DataSource {
    private DataSource dataSource;

    DataSourseDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String read() {
        return dataSource.read();
    }

    @Override
    public void write(String data) {
        dataSource.write(data);
    }
}
