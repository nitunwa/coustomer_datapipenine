package datapipeline.costomer_etl.dataWriter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWriter<T> implements DataWriter<T> {

	public void writeData(String outputPath, T[] dataList) {
		ObjectMapper jmapper = new ObjectMapper();
		try{
			jmapper.writeValue(new File(outputPath), dataList);
		}
		catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
