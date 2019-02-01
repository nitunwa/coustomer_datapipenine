package datapipeline.costomer_etl.dataWriter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlWriter<T> implements DataWriter<T> {

	
	public void writeData(String outputPath, T[] dataList) {
		XmlMapper xmapper = new XmlMapper();
		try{
			xmapper.writeValue(new File(outputPath), dataList);
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
