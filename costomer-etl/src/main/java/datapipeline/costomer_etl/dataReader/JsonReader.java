package datapipeline.costomer_etl.dataReader;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader<T> implements DataReader<T> {
	T dataList = null;

	public T readData(String pathFile, Class<T> dataType) {
		ObjectMapper objectMapper = new ObjectMapper();
		
        try{
        	dataList  = objectMapper.readValue(new File(pathFile),dataType);
		}
        catch (IOException e) {
			e.printStackTrace();
		}
		return dataList;
	}

}
