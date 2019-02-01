package datapipeline.costomer_etl.dataReader;

public class DataReaderFactory<T> {
	public DataReader<T> getdataReader(String valueType) {
		DataReader<T> reader = null;
		if (valueType.equals("json")) {
			reader = new JsonReader<T>();
		} 
		else if (valueType.equals("json")) {
			reader = new XmlRead<T>();
		} 
		else {
			reader = null;
		}
		return reader;
	}
}
