package datapipeline.costomer_etl.dataReader;

public interface DataReader<T> {
public T readData(String pathFile, Class<T> valuetype);
}
