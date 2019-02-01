package datapipeline.costomer_etl.dataReader;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlRead<T>  implements DataReader<T>{

	public T readData(String pathFile, Class<T> valuetype) {
		XmlMapper mapper = new XmlMapper();
		T datalist = null ;
		try{
			datalist = mapper.readValue(new File(pathFile), valuetype);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return datalist;
	}

}
