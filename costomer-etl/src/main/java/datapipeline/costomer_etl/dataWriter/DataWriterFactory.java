package datapipeline.costomer_etl.dataWriter;

import datapipeline.costomer_etl.model.DataModel;

public class DataWriterFactory<T extends DataModel> {
	public DataWriter<T> getDataWriter(String writerType) {
		DataWriter<T> writer = null;
		if (writerType.equals("json")) {
			writer = new JsonWriter<T>();
		}
		else if(writerType.equals("xml")){
			writer = new XmlWriter<T>();
		}
		else{
			return null;
			}

		return writer;
	}
}
